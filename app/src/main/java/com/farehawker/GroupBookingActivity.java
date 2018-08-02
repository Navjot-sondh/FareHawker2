package com.farehawker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.farehawker.Adaptors.AppController;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GroupBookingActivity extends AppCompatActivity {
    EditText gorigin_location, gdestination_location, gorigindate, greturndate, gcompany_name, grequested_name, gadult_count, gchild_count, ginfants_count, gtext_email_id, gtext_mobile;
    Button gsubmit;
    Boolean gCheckEditText;
    String goriginHolder, gdestinationdHolder, gorigindateholde, greturndateholder, gadultholder, gchildholder, ginfantsholder, gemailholder, gmobileholder, gcompanyholder, grequestholder;
    String gHttpUrl = "https://www.farehawker.com/mob/ajax/group_form_email.php";
    static final int gDATE_PICKER_origin = 1111;
    static final int gDialog_return = 111;
    private int gdday;
    private int gMmonth;
    private int gyyear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_booking);
        gorigin_location = (EditText) findViewById(R.id.textviewgroup_originselect);
        gdestination_location = (EditText) findViewById(R.id.textviewgroup_destinationselect);
        gcompany_name = (EditText) findViewById(R.id.editgroup_company_name);
        grequested_name = (EditText) findViewById(R.id.editgroup_requestby_name);
        gorigindate = (EditText) findViewById(R.id.textgroup_departure_date);
        greturndate = (EditText) findViewById(R.id.textgroup_Returnd_date);
        gadult_count = (EditText) findViewById(R.id.editgroup_adult_count);
        gchild_count = (EditText) findViewById(R.id.editgroup_child_count);
        ginfants_count = (EditText) findViewById(R.id.editgroup_infants_count);
        gtext_email_id = (EditText) findViewById(R.id.editgroup_email_id);
        gtext_mobile = (EditText) findViewById(R.id.editgroup_mobile_number);
        gsubmit = (Button) findViewById(R.id.buttongroup_submit);
        gorigindate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(gDATE_PICKER_origin);
            }
        });
        greturndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(gDialog_return);
            }
        });
        gsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckEditTextIsEmptyOrNot();
                if (gCheckEditText) {
                    gchildholder = gchild_count.getText().toString().trim();
                    ginfantsholder = ginfants_count.getText().toString().trim();
                    greturndateholder = greturndate.getText().toString().trim();
                    Volellydata();
                } else {
                    Toast.makeText(GroupBookingActivity.this, "Please fill all form fields mark(*).", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void Volellydata() {
        String response = null;
        final String finalResponse = response;
        StringRequest postRequest = new StringRequest(Request.Method.POST, gHttpUrl,
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {
                        // response
                        //  Log.d("Response", response);
                        if(response.equals("1")) {
                            Log.d("Response", response);
                            Toast.makeText(getApplicationContext(),"data submit",Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(GroupBookingActivity.this,MainActivity.class);
                            startActivity(i);
                        }
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // error
                        Log.d("Error.Response", finalResponse);
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String>  params = new HashMap<String, String>();

                params.put("adult", gadultholder);//edit_email.getText().toString());
                params.put("child",gchildholder);
                params.put("inft",ginfantsholder);
                params.put("g_company",gcompanyholder);
                params.put("g_email",gemailholder);
                params.put("g_requested",grequestholder);
                params.put("g_mobile",gmobileholder);
                params.put("ret_date",gorigindateholde);
                params.put("dep_date",greturndateholder);
                params.put("to", goriginHolder);
                params.put("fromm",gdestinationdHolder);
                //edit_password.getText().toString());
                return params;
            }
        };
        //singletone class
        AppController.getInstance().addToRequestQueue(postRequest);
    }
    public void CheckEditTextIsEmptyOrNot() {
        // Getting values from EditText.
        gadultholder = gadult_count.getText().toString().trim();
        gcompanyholder = gcompany_name.getText().toString().trim();
        grequestholder = grequested_name.getText().toString().trim();
        gemailholder = gtext_email_id.getText().toString().trim();
        gmobileholder = gtext_mobile.getText().toString().trim();
        goriginHolder=gorigin_location.getText().toString().trim();
        gdestinationdHolder =gdestination_location.getText().toString().trim();
        gorigindateholde=gorigindate.getText().toString().trim();
        greturndateholder=greturndate.getText().toString().trim();
        // Checking whether EditText value is empty or not.
        if (TextUtils.isEmpty(gadultholder) || TextUtils.isEmpty(gmobileholder)|| TextUtils.isEmpty(gmobileholder)) {
            // If any of EditText is empty then set variable value as False.
            gCheckEditText = false;
        } else {
            // If any of EditText is filled then set variable value as True.
            gCheckEditText = true;
        }
    }
    //for date calender show
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            //dialog for one way
            case gDATE_PICKER_origin:
//                 create a new DatePickerDialog with values you want to show
                DatePickerDialog datePickerDialog = new DatePickerDialog(this, datePickerListener, gyyear, gMmonth, gdday);
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DATE, 0); // Add 0 days to Calendar
                Date newDate = calendar.getTime();
                datePickerDialog.getDatePicker().setMinDate(newDate.getTime() - (newDate.getTime() % (24 * 60 * 60 * 1000)));
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                return datePickerDialog;
//             create dialog for return;
            case gDialog_return:
                DatePickerDialog date = new DatePickerDialog(this, datePickerListener2, gyyear,gMmonth,gdday){
                    // Comapre the date selected in picker with the One way date.
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth)
                    {
                        if (year < gyyear)
                            view.updateDate(gyyear,gMmonth,gdday);
                        if (monthOfYear < gMmonth && year == gyyear)
                            view.updateDate(gyyear,gMmonth,gdday);
                        if (dayOfMonth < gdday && year == gyyear && monthOfYear == gMmonth)
                            view.updateDate(gyyear,gMmonth,gdday);
                    }

                };
                return date;
        }
        return null;
    }
    //for one way date
    private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int selectedYear, int selectedMonth, int selectedDay) {
            gdday = selectedDay;
            gMmonth = selectedMonth;
            gyyear = selectedYear;
            gorigindate.setText(new StringBuilder().append(selectedDay).append("-").append((selectedMonth + 1)).append("-").append(selectedYear));
        }
    };
    //for return trip date
    private DatePickerDialog.OnDateSetListener datePickerListener2 = new DatePickerDialog.OnDateSetListener()
    {
        public void onDateSet(DatePicker viewv, int xselectedYear, int xselectedMonth, int xselectedDay)
        {
            greturndate.setText(new StringBuilder().append(xselectedDay).append("-").append((xselectedMonth + 1)).append("-").append(xselectedYear));
        }
    };


}


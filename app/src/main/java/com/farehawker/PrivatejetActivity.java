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


public class PrivatejetActivity extends AppCompatActivity {
    EditText  origin_location, destination_location,origindate,returndate, company_name, requested_name, adult_count, child_count, infants_count, text_email_id, text_mobile;
    Button submit;
    Boolean CheckEditText;
    String originHolder, destinationdHolder,origindateholde,returndateholder,adultholder,childholder,infantsholder,emailholder,mobileholder,companyholder,requestholder;
    String HttpUrl = "https://www.farehawker.com/mob/ajax/group_form_email.php";
    static final int DATE_PICKER_origin = 1111;
    static final int Dialog_return = 111;
    private int dday;
    private int Mmonth;
    private int yyear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privatejet);
        origin_location = (EditText) findViewById(R.id.textview_originselect);
        destination_location = (EditText) findViewById(R.id.textview_destinationselect);
        company_name = (EditText) findViewById(R.id.edit_company_name);
        requested_name = (EditText) findViewById(R.id.edit_requestby_name);
        origindate=(EditText)findViewById(R.id.text_departure_date);
       returndate =(EditText)findViewById(R.id.text_Returnd_date);
        adult_count = (EditText) findViewById(R.id.edit_adult_count);
        child_count = (EditText) findViewById(R.id.edit_child_count);
        infants_count = (EditText) findViewById(R.id.edit_infants_count);
        text_email_id = (EditText) findViewById(R.id.edit_email_id);
        text_mobile = (EditText) findViewById(R.id.edit_mobile_number);
        submit = (Button) findViewById(R.id.button_submit);
        origindate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_PICKER_origin);
            }
        });
        returndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(Dialog_return);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              CheckEditTextIsEmptyOrNot();
                if (CheckEditText) {
                    childholder = child_count.getText().toString().trim();
                    infantsholder = infants_count.getText().toString().trim();
                    returndateholder=returndate.getText().toString().trim();
                    Volellydata();
                } else {
                    Toast.makeText(PrivatejetActivity.this, "Please fill all form fields mark(*).", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void Volellydata() {
        String response = null;
        final String finalResponse = response;
        StringRequest postRequest = new StringRequest(Request.Method.POST, HttpUrl,
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {
                        // response
                      //  Log.d("Response", response);
                        if(response.equals("1")) {
                            Log.d("Response", response);
                            Toast.makeText(getApplicationContext(),"data submit",Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(PrivatejetActivity.this,MainActivity.class);
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

                params.put("adult", adultholder);//edit_email.getText().toString());
                params.put("child",childholder);
                params.put("inft",infantsholder);
                params.put("g_company",companyholder);
                params.put("g_email",emailholder);
                params.put("g_requested",requestholder);
                params.put("g_mobile",mobileholder);
                params.put("ret_date",origindateholde);
                params.put("dep_date",returndateholder);
                params.put("to", originHolder);
                params.put("fromm",destinationdHolder);
                //edit_password.getText().toString());
                return params;
            }
        };
        //singletone class
        AppController.getInstance().addToRequestQueue(postRequest);
    }
    public void CheckEditTextIsEmptyOrNot() {
        // Getting values from EditText.
        adultholder = adult_count.getText().toString().trim();
        companyholder = company_name.getText().toString().trim();
        requestholder = requested_name.getText().toString().trim();
        emailholder = text_email_id.getText().toString().trim();
        mobileholder = text_mobile.getText().toString().trim();
        originHolder=origin_location.getText().toString().trim();
        destinationdHolder =destination_location.getText().toString().trim();
        origindateholde=origindate.getText().toString().trim();
        returndateholder=returndate.getText().toString().trim();
        // Checking whether EditText value is empty or not.
        if (TextUtils.isEmpty(adultholder) || TextUtils.isEmpty(mobileholder)|| TextUtils.isEmpty(mobileholder)) {
            // If any of EditText is empty then set variable value as False.
            CheckEditText = false;
        } else {
            // If any of EditText is filled then set variable value as True.
            CheckEditText = true;
        }
    }
    //for date calender show
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            //dialog for one way
            case DATE_PICKER_origin:
//                 create a new DatePickerDialog with values you want to show
                DatePickerDialog datePickerDialog = new DatePickerDialog(this, datePickerListener, yyear, Mmonth, dday);
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DATE, 0); // Add 0 days to Calendar
                Date newDate = calendar.getTime();
                datePickerDialog.getDatePicker().setMinDate(newDate.getTime() - (newDate.getTime() % (24 * 60 * 60 * 1000)));
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                return datePickerDialog;
//             create dialog for return;
            case Dialog_return:
                DatePickerDialog date = new DatePickerDialog(this, datePickerListener2, yyear,Mmonth,dday){
                    // Comapre the date selected in picker with the One way date.
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth)
                    {
                        if (year < yyear)
                            view.updateDate(yyear,Mmonth,dday);
                        if (monthOfYear < Mmonth && year == yyear)
                            view.updateDate(yyear,Mmonth,dday);
                        if (dayOfMonth < dday && year == yyear && monthOfYear == Mmonth)
                            view.updateDate(yyear,Mmonth,dday);
                    }

                };
                return date;
        }
        return null;
    }
    //for one way date
    private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int selectedYear, int selectedMonth, int selectedDay) {
            dday = selectedDay;
            Mmonth = selectedMonth;
            yyear = selectedYear;
            origindate.setText(new StringBuilder().append(selectedDay).append("-").append((selectedMonth + 1)).append("-").append(selectedYear));
        }
    };
    //for return trip date
    private DatePickerDialog.OnDateSetListener datePickerListener2 = new DatePickerDialog.OnDateSetListener()
    {
        public void onDateSet(DatePicker viewv, int xselectedYear, int xselectedMonth, int xselectedDay)
        {
            returndate.setText(new StringBuilder().append(xselectedDay).append("-").append((xselectedMonth + 1)).append("-").append(xselectedYear));
        }
    };


}


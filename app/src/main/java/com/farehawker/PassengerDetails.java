package com.farehawker;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.basgeekball.awesomevalidation.AwesomeValidation;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static android.text.TextUtils.isEmpty;
import static com.basgeekball.awesomevalidation.ValidationStyle.BASIC;
public class PassengerDetails extends AppCompatActivity
{
    String intentId;
    EditText couponCode;
    static int couponValidity = 1;
    String TAG = "PassengerDetails";
    TextView TotalFare;
    private String edit_txt;

    static int status = 0;
    String orignp, destp, endipp, tokenp, resultindp, traceidonep, adultonep, childonep, infantsonep;

    LinearLayout childmain, infantsmain;
    LinearLayout Linear_adult1, Linear_adult2, Linear_adult3, Linear_adult4, Linear_adult5, Linear_adult6, Linear_adult7, Linear_adult8, Linear_adult9;
    LinearLayout linear_child1, linear_child2, linear_child3, linear_child4, linear_child5, linear_child6, linear_child7, linear_child8;
    LinearLayout Linear_infant1, Linear_infant2, Linear_infant3, Linear_infant4;
    LinearLayout gstLinearLayout;
    TextView infant_DOB1, infant_DOB2, infant_DOB3, infant_DOB4;
    Spinner adult_sp1, adult_sp2, adult_sp3, adult_sp4, adult_sp5, adult_sp6, adult_sp7, adult_sp8, adult_sp9, child_sp1, child_sp2, child_sp3, child_sp4, child_sp5, child_sp6, child_sp7, child_sp8,
            infant_sp1, infant_sp2, infant_sp3, infant_sp4;
    String item, itemA2, itemA3, itemA4, itemA5, itemA6, itemA7, itemA8, itemA9, itemC1, itemC2, itemC3, itemC4, itemC5, itemC6, itemC7, itemC8, itemI1, itemI2, itemI3, itemI4;
    TextView adultcount, childcount, infantscount;
    TextView adultOneFirstName, adultSecondFirstName, adultThirdFirstName, adultFourthFirstName, adultFifthFirstName, adultSixthFirstName, adultSeventhFirstName, adultEigthFirstName, adultNinethFirstName,
            adultOneLastName, adultSecondLastName, adultThirdLastName, adultFourthLastName, adultFifthLastName, adultSixthLastName, adultSeventhLastName, adultEigthLastName, adultNinethLastName,
            childOneFirstName, childSecondFirstName,childThirdFirstName,childFourthFirstName,childFifthFirstName,childSixthFirstName,childSeventhFirstName,childEigthFirstName,
            childOneLastName,childSecondLastName,childThirdLastName,childFourthLastName,childFifthLastName,childSixthLastName,childSeventhLastName,childEigthLastName;



    TextView infantOneFirstName,infantSecondFirstName,infantThirdFirstName,infantFourthFirstName,infantFifthFirstName,infantSixthFirstName,infantSeventhFirstName,infantEigthFirstName,infantNinethFirstName;

    TextView infantOneLastName,infantSecondLastName,infantThirdLastName,infantFourthLastName,infantFifthLastName,infantSixthLastName,infantSeventhLastName,infantEigthLastName,infantNinethLastName;

    TextView mobileNumber, emailId;
    String Adultstring, Adultstring2, Adultstring3, Adultstring4, Adultstring5, Adultstring6, Adultstring7, Adultstring8, Adultstring9,
            childstring, childstring2, childstring3, childstring4, childstring5, childstring6, childstring7, childstring8,
            infantstring, infantstring2, infantstring3, infantstring4, AdLstring, AdLstring2, AdLstring3, AdLstring4,
            AdLstring5, AdLstring6, AdLstring7, AdLstring8, AdLstring9,
            ChL, ChL2, ChL3, ChL4, ChL5, ChL6, ChL7, ChL8, INL, INL2, INL3, INL4;
    String spn_adult1, spn_adult2, spn_adult3, spn_adult4, spn_adult5, spn_adult6, spn_adult7, spn_adult8, spn_adult9,
            spn_child1, spn_child2, spn_child3, spn_child4, spn_child5, spn_child6, spn_child7, spn_child8,
            spn_infant1, spn_infant2, spn_infant3, spn_infant4;
    Button continueBookingButton;
    String airlineCode;
    AwesomeValidation awesomeValidation = new AwesomeValidation(BASIC);
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_details);
        TotalFare = findViewById(R.id.TotalFare);
        couponCode = findViewById(R.id.couponCode);

        Intent intent = getIntent();
        intentId=intent.getStringExtra("intentId");

        orignp = intent.getStringExtra("originv");
        destp = intent.getStringExtra("destinav");
        endipp = intent.getStringExtra("enduserip");
        tokenp = intent.getStringExtra("tokenid");
        resultindp = intent.getStringExtra("resultindex");
        traceidonep = intent.getStringExtra("traceid");

        adultonep = intent.getStringExtra("adultone");
        childonep = intent.getStringExtra("childone");
        infantsonep = intent.getStringExtra("infantsone");

        TotalFare.setText(intent.getStringExtra("totalFare"));
        airlineCode = intent.getStringExtra("airlineCode");
        awesomeValidation.validate();

        Toast.makeText(PassengerDetails.this, "mag" + orignp + "\n" + destp + "\n" + endipp + "\n" + tokenp + "\n" + resultindp + "\n" + traceidonep + "\n" + adultonep + "\n" + childonep + "\n" + infantsonep, Toast.LENGTH_LONG).show();
        infantsdob();
        Spinner_count();
        chilld_sappier();
        infants_sappier();
        adultcount = (TextView) findViewById(R.id.maincount_adult);
        childcount = (TextView) findViewById(R.id.maincount_child);
        infantscount = (TextView) findViewById(R.id.maincount_infant);
        adultcount.setText(adultonep);
        childcount.setText(childonep);
        infantscount.setText(infantsonep);
        childmain = (LinearLayout) findViewById(R.id.childmain_main);
        infantsmain = (LinearLayout) findViewById(R.id.infants_main);
        adultOneFirstName = (TextView) findViewById(R.id.adult_firstname);
        adultSecondFirstName = (TextView) findViewById(R.id.adult2_firstname);
        adultThirdFirstName = (TextView) findViewById(R.id.adult3_firstname);
        adultFourthFirstName = (TextView) findViewById(R.id.adult4_firstname);
        adultFifthFirstName = (TextView) findViewById(R.id.adult5_firstname);
        adultSixthFirstName = (TextView) findViewById(R.id.adult6_firstname);
        adultSeventhFirstName = (TextView) findViewById(R.id.adult7_firstname);
        adultEigthFirstName = (TextView) findViewById(R.id.adult8_firstname);
        adultNinethFirstName = (TextView) findViewById(R.id.adult9_firstname);

        adultOneLastName = (TextView) findViewById(R.id.adult_lastname);
        adultSecondLastName = (TextView) findViewById(R.id.adult2_lastname);
        adultThirdLastName = (TextView) findViewById(R.id.adult3_lastname);
        adultFourthLastName = (TextView) findViewById(R.id.adult4_lastname);
        adultFifthLastName = (TextView) findViewById(R.id.adult5_lastname);
        adultSixthLastName = (TextView) findViewById(R.id.adult6_lastname);
        adultSeventhLastName = (TextView) findViewById(R.id.adult7_lastname);
        adultEigthLastName = (TextView) findViewById(R.id.adult8_lastname);
        adultNinethLastName = (TextView) findViewById(R.id.adult9_lastname);

        childOneFirstName = (TextView) findViewById(R.id.child1_firstname);
        childSecondFirstName = (TextView) findViewById(R.id.child2_firstname);
        childThirdFirstName = (TextView) findViewById(R.id.child3_firstname);
        childFourthFirstName = (TextView) findViewById(R.id.child4_firstname);
        childFifthFirstName = (TextView) findViewById(R.id.child5_firstname);
        childSixthFirstName = (TextView) findViewById(R.id.child6_firstname);
        childSeventhFirstName = (TextView) findViewById(R.id.child7_firstname);
        childEigthFirstName = (TextView) findViewById(R.id.child8_firstname);

        childOneLastName = (TextView) findViewById(R.id.child1_lastname);
        childSecondLastName = (TextView) findViewById(R.id.child2_lastname);
        childThirdLastName = (TextView) findViewById(R.id.child3_lastname);
        childFourthLastName = (TextView) findViewById(R.id.child4_lastname);
        childFifthLastName = (TextView) findViewById(R.id.child5_lastname);
        childSixthLastName = (TextView) findViewById(R.id.child6_lastname);
        childSeventhLastName = (TextView) findViewById(R.id.child7_lastname);
        childEigthLastName = (TextView) findViewById(R.id.child8_lastname);

        infantOneFirstName=(TextView)findViewById(R.id.infants1_firstname);
        infantSecondFirstName=(TextView)findViewById(R.id.infants2_firstname);
        infantThirdFirstName=(TextView)findViewById(R.id.infants3_firstname);
        infantFourthFirstName=(TextView)findViewById(R.id.infants4_firstname);
        infantFifthFirstName=(TextView)findViewById(R.id.infants5_firstname);
        infantSixthFirstName=(TextView)findViewById(R.id.infants6_firstname);
        infantSeventhFirstName=(TextView)findViewById(R.id.infants7_firstname);
        infantEigthFirstName=(TextView)findViewById(R.id.infants8_firstname);
        infantNinethFirstName=(TextView)findViewById(R.id.infants9_firstname);

        infantOneLastName=(TextView)findViewById(R.id.infants1_lastname);
        infantSecondLastName=(TextView)findViewById(R.id.infants2_lastname);
        infantThirdLastName=(TextView)findViewById(R.id.infants3_lastname);
        infantFourthLastName=(TextView)findViewById(R.id.infants4_lastname);
        infantFifthLastName=(TextView)findViewById(R.id.infants5_lastname);
        infantSixthLastName=(TextView)findViewById(R.id.infants6_lastname);
        infantSeventhLastName=(TextView)findViewById(R.id.infants7_lastname);
        infantEigthLastName=(TextView)findViewById(R.id.infants8_lastname);
        infantNinethLastName=(TextView)findViewById(R.id.infants9_lastname);


        Linear_adult1 = (LinearLayout) findViewById(R.id.linear_adult1);
        Linear_adult2 = (LinearLayout) findViewById(R.id.linear_adult2);
        Linear_adult3 = (LinearLayout) findViewById(R.id.linear_adult3);
        Linear_adult4 = (LinearLayout) findViewById(R.id.linear_adult4);
        Linear_adult5 = (LinearLayout) findViewById(R.id.linear_adult5);
        Linear_adult6 = (LinearLayout) findViewById(R.id.linear_adult6);
        Linear_adult7 = (LinearLayout) findViewById(R.id.linear_adult7);
        Linear_adult8 = (LinearLayout) findViewById(R.id.linear_adult8);
        Linear_adult9 = (LinearLayout) findViewById(R.id.linear_adult9);

        linear_child1 = (LinearLayout) findViewById(R.id.linear_child1);
        linear_child2 = (LinearLayout) findViewById(R.id.linear_child2);
        linear_child3 = (LinearLayout) findViewById(R.id.linear_child3);
        linear_child4 = (LinearLayout) findViewById(R.id.linear_child4);
        linear_child5 = (LinearLayout) findViewById(R.id.linear_child5);
        linear_child6 = (LinearLayout) findViewById(R.id.linear_child6);
        linear_child7 = (LinearLayout) findViewById(R.id.linear_child7);
        linear_child8 = (LinearLayout) findViewById(R.id.linear_child8);

        Linear_infant1 = (LinearLayout) findViewById(R.id.linear_infants1);
        Linear_infant2 = (LinearLayout) findViewById(R.id.linear_infants2);
        Linear_infant3 = (LinearLayout) findViewById(R.id.linear_infants3);
        Linear_infant4 = (LinearLayout) findViewById(R.id.linear_infants4);

        mobileNumber = findViewById(R.id.mobileNumber);
        emailId = findViewById(R.id.emailId);
        gstLinearLayout = (LinearLayout) findViewById(R.id.gstLinearLayout);
        if (childonep.equals("0")) {
            childmain.setVisibility(View.GONE);
        }
        if (infantsonep.equals("0")) {
            infantsmain.setVisibility(View.GONE);
        }

        //for adult
        if (adultonep.equals("1"))
        {
            Linear_adult2.setVisibility(View.GONE);
            Linear_adult3.setVisibility(View.GONE);
            Linear_adult4.setVisibility(View.GONE);
            Linear_adult5.setVisibility(View.GONE);
            Linear_adult6.setVisibility(View.GONE);
            Linear_adult7.setVisibility(View.GONE);
            Linear_adult8.setVisibility(View.GONE);
            Linear_adult9.setVisibility(View.GONE);

        }
        if (adultonep.equals("2"))
        {
            Linear_adult3.setVisibility(View.GONE);
            Linear_adult4.setVisibility(View.GONE);
            Linear_adult5.setVisibility(View.GONE);
            Linear_adult6.setVisibility(View.GONE);
            Linear_adult7.setVisibility(View.GONE);
            Linear_adult8.setVisibility(View.GONE);
            Linear_adult9.setVisibility(View.GONE);

        }
        if (adultonep.equals("3")) {
            Linear_adult4.setVisibility(View.GONE);
            Linear_adult5.setVisibility(View.GONE);
            Linear_adult6.setVisibility(View.GONE);
            Linear_adult7.setVisibility(View.GONE);
            Linear_adult8.setVisibility(View.GONE);
            Linear_adult9.setVisibility(View.GONE);

        }
        if (adultonep.equals("4")) {
            Linear_adult5.setVisibility(View.GONE);
            Linear_adult6.setVisibility(View.GONE);
            Linear_adult7.setVisibility(View.GONE);
            Linear_adult8.setVisibility(View.GONE);
            Linear_adult9.setVisibility(View.GONE);

        }
        if (adultonep.equals("5")) {

            Linear_adult6.setVisibility(View.GONE);
            Linear_adult7.setVisibility(View.GONE);
            Linear_adult8.setVisibility(View.GONE);
            Linear_adult9.setVisibility(View.GONE);

        }
        if (adultonep.equals("6")) {

            Linear_adult7.setVisibility(View.GONE);
            Linear_adult8.setVisibility(View.GONE);
            Linear_adult9.setVisibility(View.GONE);

        }
        if (adultonep.equals("7")) {

            Linear_adult8.setVisibility(View.GONE);
            Linear_adult9.setVisibility(View.GONE);

        }
        if (adultonep.equals("8")) {

            Linear_adult9.setVisibility(View.GONE);
        }

        //for child
        if (childonep.equals("1")) {
            linear_child2.setVisibility(View.GONE);
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        if (childonep.equals("2")) {
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        if (childonep.equals("3")) {
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        if (childonep.equals("4")) {
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        if (childonep.equals("5")) {
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        if (childonep.equals("6")) {
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);
        }
        if (childonep.equals("7")) {
            linear_child8.setVisibility(View.GONE);
        }
        //for infants
        if (infantsonep.equals("1")) {
            Linear_infant2.setVisibility(View.GONE);
            Linear_infant3.setVisibility(View.GONE);
            Linear_infant4.setVisibility(View.GONE);
        }
        if (infantsonep.equals("2")) {
            Linear_infant3.setVisibility(View.GONE);
            Linear_infant4.setVisibility(View.GONE);
        }
        if (infantsonep.equals("3")) {
            Linear_infant4.setVisibility(View.GONE);
        }
        final String Adultstr = adultOneFirstName.getText().toString();
        final String adl = adultOneLastName.getText().toString();
        continueBookingButton = (Button) findViewById(R.id.contineee);
        continueBookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inr = new Intent(PassengerDetails.this, Reviewdetails.class);
                inr.putExtra("adultCount", adultonep);
                inr.putExtra("childCount", childonep);
                inr.putExtra("infantCount", infantsonep);

                inr.putExtra("adultOneFirstName", adultOneFirstName.getText().toString());
                inr.putExtra("adultSecondFirstName", adultSecondFirstName.getText().toString());
                inr.putExtra("adultThirdFirstName", adultThirdFirstName.getText().toString());
                inr.putExtra("adultFourthFirstName", adultFourthFirstName.getText().toString());
                inr.putExtra("adultFifthFirstName", adultFifthFirstName.getText().toString());
                inr.putExtra("adultSixthFirstName", adultSixthFirstName.getText().toString());
                inr.putExtra("adultSeventhFirstName", adultSeventhFirstName.getText().toString());
                inr.putExtra("adultEigthFirstName", adultEigthFirstName.getText().toString());
                inr.putExtra("adultNinethFirstName", adultNinethFirstName.getText().toString());

                inr.putExtra("adultOneLastName", adultOneLastName.getText().toString());
                inr.putExtra("adultTwoLastName", adultOneLastName.getText().toString());
                inr.putExtra("adultThirdLastName", adultOneLastName.getText().toString());
                inr.putExtra("adultFourthLastName", adultOneLastName.getText().toString());
                inr.putExtra("adultFifthLastName", adultOneLastName.getText().toString());
                inr.putExtra("adultSixthLastName", adultOneLastName.getText().toString());
                inr.putExtra("adultSeventhLastName", adultOneLastName.getText().toString());
                inr.putExtra("adultEigthLastName", adultOneLastName.getText().toString());
                inr.putExtra("adultNinethLastName", adultOneLastName.getText().toString());

                inr.putExtra("childOneFirstName",childOneFirstName.getText().toString());
                inr.putExtra("childTwoFirstName",childOneFirstName.getText().toString());
                inr.putExtra("childThrirdFirstName",childOneFirstName.getText().toString());
                inr.putExtra("childFourthFirstName",childOneFirstName.getText().toString());
                inr.putExtra("childFifthFirstName",childOneFirstName.getText().toString());
                inr.putExtra("childSixthFirstName",childOneFirstName.getText().toString());
                inr.putExtra("childSeventhFirstName",childOneFirstName.getText().toString());
                inr.putExtra("childEigthFirstName",childOneFirstName.getText().toString());

                inr.putExtra("childFirstLastName",childOneFirstName.getText().toString());
                inr.putExtra("childSecondLastName",childOneFirstName.getText().toString());
                inr.putExtra("childThirdLastName",childOneFirstName.getText().toString());
                inr.putExtra("childFourthLastName",childOneFirstName.getText().toString());
                inr.putExtra("childFifthLastName",childOneFirstName.getText().toString());
                inr.putExtra("childSixthLastName",childOneFirstName.getText().toString());
                inr.putExtra("childSeventhLastName",childOneFirstName.getText().toString());
                inr.putExtra("childEigthLastName",childOneFirstName.getText().toString());

                inr.putExtra("infantOneFirstName",infantOneFirstName.getText().toString());
                inr.putExtra("infantSecondFirstName",infantSecondFirstName.getText().toString());
                inr.putExtra("infantThirdFirstName",infantThirdFirstName.getText().toString());
                inr.putExtra("infantFourthFirstName",infantFourthFirstName.getText().toString());
                inr.putExtra("infantFifthFirstName",infantFifthFirstName.getText().toString());
                inr.putExtra("infantSixthFirstName",infantSixthFirstName.getText().toString());
                inr.putExtra("infantSeventhFirstName",infantSeventhFirstName.getText().toString());
                inr.putExtra("infantEigthFirstName",infantEigthFirstName.getText().toString());
                inr.putExtra("infantNinethFirstName",infantNinethFirstName.getText().toString());

                inr.putExtra("infantOneLastName",infantOneLastName.getText().toString());
                inr.putExtra("infantSecondName",infantSecondLastName.getText().toString());
                inr.putExtra("infantThirdLastName",infantThirdLastName.getText().toString());
                inr.putExtra("infantFourthLastName",infantFourthLastName.getText().toString());
                inr.putExtra("infantFifthLastName",infantFifthLastName.getText().toString());
                inr.putExtra("infantSixthLastName",infantSixthLastName.getText().toString());
                inr.putExtra("infantSeventhLastName",infantSeventhLastName.getText().toString());
                inr.putExtra("infantEigthLastName",infantEigthLastName.getText().toString());
                inr.putExtra("infantNinethLastName",infantNinethLastName.getText().toString());


                inr.putExtra("adF", Adultstring);
                inr.putExtra("adL", AdLstring);
                if (isEmpty(adultOneFirstName.getText().toString()))
                {
                    adultOneFirstName.setError("Please enter your first name");
                    adultOneFirstName.requestFocus();
                    return;
                }
                if (isEmpty(adultOneLastName.getText().toString())) {
                    adultOneLastName.setError("Please enter your Last name");
                    adultOneLastName.requestFocus();
                    return;
                }

                if (isEmpty(adultSecondFirstName.getText().toString()) && adultcount.getText().toString().equals("2")) {
                    adultSecondFirstName.setError("Please enter your first name");
                    adultSecondFirstName.requestFocus();
                    return;
                }
                if (isEmpty(adultSecondLastName.getText().toString()) && adultcount.getText().toString().equals("2")) {
                    adultSecondLastName.setError("Please enter your Last name");
                    adultSecondLastName.requestFocus();
                    return;
                }
                if (isEmpty(adultThirdFirstName.getText().toString()) && adultcount.getText().toString().equals("3")) {
                    adultThirdFirstName.setError("Please enter your first name");
                    adultThirdFirstName.requestFocus();
                    return;
                }
                if (isEmpty(adultThirdLastName.getText().toString()) && adultcount.getText().toString().equals("3")) {
                    adultThirdLastName.setError("Please enter your Last name");
                    adultThirdLastName.requestFocus();
                    return;
                }
                if (isEmpty(adultFourthFirstName.getText().toString()) && adultcount.getText().toString().equals("4")) {
                    adultFourthFirstName.setError("Please enter your first name");
                    adultFourthFirstName.requestFocus();
                    return;
                }
                if (isEmpty(adultFourthLastName.getText().toString()) && adultcount.getText().toString().equals("4")) {
                    adultFourthLastName.setError("Please enter your Last name");
                    adultFourthLastName.requestFocus();
                    return;
                }
                if (isEmpty(adultFifthFirstName.getText().toString()) && adultcount.getText().toString().equals("5")) {
                    adultFifthFirstName.setError("Please enter First Name");
                    adultFifthFirstName.requestFocus();
                }
                if (isEmpty(adultFifthLastName.getText().toString()) && adultcount.getText().toString().equals("5")) {
                    adultFifthLastName.setError("Please enter your Last name");
                    adultFifthLastName.requestFocus();
                    return;
                }
                if (isEmpty(adultSixthFirstName.getText().toString()) && adultcount.getText().toString().equals("6")) {
                    adultSixthFirstName.setError("Please enter your first name");
                    adultSixthFirstName.requestFocus();
                    return;
                }
                if (isEmpty(adultSixthLastName.getText().toString()) && adultcount.getText().toString().equals("6")) {
                    adultSixthLastName.setError("Please enter your Last name");
                    adultSixthLastName.requestFocus();
                    return;
                }
                if (isEmpty(adultSeventhFirstName.getText().toString()) && adultcount.getText().toString().equals("7")) {
                    adultSeventhFirstName.setError("Please enter your first name");
                    adultSeventhFirstName.requestFocus();
                    return;
                }
                if (isEmpty(adultSeventhLastName.getText().toString()) && adultcount.getText().toString().equals("7")) {
                    adultSeventhLastName.setError("Please enter your Last name");
                    adultSeventhLastName.requestFocus();
                    return;
                }
                if (isEmpty(adultEigthFirstName.getText().toString()) && adultcount.getText().toString().equals("8")) {
                    adultEigthFirstName.setError("Please enter your first name");
                    adultEigthFirstName.requestFocus();
                    return;
                }
                if (isEmpty(adultEigthLastName.getText().toString()) && adultcount.getText().toString().equals("8")) {
                    adultEigthLastName.setError("Please enter your Last name");
                    adultEigthLastName.requestFocus();
                    return;
                }
                if (isEmpty(adultNinethFirstName.getText().toString()) && adultcount.getText().toString().equals("9")) {
                    adultNinethFirstName.setError("Please enter your first name");
                    adultNinethFirstName.requestFocus();
                    return;
                }
                if (isEmpty(adultNinethLastName.getText().toString()) && adultcount.getText().toString().equals("9")) {
                    adultNinethLastName.setError("Please enter your Last name");
                    adultNinethLastName.requestFocus();
                    return;
                }
                if (isEmpty(mobileNumber.getText().toString())) {
                    mobileNumber.setError("Please enter your mobile number");
                    mobileNumber.requestFocus();
                    return;
                }
                if (isEmpty(emailId.getText().toString())) {
                    emailId.setError("Please enter your email id");
                    emailId.requestFocus();
                    return;
                }
                Toast.makeText(getApplicationContext(), Adultstr + adl, Toast.LENGTH_SHORT).show();
                startActivity(inr);
            }
        });
    }

    //invoked when user
    public void makeGstVisible(View view) {
        if (status == 0) {
            gstLinearLayout.setVisibility(View.VISIBLE);
            status = 1;
        } else {
            gstLinearLayout.setVisibility(View.GONE);
            status = 0;
        }
    }

    private void Spinner_count() {

        adult_sp1 = (Spinner) findViewById(R.id.spinner_adult);
        List<String> onewatcate = new ArrayList<String>();
        onewatcate.add("Mr");
        onewatcate.add("Ms");
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, onewatcate);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        adult_sp1.setAdapter(dataAdapter);
        // Spinner Drop down elements
        adult_sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item = parent.getItemAtPosition(position).toString();
                if (item.equals("Mr")) {
                    spn_adult1 = item;
                    Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_SHORT).show();
                } else {
                    spn_adult1 = item;
                    Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        adult_sp2 = (Spinner) findViewById(R.id.spinner_adult2);
        List<String> listA2 = new ArrayList<String>();
        listA2.add("Mr");
        listA2.add("Ms");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterA2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listA2);
        // Drop down layout style - list view with radio button
        AdapterA2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        adult_sp2.setAdapter(AdapterA2);
        // Spinner Drop down elements
        adult_sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemA2 = parent.getItemAtPosition(position).toString();
                if (itemA2.equals("Mr")) {
                    spn_adult2 = itemA2;
                    Toast.makeText(parent.getContext(), "Selected:adult2 " + itemA2, Toast.LENGTH_SHORT).show();
                } else {
                    spn_adult2 = itemA2;
                    Toast.makeText(parent.getContext(), "Selected:adult2 " + itemA2, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        adult_sp3 = (Spinner) findViewById(R.id.spinner_adult3);
        List<String> listA3 = new ArrayList<String>();
        listA3.add("Mr");
        listA3.add("Ms");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterA3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listA3);
        // Drop down layout style - list view with radio button
        AdapterA3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        adult_sp3.setAdapter(AdapterA3);
        // Spinner Drop down elements
        adult_sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemA3 = parent.getItemAtPosition(position).toString();
                if (itemA3.equals("Mr")) {
                    spn_adult3 = itemA3;
                    Toast.makeText(parent.getContext(), "Selected:adult3 " + itemA3, Toast.LENGTH_SHORT).show();
                } else {
                    spn_adult3 = itemA3;
                    Toast.makeText(parent.getContext(), "Selected:adult3 " + itemA3, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        adult_sp4 = (Spinner) findViewById(R.id.spinner_adult4);
        List<String> listA4 = new ArrayList<String>();
        listA4.add("Mr");
        listA4.add("Ms");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterA4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listA4);
        // Drop down layout style - list view with radio button
        AdapterA4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        adult_sp4.setAdapter(AdapterA4);
        // Spinner Drop down elements
        adult_sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemA4 = parent.getItemAtPosition(position).toString();
                if (itemA4.equals("Mr")) {
                    spn_adult4 = itemA4;
                    Toast.makeText(parent.getContext(), "Selected:adult4 " + itemA4, Toast.LENGTH_SHORT).show();
                } else {
                    spn_adult4 = itemA4;
                    Toast.makeText(parent.getContext(), "Selected:adult4 " + itemA4, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        adult_sp5 = (Spinner) findViewById(R.id.spinner_adult5);
        List<String> listA5 = new ArrayList<String>();
        listA5.add("Mr");
        listA5.add("Ms");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterA5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listA5);
        // Drop down layout style - list view with radio button
        AdapterA5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        adult_sp5.setAdapter(AdapterA5);
        // Spinner Drop down elements
        adult_sp5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemA5 = parent.getItemAtPosition(position).toString();
                if (itemA5.equals("Mr")) {
                    spn_adult5 = itemA5;
                    Toast.makeText(parent.getContext(), "Selected:adult5 " + itemA5, Toast.LENGTH_SHORT).show();
                } else {
                    spn_adult5 = itemA5;
                    Toast.makeText(parent.getContext(), "Selected:adult5 " + itemA5, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        adult_sp6 = (Spinner) findViewById(R.id.spinner_adult6);
        List<String> listA6 = new ArrayList<String>();
        listA6.add("Mr");
        listA6.add("Ms");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterA6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listA6);
        // Drop down layout style - list view with radio button
        AdapterA6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        adult_sp6.setAdapter(AdapterA6);
        // Spinner Drop down elements
        adult_sp6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemA6 = parent.getItemAtPosition(position).toString();
                if (itemA6.equals("Mr")) {
                    spn_adult6 = itemA6;
                    Toast.makeText(parent.getContext(), "Selected: adult6" + itemA6, Toast.LENGTH_SHORT).show();
                } else {
                    spn_adult6 = itemA6;
                    Toast.makeText(parent.getContext(), "Selected: adult6" + itemA6, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        adult_sp7 = (Spinner) findViewById(R.id.spinner_adult7);
        List<String> listA7 = new ArrayList<String>();
        listA7.add("Mr");
        listA7.add("Ms");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterA7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listA7);
        // Drop down layout style - list view with radio button
        AdapterA7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        adult_sp7.setAdapter(AdapterA7);
        // Spinner Drop down elements
        adult_sp7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemA7 = parent.getItemAtPosition(position).toString();
                if (itemA7.equals("Mr")) {
                    spn_adult7 = itemA7;
                    Toast.makeText(parent.getContext(), "Selected: adult7" + itemA7, Toast.LENGTH_SHORT).show();
                } else {
                    spn_adult7 = itemA7;
                    Toast.makeText(parent.getContext(), "Selected:adult7 " + itemA7, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        adult_sp8 = (Spinner) findViewById(R.id.spinner_adult8);
        List<String> listA8 = new ArrayList<String>();
        listA8.add("Mr");
        listA8.add("Ms");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterA8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listA8);
        // Drop down layout style - list view with radio button
        AdapterA8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        adult_sp8.setAdapter(AdapterA8);
        // Spinner Drop down elements
        adult_sp8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemA8 = parent.getItemAtPosition(position).toString();
                if (itemA8.equals("Mr")) {
                    spn_adult8 = itemA8;
                    Toast.makeText(parent.getContext(), "Selected:adult8 " + itemA8, Toast.LENGTH_SHORT).show();
                } else {
                    spn_adult8 = itemA8;
                    Toast.makeText(parent.getContext(), "Selected:adult8 " + itemA8, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        adult_sp9 = (Spinner) findViewById(R.id.spinner_adult9);
        List<String> listA9 = new ArrayList<String>();
        listA9.add("Mr");
        listA9.add("Ms");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterA9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listA9);
        // Drop down layout style - list view with radio button
        AdapterA9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        adult_sp9.setAdapter(AdapterA9);
        // Spinner Drop down elements
        adult_sp9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemA9 = parent.getItemAtPosition(position).toString();
                if (itemA2.equals("Mr")) {
                    spn_adult9 = itemA9;
                    Toast.makeText(parent.getContext(), "Selected:adult9 " + itemA9, Toast.LENGTH_SHORT).show();
                } else {
                    spn_adult9 = itemA9;
                    Toast.makeText(parent.getContext(), "Selected:adult9 " + itemA9, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

    private void chilld_sappier() {

        child_sp1 = (Spinner) findViewById(R.id.spinner_child1);
        List<String> listC1 = new ArrayList<String>();
        listC1.add("Mstr");
        listC1.add("Miss");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterC1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listC1);
        // Drop down layout style - list view with radio button
        AdapterC1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        child_sp1.setAdapter(AdapterC1);
        // Spinner Drop down elements
        child_sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemC1 = parent.getItemAtPosition(position).toString();
                if (itemC1.equals("Mstr")) {
                    spn_child1 = itemC1;
                    Toast.makeText(parent.getContext(), "Selected:child1 " + itemC1, Toast.LENGTH_SHORT).show();
                } else {
                    spn_child1 = itemC1;
                    Toast.makeText(parent.getContext(), "Selected:child1 " + itemC1, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        child_sp2 = (Spinner) findViewById(R.id.spinner_child2);
        List<String> listC2 = new ArrayList<String>();
        listC2.add("Mstr");
        listC2.add("Miss");
        ;
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterC9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listC2);
        // Drop down layout style - list view with radio button
        AdapterC9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        child_sp2.setAdapter(AdapterC9);
        // Spinner Drop down elements
        child_sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemC2 = parent.getItemAtPosition(position).toString();
                if (itemC2.equals("Mstr")) {
                    spn_child2 = itemC2;
                    Toast.makeText(parent.getContext(), "Selected:child2 " + itemC2, Toast.LENGTH_SHORT).show();
                } else {
                    spn_child2 = itemC2;
                    Toast.makeText(parent.getContext(), "Selected:child2 " + itemC2, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        child_sp3 = (Spinner) findViewById(R.id.spinner_child3);
        List<String> listC3 = new ArrayList<String>();
        listC3.add("Mstr");
        listC3.add("Miss");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterC3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listC3);
        // Drop down layout style - list view with radio button
        AdapterC3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        child_sp3.setAdapter(AdapterC3);
        // Spinner Drop down elements
        child_sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemC3 = parent.getItemAtPosition(position).toString();
                if (itemC3.equals("Mstr")) {
                    spn_child3 = itemC3;
                    Toast.makeText(parent.getContext(), "Selected:child3 " + itemC3, Toast.LENGTH_SHORT).show();
                } else {
                    spn_child3 = itemC3;
                    Toast.makeText(parent.getContext(), "Selected:child3 " + itemC3, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        child_sp4 = (Spinner) findViewById(R.id.spinner_child4);
        List<String> listC4 = new ArrayList<String>();
        listC4.add("Mstr");
        listC4.add("Miss");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterA9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listC4);
        // Drop down layout style - list view with radio button
        AdapterA9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        child_sp4.setAdapter(AdapterA9);
        // Spinner Drop down elements
        child_sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemC4 = parent.getItemAtPosition(position).toString();
                if (itemC4.equals("Mstr")) {
                    spn_child4 = itemC4;
                    Toast.makeText(parent.getContext(), "Selected:child4 " + itemC4, Toast.LENGTH_SHORT).show();
                } else {
                    spn_child4 = itemC4;
                    Toast.makeText(parent.getContext(), "Selected:child4 " + itemC4, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        child_sp5 = (Spinner) findViewById(R.id.spinner_child5);
        List<String> listC5 = new ArrayList<String>();
        listC5.add("Mstr");
        listC5.add("Miss");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterC5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listC5);
        // Drop down layout style - list view with radio button
        AdapterC5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        child_sp5.setAdapter(AdapterC5);
        // Spinner Drop down elements
        child_sp5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemC5 = parent.getItemAtPosition(position).toString();
                if (itemC5.equals("Mstr")) {
                    spn_child5 = itemC5;
                    Toast.makeText(parent.getContext(), "Selected:child5 " + itemC5, Toast.LENGTH_SHORT).show();
                } else {
                    spn_child5 = itemC5;
                    Toast.makeText(parent.getContext(), "Selected:child5 " + itemC5, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        child_sp6 = (Spinner) findViewById(R.id.spinner_child6);
        List<String> listC6 = new ArrayList<String>();
        listC6.add("Mstr");
        listC6.add("Miss");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterC6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listC6);
        // Drop down layout style - list view with radio button
        AdapterC6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        child_sp6.setAdapter(AdapterC6);
        // Spinner Drop down elements
        child_sp6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemC6 = parent.getItemAtPosition(position).toString();
                if (itemC6.equals("Mstr")) {
                    spn_child6 = itemC6;
                    Toast.makeText(parent.getContext(), "Selected:child6 " + itemC6, Toast.LENGTH_SHORT).show();
                } else {
                    spn_child6 = itemC6;
                    Toast.makeText(parent.getContext(), "Selected:child6 " + itemC6, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        child_sp7 = (Spinner) findViewById(R.id.spinner_child7);
        List<String> listC7 = new ArrayList<String>();
        listC7.add("Mstr");
        listC7.add("Miss");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterC7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listC7);
        // Drop down layout style - list view with radio button
        AdapterC7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        child_sp7.setAdapter(AdapterC7);
        // Spinner Drop down elements
        child_sp7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemC7 = parent.getItemAtPosition(position).toString();
                if (itemC7.equals("Mstr")) {
                    spn_child7 = itemC7;
                    Toast.makeText(parent.getContext(), "Selected:child7 " + itemC7, Toast.LENGTH_SHORT).show();
                } else {
                    spn_child7 = itemC7;
                    Toast.makeText(parent.getContext(), "Selected:child7 " + itemC7, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        child_sp8 = (Spinner) findViewById(R.id.spinner_child8);
        List<String> listC8 = new ArrayList<String>();
        listC8.add("Mstr");
        listC8.add("Miss");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterC8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listC8);
        // Drop down layout style - list view with radio button
        AdapterC8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        child_sp8.setAdapter(AdapterC8);
        // Spinner Drop down elements
        child_sp8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemC8 = parent.getItemAtPosition(position).toString();
                if (itemC8.equals("Mstr")) {
                    spn_child8 = itemC8;
                    Toast.makeText(parent.getContext(), "Selected:child8 " + itemC8, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(parent.getContext(), "Selected:child8 " + itemC8, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }//child_s

    private void infants_sappier() {

        infant_sp1 = (Spinner) findViewById(R.id.spinner_infants1);
        List<String> listI1 = new ArrayList<String>();
        listI1.add("Mstr");
        listI1.add("Miss");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterI1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listI1);
        // Drop down layout style - list view with radio button
        AdapterI1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        infant_sp1.setAdapter(AdapterI1);
        // Spinner Drop down elements
        infant_sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemI1 = parent.getItemAtPosition(position).toString();
                if (itemI1.equals("Mstr")) {
                    spn_infant1 = itemI1;
                    Toast.makeText(parent.getContext(), "Selected:infant1 " + itemI1, Toast.LENGTH_SHORT).show();
                } else {
                    spn_infant1 = itemI1;
                    Toast.makeText(parent.getContext(), "Selected:infants1 " + itemI1, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        infant_sp2 = (Spinner) findViewById(R.id.spinner_infants2);
        List<String> listI2 = new ArrayList<String>();
        listI2.add("Mstr");
        listI2.add("Miss");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterI2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listI1);
        // Drop down layout style - list view with radio button
        AdapterI2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        infant_sp2.setAdapter(AdapterI2);
        // Spinner Drop down elements
        infant_sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemI2 = parent.getItemAtPosition(position).toString();
                if (itemI2.equals("Mstr")) {
                    spn_infant2 = itemI2;
                    Toast.makeText(parent.getContext(), "Selected:infant2 " + itemI2, Toast.LENGTH_SHORT).show();
                } else {
                    spn_infant2 = itemI2;
                    Toast.makeText(parent.getContext(), "Selected:infant2 " + itemI2, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        infant_sp3 = (Spinner) findViewById(R.id.spinner_infants3);
        List<String> listI3 = new ArrayList<String>();
        listI3.add("Mstr");
        listI3.add("Miss");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterI3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listI3);
        // Drop down layout style - list view with radio button
        AdapterI3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        infant_sp3.setAdapter(AdapterI3);
        // Spinner Drop down elements
        infant_sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemI3 = parent.getItemAtPosition(position).toString();
                if (itemI3.equals("Mstr")) {
                    spn_infant3 = itemI3;
                    Toast.makeText(parent.getContext(), "Selected:infatns3 " + itemI3, Toast.LENGTH_SHORT).show();
                } else {
                    spn_infant3 = itemI3;
                    Toast.makeText(parent.getContext(), "Selected:infants3 " + itemI3, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        infant_sp4 = (Spinner) findViewById(R.id.spinner_infants4);
        List<String> listI4 = new ArrayList<String>();
        listI4.add("Mstr");
        listI4.add("Miss");
        // Creating adapter for spinner
        ArrayAdapter<String> AdapterI4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listI4);
        // Drop down layout style - list view with radio button
        AdapterI4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        infant_sp4.setAdapter(AdapterI4);
        // Spinner Drop down elements
        infant_sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemI4 = parent.getItemAtPosition(position).toString();
                if (itemI4.equals("Mstr")) {
                    spn_infant4 = itemI4;
                    Toast.makeText(parent.getContext(), "Selected:infant4 " + itemI4, Toast.LENGTH_SHORT).show();
                } else {
                    spn_infant4 = itemI4;
                    Toast.makeText(parent.getContext(), "Selected:infant4 " + itemI4, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private void infantsdob() {
        infant_DOB1 = (TextView) findViewById(R.id.infants1_lastname);
        infant_DOB2 = (TextView) findViewById(R.id.infants2_lastname);
        infant_DOB3 = (TextView) findViewById(R.id.infants3_lastname);
        infant_DOB4 = (TextView) findViewById(R.id.infants4_lastname);

        infant_DOB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePicker = new DatePickerDialog(PassengerDetails.this, android.R.style.Theme_Holo_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        String date = String.valueOf(dayOfMonth) + "/" + String.valueOf(monthOfYear + 1)
                                + "/" + String.valueOf(year);
                        infant_DOB1.setText(date);
                    }
                }, yy, mm, dd);
                datePicker.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                datePicker.show();
            }
        });
        infant_DOB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePicker = new DatePickerDialog(PassengerDetails.this, android.R.style.Theme_Holo_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        String date = String.valueOf(dayOfMonth) + "/" + String.valueOf(monthOfYear + 1)
                                + "/" + String.valueOf(year);
                        infant_DOB2.setText(date);
                    }
                }, yy, mm, dd);
                datePicker.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                datePicker.show();

            }
        });
        infant_DOB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePicker = new DatePickerDialog(PassengerDetails.this, android.R.style.Theme_Holo_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        String date = String.valueOf(dayOfMonth) + "/" + String.valueOf(monthOfYear + 1)
                                + "/" + String.valueOf(year);
                        infant_DOB3.setText(date);
                    }
                }, yy, mm, dd);
                datePicker.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                datePicker.show();

            }
        });
        infant_DOB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePicker = new DatePickerDialog(PassengerDetails.this, android.R.style.Theme_Holo_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        String date = String.valueOf(dayOfMonth) + "/" + String.valueOf(monthOfYear + 1)
                                + "/" + String.valueOf(year);
                        infant_DOB4.setText(date);
                    }
                }, yy, mm, dd);
                datePicker.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                datePicker.show();
            }
        });
    }

    public void applyForCoupon(View view) {

        String value;
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        Log.i(TAG, "Inside applyForCoupon method");
        String URL = "https://www.farehawker.com/api/coupon_code.php?coupon_code=" + couponCode.getText();
        JSONObject jsonObject = new JSONObject();
// prepare the Request

        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.GET, URL,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        Log.d("my_res", response.toString());

                        String coupon_res = response.toString();
                        try {
                            Log.i(TAG, "Inside on Response");
                            Log.i(TAG, response.get("value").toString());
                            int my_amount = Integer.parseInt(response.get("value").toString());
                            Log.i("my_amount", String.valueOf(my_amount));
                            String value = response.get("value").toString();
                            //value is discount amount from Total fare
                            //Suppose value is equals to 9
                            //Total fare is 100
                            //Then fare after discount is =total-value;
                            //  int amount = Integer.parseInt(TotalFare.getText().toString());

                            if (response.get("value").toString() == null) {
                                Log.i("Response1073", response.get("value").toString());
                                Toast.makeText(PassengerDetails.this, "invalid coupon", Toast.LENGTH_SHORT).show();

                            } else {
                                if (couponValidity == 1) {
                                    TotalFare.setText(String.valueOf(Integer.parseInt(TotalFare.getText().toString()) - my_amount));
                                    //set couponValidity to zero.Since Coupon has been used once it not valid now
                                    couponValidity = 0;
                                    Toast.makeText(PassengerDetails.this, "Coupon Code is valid for once", Toast.LENGTH_SHORT);
                                    Log.d("my_minus", String.valueOf(TotalFare));
                                } else {
                                    Toast.makeText(PassengerDetails.this, "You have already used this coupon!", Toast.LENGTH_LONG).show();
                                }
                            }
                        } catch (JSONException je) {
                            Log.i(TAG, je.toString());
                        }
                        // check the Response Code

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i(TAG, error.toString());
                Toast.makeText(PassengerDetails.this, "Invalid Coupon Code", Toast.LENGTH_LONG).show();
            }
        });
        requestQueue.add(jsonRequest);
    }//End of method applyForCoupon

    public void checkData() {

        //edit_txt = adultOneFirstName.getText().toString();
        if (isEmpty(adultOneFirstName.getText().toString())) {

            adultOneFirstName.setError("Please enter your first name");
            adultOneFirstName.requestFocus();
            return;
        }
        if (isEmpty(adultOneLastName.getText().toString())) {
            adultOneLastName.setError("Please enter your Last name");
            adultOneFirstName.requestFocus();
            return;
        }

    }//End of checkData method
}//End of Class PassengerDetails




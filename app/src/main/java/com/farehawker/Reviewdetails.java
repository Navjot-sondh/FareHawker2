package com.farehawker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Reviewdetails extends AppCompatActivity {
TextView adultreview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent= getIntent();
      String  adf = intent.getStringExtra("adF");
        String  adl = intent.getStringExtra("adL");
        setContentView(R.layout.activity_reviewdetails);
        adultreview=(TextView)findViewById(R.id.adultreview);
        adultreview.setText(String.valueOf(adf)+String.valueOf(adl));
    }
}

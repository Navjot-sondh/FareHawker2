package com.farehawker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Reviewdetails extends AppCompatActivity
{
    TextView adultreview;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewdetails);
        Intent intent= getIntent();
        String adultCount=intent.getStringExtra("adultCount");
        String childCount=intent.getStringExtra("childCount");
        String infantCount=intent.getStringExtra("infantCount");
        Toast.makeText(Reviewdetails.this,"Number of adults"+adultCount,Toast.LENGTH_LONG).show();
        //String  adf = intent.getStringExtra("adF");
        //String  adl = intent.getStringExtra("adL");
        //adultreview=(TextView)findViewById(R.id.adultreview);
        //adultreview.setText(String.valueOf(adf)+String.valueOf(adl));
        LinearLayout adult1,adult2,adult3,adult4,adult5,adult6,adult7,adult8,adult9;
        LinearLayout child1,child2,child3,child4,child5,child6,child7,child8;
        LinearLayout infant1,infant2,infant3,infant4,infant5,infant6,infant7,infant8,infant9;
        adult1=findViewById(R.id.adult1);
        adult2=findViewById(R.id.adult2);
        adult3=findViewById(R.id.adult3);
        adult4=findViewById(R.id.adult4);
        adult5=findViewById(R.id.adult5);
        adult6=findViewById(R.id.adult6);
        adult7=findViewById(R.id.adult7);
        adult8=findViewById(R.id.adult8);
        adult9=findViewById(R.id.adult9);

        child1=findViewById(R.id.child1);
        child2=findViewById(R.id.child2);
        child3=findViewById(R.id.child3);
        child4=findViewById(R.id.child4);
        child5=findViewById(R.id.child5);
        child6=findViewById(R.id.child6);
        child7=findViewById(R.id.child7);
        child8=findViewById(R.id.child8);

        infant1=findViewById(R.id.infant1);
        infant2=findViewById(R.id.infant2);
        infant3=findViewById(R.id.infant3);
        infant4=findViewById(R.id.infant4);
        infant5=findViewById(R.id.infant5);
        infant6=findViewById(R.id.infant6);
        infant7=findViewById(R.id.infant7);
        infant8=findViewById(R.id.infant8);
        infant9=findViewById(R.id.infant9);
    }
}

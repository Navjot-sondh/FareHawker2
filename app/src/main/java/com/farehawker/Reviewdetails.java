package com.farehawker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Reviewdetails extends AppCompatActivity
{
    String TAG="Reviewdetails";
    LinearLayout adult1,adult2,adult3,adult4,adult5,adult6,adult7,adult8,adult9;
    LinearLayout child1,child2,child3,child4,child5,child6,child7,child8;
    LinearLayout infant1,infant2,infant3,infant4,infant5,infant6,infant7,infant8,infant9;
    TextView adultreview;

    String adultCount;
    String childCount;
    String infantCount;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewdetails);
        Intent intent= getIntent();
        adultCount=intent.getStringExtra("adultCount");
        childCount=intent.getStringExtra("childCount");
        infantCount=intent.getStringExtra("infantCount");
        Toast.makeText(Reviewdetails.this,"Number of adults"+adultCount,Toast.LENGTH_LONG).show();
        String  adf = intent.getStringExtra("adF");
        //String  adl = intent.getStringExtra("adL");
        //adultreview=(TextView)findViewById(R.id.adultreview);
        //adultreview.setText(String.valueOf(adf)+String.valueOf(adl));
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
        makeVisible();
    }//End of onCreate method
    public void makeVisible()
    {
        if(Integer.parseInt(adultCount)==1)
        {
            adult2.setVisibility(View.GONE);
            adult3.setVisibility(View.GONE);
            adult4.setVisibility(View.GONE);
            adult5.setVisibility(View.GONE);
            adult6.setVisibility(View.GONE);
            adult7.setVisibility(View.GONE);
            adult8.setVisibility(View.GONE);
            adult9.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(adultCount)==2)
        {
            adult3.setVisibility(View.GONE);
            adult4.setVisibility(View.GONE);
            adult5.setVisibility(View.GONE);
            adult6.setVisibility(View.GONE);
            adult7.setVisibility(View.GONE);
            adult8.setVisibility(View.GONE);
            adult9.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(adultCount)==3)
        {
            adult4.setVisibility(View.GONE);
            adult5.setVisibility(View.GONE);
            adult6.setVisibility(View.GONE);
            adult7.setVisibility(View.GONE);
            adult8.setVisibility(View.GONE);
            adult9.setVisibility(View.GONE);
        }

        else if(Integer.parseInt(adultCount)==4)
        {
            adult5.setVisibility(View.GONE);
            adult6.setVisibility(View.GONE);
            adult7.setVisibility(View.GONE);
            adult8.setVisibility(View.GONE);
            adult9.setVisibility(View.GONE);
        }

        else if(Integer.parseInt(adultCount)==5)
        {
            adult6.setVisibility(View.GONE);
            adult7.setVisibility(View.GONE);
            adult8.setVisibility(View.GONE);
            adult9.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(adultCount)==6)
        {
            adult7.setVisibility(View.GONE);
            adult8.setVisibility(View.GONE);
            adult9.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(adultCount)==7)
        {
            adult8.setVisibility(View.GONE);
            adult9.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(adultCount)==8)
        {
            adult9.setVisibility(View.GONE);
        }

        if(Integer.parseInt(infantCount)==0)
        {
            infant1.setVisibility(View.GONE);
            infant2.setVisibility(View.GONE);
            infant3.setVisibility(View.GONE);
            infant4.setVisibility(View.GONE);
            infant5.setVisibility(View.GONE);
            infant6.setVisibility(View.GONE);
            infant7.setVisibility(View.GONE);
            infant8.setVisibility(View.GONE);
            infant9.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(infantCount)==1)
        {
            infant2.setVisibility(View.GONE);
            infant3.setVisibility(View.GONE);
            infant4.setVisibility(View.GONE);
            infant5.setVisibility(View.GONE);
            infant6.setVisibility(View.GONE);
            infant7.setVisibility(View.GONE);
            infant8.setVisibility(View.GONE);
            infant9.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(infantCount)==2)
        {
            infant3.setVisibility(View.GONE);
            infant4.setVisibility(View.GONE);
            infant5.setVisibility(View.GONE);
            infant6.setVisibility(View.GONE);
            infant7.setVisibility(View.GONE);
            infant8.setVisibility(View.GONE);
            infant9.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(infantCount)==3)
        {
            infant4.setVisibility(View.GONE);
            infant5.setVisibility(View.GONE);
            infant6.setVisibility(View.GONE);
            infant7.setVisibility(View.GONE);
            infant8.setVisibility(View.GONE);
            infant9.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(infantCount)==4)
        {
            infant2.setVisibility(View.GONE);
            infant3.setVisibility(View.GONE);
            infant4.setVisibility(View.GONE);
            infant5.setVisibility(View.GONE);
            infant6.setVisibility(View.GONE);
            infant7.setVisibility(View.GONE);
            infant8.setVisibility(View.GONE);
            infant9.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(infantCount)==5)
        {
            infant6.setVisibility(View.GONE);
            infant7.setVisibility(View.GONE);
            infant8.setVisibility(View.GONE);
            infant9.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(infantCount)==6)
        {
            infant7.setVisibility(View.GONE);
            infant8.setVisibility(View.GONE);
            infant9.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(infantCount)==7)
        {
            infant8.setVisibility(View.GONE);
            infant9.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(infantCount)==8)
        {
            infant9.setVisibility(View.GONE);
        }
        if(Integer.parseInt(childCount)==0)
        {
            child1.setVisibility(View.GONE);
            child2.setVisibility(View.GONE);
            child3.setVisibility(View.GONE);
            child4.setVisibility(View.GONE);
            child5.setVisibility(View.GONE);
            child6.setVisibility(View.GONE);
            child7.setVisibility(View.GONE);
            child8.setVisibility(View.GONE);
        }
        else  if(Integer.parseInt(childCount)==1)
        {
           child2.setVisibility(View.GONE);
            child3.setVisibility(View.GONE);
            child4.setVisibility(View.GONE);
            child5.setVisibility(View.GONE);
            child6.setVisibility(View.GONE);
            child7.setVisibility(View.GONE);
            child8.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(childCount)==2)
        {
            child3.setVisibility(View.GONE);
            child4.setVisibility(View.GONE);
            child5.setVisibility(View.GONE);
            child6.setVisibility(View.GONE);
            child7.setVisibility(View.GONE);
            child8.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(childCount)==3)
        {
            child4.setVisibility(View.GONE);
            child5.setVisibility(View.GONE);
            child6.setVisibility(View.GONE);
            child7.setVisibility(View.GONE);
            child8.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(childCount)==4)
        {
            child5.setVisibility(View.GONE);
            child6.setVisibility(View.GONE);
            child7.setVisibility(View.GONE);
            child8.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(childCount)==5)
        {
            child5.setVisibility(View.GONE);
            child6.setVisibility(View.GONE);
            child7.setVisibility(View.GONE);
            child8.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(childCount)==6)
        {
            child7.setVisibility(View.GONE);
            child8.setVisibility(View.GONE);
        }
        else if(Integer.parseInt(childCount)==7)
        {
            child8.setVisibility(View.GONE);
        }
    }//End of makeVisible method
}

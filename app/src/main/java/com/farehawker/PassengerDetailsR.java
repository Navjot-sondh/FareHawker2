package com.farehawker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

class PassengerDetailsR extends AppCompatActivity
{
    Intent intent;
    String adultCount;
    String childCount;
    String infantCount;
    LinearLayout linear_adult1,linear_adult2,linear_adult3,linear_adult4,linear_adult5,linear_adult6,linear_adult7,linear_adult8,linear_adult9;
    LinearLayout linear_child1,linear_child2,linear_child3,linear_child4,linear_child5,linear_child6,linear_child7,linear_child8;
    LinearLayout linear_infant1,linear_infant2,linear_infant3,linear_infant4,linear_infant5,linear_infant6,linear_infant7,linear_infant8,linear_infant9;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_details);
        intent=getIntent();
        adultCount=intent.getStringExtra("adultround");
        childCount=intent.getStringExtra("childround");
        infantCount=intent.getStringExtra("infantsround");

        linear_adult1=findViewById(R.id.linear_adult1);
        linear_adult2=findViewById(R.id.linear_adult2);
        linear_adult3=findViewById(R.id.linear_adult3);
        linear_adult4=findViewById(R.id.linear_adult4);
        linear_adult5=findViewById(R.id.linear_adult5);
        linear_adult6=findViewById(R.id.linear_adult6);
        linear_adult7=findViewById(R.id.linear_adult7);
        linear_adult8=findViewById(R.id.linear_adult8);
        linear_adult9=findViewById(R.id.linear_adult9);

        linear_child1=findViewById(R.id.linear_child1);
        linear_child2=findViewById(R.id.linear_child2);
        linear_child3=findViewById(R.id.linear_child3);
        linear_child4=findViewById(R.id.linear_child4);
        linear_child5=findViewById(R.id.linear_child5);
        linear_child6=findViewById(R.id.linear_child6);
        linear_child7=findViewById(R.id.linear_child7);
        linear_child8=findViewById(R.id.linear_child8);

        linear_infant1=findViewById(R.id.linear_infants1);
        linear_infant2=findViewById(R.id.linear_infants2);
        linear_infant3=findViewById(R.id.linear_infants3);
        linear_infant4=findViewById(R.id.linear_infants4);
        linear_infant5=findViewById(R.id.linear_infants5);
        linear_infant6=findViewById(R.id.linear_infants6);
        linear_infant7=findViewById(R.id.linear_infants7);
        linear_infant8=findViewById(R.id.linear_infants8);
        linear_infant9=findViewById(R.id.linear_infants9);

        if(Integer.parseInt(adultCount)==1)
        {
            linear_adult1.setVisibility(View.VISIBLE);
            linear_adult2.setVisibility(View.GONE);
            linear_adult3.setVisibility(View.GONE);
            linear_adult4.setVisibility(View.GONE);
            linear_adult5.setVisibility(View.GONE);
            linear_adult6.setVisibility(View.GONE);
            linear_adult7.setVisibility(View.GONE);
            linear_adult8.setVisibility(View.GONE);
            linear_adult9.setVisibility(View.GONE);


            if(Integer.parseInt(childCount)==1)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.GONE);
                linear_child3.setVisibility(View.GONE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);


            }
            else if(Integer.parseInt(childCount)==2)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.GONE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if (Integer.parseInt(childCount)==3)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==4)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==5)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==6)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==7)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.VISIBLE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==8)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.VISIBLE);
                linear_child8.setVisibility(View.VISIBLE);

            }
            if(Integer.parseInt(infantCount)==1)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.GONE);
                linear_infant3.setVisibility(View.GONE);
                linear_infant4.setVisibility(View.GONE);
                linear_infant5.setVisibility(View.GONE);
                linear_infant6.setVisibility(View.GONE);
                linear_infant7.setVisibility(View.GONE);
                linear_infant8.setVisibility(View.GONE);
                linear_infant9.setVisibility(View.GONE);

            }

        }//end of outer if
        if(Integer.parseInt(adultCount)==2)
        {
            linear_adult1.setVisibility(View.VISIBLE);
            linear_adult2.setVisibility(View.VISIBLE);
            linear_adult3.setVisibility(View.GONE);
            linear_adult4.setVisibility(View.GONE);
            linear_adult5.setVisibility(View.GONE);
            linear_adult6.setVisibility(View.GONE);
            linear_adult7.setVisibility(View.GONE);
            linear_adult8.setVisibility(View.GONE);
            linear_adult9.setVisibility(View.GONE);

            if(Integer.parseInt(childCount)==1)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.GONE);
                linear_child3.setVisibility(View.GONE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==2)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.GONE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);
            }
            else if (Integer.parseInt(childCount)==3)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);
            }
            else if(Integer.parseInt(childCount)==4)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);
            }
            else if(Integer.parseInt(childCount)==5)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);
            }
            else if(Integer.parseInt(childCount)==6)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);


            }
            else if(Integer.parseInt(childCount)==7)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.VISIBLE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==8)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.VISIBLE);
                linear_child8.setVisibility(View.VISIBLE);

            }
            if(Integer.parseInt(infantCount)==1)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.GONE);
                linear_infant3.setVisibility(View.GONE);
                linear_infant4.setVisibility(View.GONE);
                linear_infant5.setVisibility(View.GONE);
                linear_infant6.setVisibility(View.GONE);
                linear_infant7.setVisibility(View.GONE);
                linear_infant8.setVisibility(View.GONE);
                linear_infant9.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(infantCount)==2)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.GONE);
                linear_infant4.setVisibility(View.GONE);
                linear_infant5.setVisibility(View.GONE);
                linear_infant6.setVisibility(View.GONE);
                linear_infant7.setVisibility(View.GONE);
                linear_infant8.setVisibility(View.GONE);
                linear_infant9.setVisibility(View.GONE);

            }

            else if(Integer.parseInt(infantCount)==3)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.GONE);
                linear_infant5.setVisibility(View.GONE);
                linear_infant6.setVisibility(View.GONE);
                linear_infant7.setVisibility(View.GONE);
                linear_infant8.setVisibility(View.GONE);
                linear_infant9.setVisibility(View.GONE);

            }

            else if(Integer.parseInt(infantCount)==4)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.GONE);
                linear_infant6.setVisibility(View.GONE);
                linear_infant7.setVisibility(View.GONE);
                linear_infant8.setVisibility(View.GONE);
                linear_infant9.setVisibility(View.GONE);

            }

            else if(Integer.parseInt(infantCount)==5)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);

                linear_infant4.setVisibility(View.VISIBLE);

                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.GONE);
                linear_infant7.setVisibility(View.GONE);
                linear_infant8.setVisibility(View.GONE);
                linear_infant9.setVisibility(View.GONE);

            }

            else if(Integer.parseInt(infantCount)==6)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant7.setVisibility(View.GONE);
                linear_infant8.setVisibility(View.GONE);
                linear_infant9.setVisibility(View.GONE);

            }

            else if(Integer.parseInt(infantCount)==7)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant7.setVisibility(View.VISIBLE);
                linear_infant8.setVisibility(View.GONE);
                linear_infant9.setVisibility(View.GONE);

            }

            else if(Integer.parseInt(infantCount)==8)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant7.setVisibility(View.VISIBLE);
                linear_infant8.setVisibility(View.VISIBLE);
                linear_infant9.setVisibility(View.GONE);


            }
            else if(Integer.parseInt(infantCount)==9)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant7.setVisibility(View.VISIBLE);
                linear_infant8.setVisibility(View.VISIBLE);
                linear_infant9.setVisibility(View.VISIBLE);
            }



        }//end of outer if
        if(Integer.parseInt(adultCount)==3)
        {
            linear_adult1.setVisibility(View.VISIBLE);
            linear_adult2.setVisibility(View.VISIBLE);
            linear_adult3.setVisibility(View.VISIBLE);
            linear_adult4.setVisibility(View.GONE);
            linear_adult5.setVisibility(View.GONE);
            linear_adult6.setVisibility(View.GONE);
            linear_adult7.setVisibility(View.GONE);
            linear_adult8.setVisibility(View.GONE);
            linear_adult9.setVisibility(View.GONE);

            if(Integer.parseInt(childCount)==1)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.GONE);
                linear_child3.setVisibility(View.GONE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==2)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.GONE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if (Integer.parseInt(childCount)==3)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==4)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }

            else if(Integer.parseInt(childCount)==5)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }

            else if(Integer.parseInt(childCount)==6)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==7)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.VISIBLE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==8)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.VISIBLE);
                linear_child8.setVisibility(View.VISIBLE);

            }
            if(Integer.parseInt(infantCount)==1)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }
            else if(Integer.parseInt(infantCount)==2)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==3)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==4)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==5)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);

                linear_infant4.setVisibility(View.VISIBLE);

                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==6)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==7)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant7.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==8)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant7.setVisibility(View.VISIBLE);
                linear_infant8.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);


            }
            else if(Integer.parseInt(infantCount)==9)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant7.setVisibility(View.VISIBLE);
                linear_infant8.setVisibility(View.VISIBLE);
                linear_infant9.setVisibility(View.VISIBLE);
            }



        }
        if(Integer.parseInt(adultCount)==4)
         {
        linear_adult1.setVisibility(View.VISIBLE);
        linear_adult2.setVisibility(View.VISIBLE);
        linear_adult3.setVisibility(View.VISIBLE);
        linear_adult4.setVisibility(View.VISIBLE);

        if(Integer.parseInt(childCount)==1)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.GONE);
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==2)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if (Integer.parseInt(childCount)==3)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==4)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==5)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==6)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==7)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.VISIBLE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==8)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.VISIBLE);
            linear_child8.setVisibility(View.VISIBLE);

        }
        if(Integer.parseInt(infantCount)==1)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }
        else if(Integer.parseInt(infantCount)==2)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==3)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==4)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==5)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);

            linear_infant4.setVisibility(View.VISIBLE);

            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==6)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==7)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==8)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant8.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);


        }
        else if(Integer.parseInt(infantCount)==9)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant8.setVisibility(View.VISIBLE);
            linear_infant9.setVisibility(View.VISIBLE);
        }



    }
        if(Integer.parseInt(adultCount)==5)
        {
            linear_adult1.setVisibility(View.VISIBLE);
            linear_adult2.setVisibility(View.VISIBLE);
            linear_adult3.setVisibility(View.VISIBLE);
            linear_adult4.setVisibility(View.VISIBLE);
            linear_adult5.setVisibility(View.VISIBLE);

            if(Integer.parseInt(childCount)==1)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.GONE);
                linear_child3.setVisibility(View.GONE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==2)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.GONE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if (Integer.parseInt(childCount)==3)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.GONE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }

            else if(Integer.parseInt(childCount)==4)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.GONE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }

            else if(Integer.parseInt(childCount)==5)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.GONE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==6)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.GONE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==7)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.VISIBLE);
                linear_child8.setVisibility(View.GONE);

            }
            else if(Integer.parseInt(childCount)==8)
            {
                linear_child1.setVisibility(View.VISIBLE);
                linear_child2.setVisibility(View.VISIBLE);
                linear_child3.setVisibility(View.VISIBLE);
                linear_child4.setVisibility(View.VISIBLE);
                linear_child5.setVisibility(View.VISIBLE);
                linear_child6.setVisibility(View.VISIBLE);
                linear_child7.setVisibility(View.VISIBLE);
                linear_child8.setVisibility(View.VISIBLE);

            }
            if(Integer.parseInt(infantCount)==1)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }
            else if(Integer.parseInt(infantCount)==2)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==3)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==4)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==5)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);

                linear_infant4.setVisibility(View.VISIBLE);

                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==6)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==7)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant7.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);

            }

            else if(Integer.parseInt(infantCount)==8)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant7.setVisibility(View.VISIBLE);
                linear_infant8.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant1.setVisibility(View.VISIBLE);


            }
            else if(Integer.parseInt(infantCount)==9)
            {
                linear_infant1.setVisibility(View.VISIBLE);
                linear_infant2.setVisibility(View.VISIBLE);
                linear_infant3.setVisibility(View.VISIBLE);
                linear_infant4.setVisibility(View.VISIBLE);
                linear_infant5.setVisibility(View.VISIBLE);
                linear_infant6.setVisibility(View.VISIBLE);
                linear_infant7.setVisibility(View.VISIBLE);
                linear_infant8.setVisibility(View.VISIBLE);
                linear_infant9.setVisibility(View.VISIBLE);
            }



        }
        if(Integer.parseInt(adultCount)==6)
        {
        linear_adult1.setVisibility(View.VISIBLE);
        linear_adult2.setVisibility(View.VISIBLE);
        linear_adult3.setVisibility(View.VISIBLE);
        linear_adult4.setVisibility(View.VISIBLE);
        linear_adult5.setVisibility(View.VISIBLE);
        linear_adult6.setVisibility(View.VISIBLE);

            if(Integer.parseInt(childCount)==1)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.GONE);
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==2)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if (Integer.parseInt(childCount)==3)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==4)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }

        else if(Integer.parseInt(childCount)==5)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==6)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);


        }
        else if(Integer.parseInt(childCount)==7)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.VISIBLE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==8)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.VISIBLE);
            linear_child8.setVisibility(View.VISIBLE);

        }
        if(Integer.parseInt(infantCount)==1)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }
        else if(Integer.parseInt(infantCount)==2)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==3)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==4)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==5)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);

            linear_infant4.setVisibility(View.VISIBLE);

            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==6)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==7)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==8)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant8.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);


        }
        else if(Integer.parseInt(infantCount)==9)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant8.setVisibility(View.VISIBLE);
            linear_infant9.setVisibility(View.VISIBLE);
        }



    }
    else if(Integer.parseInt(adultCount)==7)
    {
        linear_adult1.setVisibility(View.VISIBLE);
        linear_adult2.setVisibility(View.VISIBLE);
        linear_adult3.setVisibility(View.VISIBLE);
        linear_adult4.setVisibility(View.VISIBLE);
        linear_adult5.setVisibility(View.VISIBLE);
        linear_adult6.setVisibility(View.VISIBLE);
        linear_adult7.setVisibility(View.VISIBLE);

        if(Integer.parseInt(childCount)==1)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.GONE);
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==2)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if (Integer.parseInt(childCount)==3)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==4)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==5)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==6)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==7)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.VISIBLE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==8)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.VISIBLE);
            linear_child8.setVisibility(View.VISIBLE);

        }
        if(Integer.parseInt(infantCount)==1)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }
        else if(Integer.parseInt(infantCount)==2)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==3)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==4)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==5)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);

            linear_infant4.setVisibility(View.VISIBLE);

            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==6)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==7)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
                linear_infant7.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==8)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant8.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);


        }
        else if(Integer.parseInt(infantCount)==9)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant8.setVisibility(View.VISIBLE);
            linear_infant9.setVisibility(View.VISIBLE);
        }



    }
    else if(Integer.parseInt(adultCount)==8)
    {
        linear_adult1.setVisibility(View.VISIBLE);
        linear_adult2.setVisibility(View.VISIBLE);

        if(Integer.parseInt(childCount)==1)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.GONE);
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==2)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if (Integer.parseInt(childCount)==3)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==4)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==5)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==6)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==7)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.VISIBLE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==8)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.VISIBLE);
            linear_child8.setVisibility(View.VISIBLE);

        }
        if(Integer.parseInt(infantCount)==1)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }
        else if(Integer.parseInt(infantCount)==2)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==3)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==4)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==5)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);

            linear_infant4.setVisibility(View.VISIBLE);

            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==6)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==7)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==8)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant8.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);


        }
        else if(Integer.parseInt(infantCount)==9)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant8.setVisibility(View.VISIBLE);
            linear_infant9.setVisibility(View.VISIBLE);
        }



    }
    else if(Integer.parseInt(adultCount)==9)
    {
        linear_adult1.setVisibility(View.VISIBLE);
        linear_adult2.setVisibility(View.VISIBLE);
        linear_adult3.setVisibility(View.VISIBLE);
          linear_adult4.setVisibility(View.VISIBLE);
           linear_adult5.setVisibility(View.VISIBLE);
            linear_adult6.setVisibility(View.VISIBLE);
             linear_adult7.setVisibility(View.VISIBLE);
              linear_adult8.setVisibility(View.VISIBLE);
               linear_adult9.setVisibility(View.VISIBLE);
        if(Integer.parseInt(childCount)==1)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.GONE);
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==2)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.GONE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if (Integer.parseInt(childCount)==3)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==4)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.GONE);
            linear_child5.setVisibility(View.GONE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==5)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.GONE);
            linear_child7.setVisibility(View.GONE);
            linear_child8.setVisibility(View.GONE);

        }
        else if(Integer.parseInt(childCount)==6)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child8.setVisibility(View.GONE);


        }
        else if(Integer.parseInt(childCount)==7)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.VISIBLE);
            linear_child8.setVisibility(View.GONE);


        }
        else if(Integer.parseInt(childCount)==8)
        {
            linear_child1.setVisibility(View.VISIBLE);
            linear_child2.setVisibility(View.VISIBLE);
            linear_child3.setVisibility(View.VISIBLE);
            linear_child4.setVisibility(View.VISIBLE);
            linear_child5.setVisibility(View.VISIBLE);
            linear_child6.setVisibility(View.VISIBLE);
            linear_child7.setVisibility(View.VISIBLE);
            linear_child8.setVisibility(View.VISIBLE);

        }
        if(Integer.parseInt(infantCount)==1)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }
        else if(Integer.parseInt(infantCount)==2)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==3)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==4)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==5)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);

            linear_infant4.setVisibility(View.VISIBLE);

            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==6)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==7)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);

        }

        else if(Integer.parseInt(infantCount)==8)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant8.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant1.setVisibility(View.VISIBLE);


        }
        else if(Integer.parseInt(infantCount)==9)
        {
            linear_infant1.setVisibility(View.VISIBLE);
            linear_infant2.setVisibility(View.VISIBLE);
            linear_infant3.setVisibility(View.VISIBLE);
            linear_infant4.setVisibility(View.VISIBLE);
            linear_infant5.setVisibility(View.VISIBLE);
            linear_infant6.setVisibility(View.VISIBLE);
            linear_infant7.setVisibility(View.VISIBLE);
            linear_infant8.setVisibility(View.VISIBLE);
            linear_infant9.setVisibility(View.VISIBLE);
        }



    }
    }//End of Create method
}//End of PassengerDetailsR
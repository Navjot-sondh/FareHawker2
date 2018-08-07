package com.farehawker;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

public class Search extends AppCompatActivity
{
    String URL="http://api.tektravels.com/BookingEngineService_Air/AirService.svc/rest/Search/";
    JSONArray jsonArray;
    JSONObject jsonObject;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState)
    {
        super.onCreate(savedInstanceState, persistentState);
        sendRequest();

    }
    public void sendRequest()
    {
        try {
            RequestQueue requestQueue =  Volley.newRequestQueue(this);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("Origin", "DEL");
            jsonObject.put("Destination", "VNS");
            jsonObject.put("FlightCabinClass","2");
            jsonObject.put("PreferredDepartureTime","2018-08-06:T");
        }
        catch(Exception e)
        {

        }
    }
}

package com.farehawker;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.farehawker.Adaptors.AppController;
import com.farehawker.Adaptors.ListViewAdapter;
import com.farehawker.Model.MovieNames;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DestinationSearchActivity extends AppCompatActivity {

    private static final String tag = MainActivity.class.getSimpleName();
    private static final String url = "https://www.farehawker.com/api/airpot-code.php";
    private List<MovieNames> mArrayListdes = new ArrayList<>();
    private ListView listViewdes;
    private ListViewAdapter adapterdes;
    private EditText editsearchdes ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination_search);
        listViewdes = (ListView) findViewById(R.id.listviewdestination);
        adapterdes = new ListViewAdapter(this,mArrayListdes);
        listViewdes.setAdapter(adapterdes);

        final String descode = getIntent().getStringExtra("orair");
        final String descity = getIntent().getStringExtra("orcity");
        final String desicountry=getIntent().getStringExtra("oricountry");
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading please wait ...");
        progressDialog.show();

        JsonArrayRequest jsonreq = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>(){
                    @Override
                    public void onResponse(JSONArray response) {

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject obj = response.getJSONObject(i);
                                MovieNames dataSet = new MovieNames();
                                dataSet.setName(obj.getString("airport_code"));
                                dataSet.setFull(obj.getString("city_name"));
                                dataSet.setCountry(obj.getString("country_name"));
                                mArrayListdes.add(dataSet);
                            } catch (JSONException e){
                                e.printStackTrace();
                            }
                            progressDialog.dismiss();
                        }
                        adapterdes.notifyDataSetChanged();
                        progressDialog.dismiss();
                    }
                },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                VolleyLog.d(tag, "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();
                // hide the progress dialog
            }
        });
        AppController.getInstance().addToRequestQueue(jsonreq);
        // Locate the EditText in listview_main.xml
        editsearchdes = (EditText) findViewById(R.id.searchdestination);
        editsearchdes.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
                String text = editsearchdes.getText().toString().toLowerCase(Locale.getDefault());
                adapterdes.getFilter().filter(text);
            }
            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1,
                                          int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                 String current = "";
//                if(!s.toString().equals(current) && !s.toString().isEmpty()){
//                    String cleanString = s.toString().replaceAll("[$,.]", "");
//
//                    double parsed = Double.parseDouble(cleanString);
//                    String formated = NumberFormat.getCurrencyInstance().format((parsed/100));
//
//                    current = formated;
//                    editsearchdes.setText(formated);
//                    editsearchdes.setSelection(formated.length());
//                }

                // TODO Auto-generated method stub
            }
        });
        listViewdes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MovieNames model=(MovieNames)adapterdes.getItem(position);
                String nameidd=model.getName();
                String cityidd=model.getFull();
                String coutrydes=model.getCountry();
                Log.d("msg"," "+nameidd+cityidd+coutrydes);
                Intent in=new Intent(DestinationSearchActivity.this,FlightbookingActivity.class);
                in.putExtra("airport_codedestination",nameidd);
               in.putExtra("citynamedestination",cityidd);
               in.putExtra("Countrydes",coutrydes);

               in.putExtra("accdescountry",desicountry);
               in.putExtra("accdescode",descode);
               in.putExtra("accdescity",descity);
               startActivity(in);
              // Toast.makeText(DestinationSearchActivity.this,"selected"+nameidd+cityidd+coutrydes+"\n"+desicountry, Toast.LENGTH_SHORT).show();
            }
        });
    }
}



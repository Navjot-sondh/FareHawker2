package com.farehawker;

import
        android.app.ProgressDialog;
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

import java.util.ArrayList;
import java.util.List;

public class SearchviewActivity extends AppCompatActivity {
    // Declare Variables

//    private String[] moviewList;
    private static final String tag = MainActivity.class.getSimpleName();
    private static final String url = "https://www.farehawker.com/api/airpot-code.php";
    private List<MovieNames> mArrayList = new ArrayList<>();
    private ListView listView;
    private ListViewAdapter adapter;
    private EditText editsearch ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchview);
        final String serchr = getIntent().getStringExtra("dupair");
        final String serchrity = getIntent().getStringExtra("dupcity");
        final String sercountry=getIntent().getStringExtra("dupcountrydest");
        listView = (ListView) findViewById(R.id.listview);
        adapter = new ListViewAdapter(this,mArrayList);
        listView.setAdapter(adapter);
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
                                mArrayList.add(dataSet);
                            } catch (JSONException e){
                                e.printStackTrace();
                            }
                            progressDialog.dismiss();
                        }
                        adapter.notifyDataSetChanged();
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
        editsearch = (EditText) findViewById(R.id.search);
        editsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1,
                                          int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence text, int arg1, int arg2,
                                      int arg3) {

               // String text = editsearch.getText().toString().toLowerCase(Locale.getDefault());
                SearchviewActivity.this.adapter.getFilter().filter(text);
                // notify to listview for refresh
                // TODO Auto-generated method stub
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MovieNames model=(MovieNames) adapter.getItem(position);
                String nameid=model.getName();
                String cityid=model.getFull();
                String country=model.getCountry();
                Log.d("msg"," "+nameid+cityid+country);
                Intent in=new Intent(SearchviewActivity.this,FlightbookingActivity.class);

                in.putExtra("airport_code",nameid);
                in.putExtra("cityname",cityid);
                in.putExtra("countryname",country);


                in.putExtra("dupcountry",sercountry);
                in.putExtra("duprair",serchr);
                in.putExtra("duprcity",serchrity);
                startActivity(in);
            // Toast.makeText(SearchviewActivity.this,"selected"+nameid+cityid+country+"\n"+sercountry, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

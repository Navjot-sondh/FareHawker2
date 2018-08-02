package com.farehawker.Adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.farehawker.Model.Oneway_Farerulesmodel;
import com.farehawker.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by 1 on 4/13/2018.
 */

public class OnewaytermsAdaptr extends BaseAdapter {
    Context tcontext;
    private LayoutInflater inflater;
    private List<Oneway_Farerulesmodel> onewattermlist;
    public OnewaytermsAdaptr(Context tcontext, List<Oneway_Farerulesmodel> onewattermlist) {
        this.tcontext = tcontext;
       this.onewattermlist = onewattermlist;
    }

    @Override
    public int getCount() {
        return onewattermlist.size();
   }
        @Override
    public Object getItem(int position) {
        return onewattermlist.get(position);
    }
        @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
   public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
           inflater = (LayoutInflater) tcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }if (convertView == null) {
           convertView = inflater.inflate(R.layout.termsonewaylistlayout, null);
        }
        TextView origincity_one=(TextView)convertView.findViewById(R.id.origin_origin_one);
       TextView origindestinaton_one=(TextView)convertView.findViewById(R.id.origin_destination_one);
        TextView originairline_one=(TextView)convertView.findViewById(R.id.origin_airline_one);
        TextView origindetails_one=(TextView)convertView.findViewById(R.id.orgin_details_one);
       ImageView originimage_one=(ImageView)convertView.findViewById(R.id.origin_image_one);

        Oneway_Farerulesmodel onewlist=onewattermlist.get(position);
        String origins_one=onewlist.getSorigin_oneway();
        String destinations_one=onewlist.getSdestination_oneway();
        String detailss_one=onewlist.getSdetails_oneway();
        String airlines_one=onewlist.getSairline_oneway();
        String retrations=onewlist.getSretraction_oneway();

        origincity_one.setText(origins_one);
        origindestinaton_one.setText(destinations_one);
        originairline_one.setText(airlines_one);
        origindetails_one.setText(detailss_one);
       String key = originairline_one.getText().toString();
       Picasso.with(tcontext)
               .load("https://www.farehawker.com/img/Airlines_logo/"+key+".gif")
               // .load(mDataset.get(position).toString())
               .into(originimage_one);
            return convertView;
    }
    }


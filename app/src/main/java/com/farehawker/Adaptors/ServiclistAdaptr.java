package com.farehawker.Adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.farehawker.Model.Servicelistmodel;
import com.farehawker.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by 1 on 4/11/2018.
 */

public class ServiclistAdaptr extends BaseAdapter{
    Context context;
    private LayoutInflater inflater;
    private List<Servicelistmodel> originservicelist;
    public ServiclistAdaptr(Context context, List<Servicelistmodel> originservice) {
        this.context = context;
        this.originservicelist = originservice;
    }
    @Override
    public int getCount() {
        return originservicelist.size();
    }

    @Override
    public Object getItem(int position) {
        return originservicelist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }if (convertView == null) {
            convertView = inflater.inflate(R.layout.originservice_layout, null);
        }
        TextView realcity=(TextView)convertView.findViewById(R.id.real_origin);
        TextView realdestinaton=(TextView)convertView.findViewById(R.id.real_destination);
        TextView realairline=(TextView)convertView.findViewById(R.id.real_airline);
        TextView realdetails=(TextView)convertView.findViewById(R.id.real_details);
        ImageView realimage=(ImageView)convertView.findViewById(R.id.real_image);
        Servicelistmodel reallist=originservicelist.get(position);
        String originr=reallist.getSorigin();
        String destinationr=reallist.getSdestination();
        String detailsr=reallist.getSdetails();
        String airliner=reallist.getSairline();
        String retrations=reallist.getSretraction();
        realcity.setText(originr);
        realdestinaton.setText(destinationr);
        realairline.setText(airliner);
        realdetails.setText(detailsr);
        String key = realairline.getText().toString();
        Picasso.with(context)
                .load("https://www.farehawker.com/img/Airlines_logo/"+key+".gif")
                // .load(mDataset.get(position).toString())
                .into(realimage);
        return convertView;
    }
}



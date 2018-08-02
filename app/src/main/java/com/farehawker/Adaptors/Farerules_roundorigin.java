package com.farehawker.Adaptors;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.farehawker.Model.Fare_originModel;
import com.farehawker.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by 1 on 4/9/2018.
 */

public class Farerules_roundorigin extends RecyclerView.Adapter<Farerules_roundorigin.ViewHolder>{
    Context mcontext;
    private List<Fare_originModel> originlist;
    public Farerules_roundorigin(Context contex,List mDataset) {
        this.mcontext=contex;
        this.originlist = mDataset;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.farerules_roundorigin_layout, parent, false);
        final ViewHolder viewHoldorigin = new ViewHolder(v);
        return viewHoldorigin;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView origin_fname,origin_fcode,origin_fnumber,ocityname_dep,ocode_dep,
                otime_dep,oterm_dep,ocityname_arr,ocode_arr,otime_arr,
                oterm_arr,origin_duration,orign_checkin,origin_cabin;
        public ImageView image_origin;
        public ViewHolder(View vv) {
            super(vv);
            image_origin=(ImageView) vv.findViewById(R.id.oimage1);
            origin_fname=(TextView)vv.findViewById(R.id.oname1) ;
            origin_fcode=(TextView)vv.findViewById(R.id.ocode1);
            origin_fnumber=(TextView)vv.findViewById(R.id.onumber1);
            ocityname_dep=(TextView)vv.findViewById(R.id.oorigincity1);
            ocode_dep=(TextView)vv.findViewById(R.id.oorigincode1);
            otime_dep=(TextView)vv.findViewById(R.id.oorigintime1);
            oterm_dep=(TextView)vv.findViewById(R.id.ooriginterminal1);
            ocityname_arr=(TextView)vv.findViewById(R.id.oarrivcity1);
            ocode_arr=(TextView)vv.findViewById(R.id.oarrivcode1);
            otime_arr=(TextView)vv.findViewById(R.id.oarrivtime1);
            oterm_arr=(TextView)vv.findViewById(R.id.oarriveterminal1);
            origin_duration=(TextView)vv.findViewById(R.id.oduretionOrigin);
            orign_checkin=(TextView)vv.findViewById(R.id.ocheckin1);
            origin_cabin=(TextView)vv.findViewById(R.id.ocabin1);
            vv.setTag(vv);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder origin, int position) {
        origin.origin_fname.setText(originlist.get(position).getO_fname1());
        origin.origin_fcode.setText(originlist.get(position).getOfcode1());
        origin.origin_fnumber.setText(originlist.get(position).getOnumber1());
        origin.ocityname_dep.setText(originlist.get(position).getOcity1());
        origin.ocode_dep.setText(originlist.get(position).getOcode1());
        origin.oterm_dep.setText(originlist.get(position).getOterm());
        origin.otime_dep.setText(originlist.get(position).getOtime1());
        origin.ocityname_arr.setText(originlist.get(position).getAcity1());
        origin.ocode_arr.setText(originlist.get(position).getAcode1());
        origin.oterm_arr.setText(originlist.get(position).getAterm());
        origin.otime_arr.setText(originlist.get(position).getAtime1());
        origin.orign_checkin.setText(originlist.get(position).getCheckin_origin());
        origin.origin_cabin.setText(originlist.get(position).getCabin_origin());
        origin.origin_duration.setText(originlist.get(position).getOrigin_dura());
        String key = origin.origin_fcode.getText().toString();
        Picasso.with(origin.image_origin.getContext())
                .load("https://www.farehawker.com/img/Airlines_logo/"+key+".gif")
                // .load(mDataset.get(position).toString())
                .into(origin.image_origin);
    }
    @Override
    public int getItemCount() {
        return originlist.size();
    }
}

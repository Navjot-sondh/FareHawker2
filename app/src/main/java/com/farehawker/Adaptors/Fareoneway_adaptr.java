package com.farehawker.Adaptors;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.farehawker.Model.OnewayFare_model;
import com.farehawker.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by 1 on 4/13/2018.
 */

public class Fareoneway_adaptr extends RecyclerView.Adapter<Fareoneway_adaptr.ViewHolder>{
    Context ncontext;
    private List<OnewayFare_model> oneweylist;
    public Fareoneway_adaptr(Context ncontex,List oneweylist) {
           this.ncontext=ncontex;
            this.oneweylist = oneweylist;
       }
    @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fareoneway_layout, parent, false);
            final ViewHolder viewHoldorigin = new ViewHolder(v);
            return viewHoldorigin;
        }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView origin_fname_oneway,origin_fcode_oneway,origin_fnumber_oneway,ocityname_dep_oneway,ocode_dep_oneway,
                    otime_dep_oneway,oterm_dep_oneway,ocityname_arr_oneway,ocode_arr_oneway,otime_arr_oneway,
                    oterm_arr_oneway,origin_duration_oneway,orign_checkin_oneway,origin_cabin_oneway;
           public ImageView image_origin_oneway;
        public ViewHolder(View vvv) {
            super(vvv);
            image_origin_oneway=(ImageView) vvv.findViewById(R.id.oneway_image);
                origin_fname_oneway=(TextView)vvv.findViewById(R.id.oname1_oneway) ;
                origin_fcode_oneway=(TextView)vvv.findViewById(R.id.ocode1_oneway);
                origin_fnumber_oneway=(TextView)vvv.findViewById(R.id.onumber1_oneway);
                ocityname_dep_oneway=(TextView)vvv.findViewById(R.id.oorigincity1_oneway);
                ocode_dep_oneway=(TextView)vvv.findViewById(R.id.oorigincode1_oneway);
                otime_dep_oneway=(TextView)vvv.findViewById(R.id.oorigintime1_oneway);
                oterm_dep_oneway=(TextView)vvv.findViewById(R.id.ooriginterminal1_oneway);
                ocityname_arr_oneway=(TextView)vvv.findViewById(R.id.oarrivcity1_oneway);
                ocode_arr_oneway=(TextView)vvv.findViewById(R.id.oarrivcode1_oneway);
                otime_arr_oneway=(TextView)vvv.findViewById(R.id.oarrivtime1_oneway);
                oterm_arr_oneway=(TextView)vvv.findViewById(R.id.oarriveterminal1_oneway);
                origin_duration_oneway=(TextView)vvv.findViewById(R.id.oduretionOrigin_oneway);
                orign_checkin_oneway=(TextView)vvv.findViewById(R.id.ocheckin1_oneway);
                origin_cabin_oneway=(TextView)vvv.findViewById(R.id.ocabin1_oneway);
               vvv.setTag(vvv);
        }
    }
    @Override
        public void onBindViewHolder(ViewHolder oneway, int position) {
        oneway.origin_fname_oneway.setText(oneweylist.get(position).getO_fname1_oneway());
        oneway.origin_fcode_oneway.setText(oneweylist.get(position).getOfcode1_oneway());
        oneway.origin_fnumber_oneway.setText(oneweylist.get(position).getOfnumber1_oneway());
        oneway.ocityname_dep_oneway.setText(oneweylist.get(position).getOcity1_oneway());
        oneway.ocode_dep_oneway.setText(oneweylist.get(position).getOcode1_oneway());
        oneway.oterm_dep_oneway.setText(oneweylist.get(position).getOterm_oneway());
        oneway.otime_dep_oneway.setText(oneweylist.get(position).getOtime1_oneway());
        oneway.ocityname_arr_oneway.setText(oneweylist.get(position).getAcity1_oneway());
        oneway.ocode_arr_oneway.setText(oneweylist.get(position).getAcode1_oneway());
        oneway.oterm_arr_oneway.setText(oneweylist.get(position).getAterm_oneway());
        oneway.otime_arr_oneway.setText(oneweylist.get(position).getAtime1_oneway());
        oneway.orign_checkin_oneway.setText(oneweylist.get(position).getCheckin_origin_oneway());
        oneway.origin_cabin_oneway.setText(oneweylist.get(position).getCabin_origin_oneway());
        oneway.origin_duration_oneway.setText(oneweylist.get(position).getOrigin_dura_oneway());
        String key = oneway.origin_fcode_oneway.getText().toString();
        Picasso.with(oneway.image_origin_oneway.getContext())
                    .load("https://www.farehawker.com/img/Airlines_logo/"+key+".gif")
                    // .load(mDataset.get(position).toString())
                    .into(oneway.image_origin_oneway);
    }

    @Override
       public int getItemCount() {
            return oneweylist.size();
       }
}

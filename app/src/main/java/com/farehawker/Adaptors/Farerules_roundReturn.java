package com.farehawker.Adaptors;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.farehawker.Model.Fare_returnModel;
import com.farehawker.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by 1 on 4/9/2018.
 */

public class Farerules_roundReturn extends RecyclerView.Adapter<Farerules_roundReturn.ViewHolder> {
    //    tv_log = (TextView) findViewById(R.id.tv_log);
//tv_log.setMovementMethod(new ScrollingMovementMethod());
    //android:scrollbars = "vertical"
    Context ncontext;
    private List<Fare_returnModel> returnlist;
    public Farerules_roundReturn(Context contex,List mDataset) {
        this.ncontext=contex;
        this.returnlist = mDataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.farerules_roundreturn_layout, parent, false);
        final ViewHolder viewHoldreturn = new ViewHolder(v);
        return viewHoldreturn;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView retunrfname,returnfcode,returnfnumber,Rdcity,Rdcode,Rdtime,Rdterm,
                        Racity,Racode,Ratime,Raterm,Returncheckin,Returncabin,Returndura;
        public ImageView returnfimage;

        public ViewHolder(View v) {
            super(v);
            returnfimage=(ImageView)v.findViewById(R.id.limage2);
            retunrfname=(TextView) v.findViewById(R.id.lname2);
            returnfcode=(TextView) v.findViewById(R.id.lcode2);
            returnfnumber=(TextView)v.findViewById(R.id.lnumber2);
            Rdcity=(TextView) v.findViewById(R.id.lorigincity2);
            Rdcode=(TextView) v.findViewById(R.id.lorigincode2);
            Rdtime=(TextView) v.findViewById(R.id.lorigintime2);
            Rdterm=(TextView) v.findViewById(R.id.loriginterminal2);
            Racity=(TextView) v.findViewById(R.id.ldestcity2);
            Racode=(TextView) v.findViewById(R.id.ldestcode2);
            Ratime=(TextView) v.findViewById(R.id.ldesttime2);
            Raterm=(TextView) v.findViewById(R.id.ldestterminal2);
            Returncheckin=(TextView)v.findViewById(R.id.lcheckin2);
            Returncabin=(TextView)v.findViewById(R.id.lcabin2);
            Returndura=(TextView)v.findViewById(R.id.lduretionreturn2);
            v.setTag(v);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder Retrn, int position) {
        Retrn.retunrfname.setText(returnlist.get(position).getR_name1());
        Retrn.returnfcode.setText(returnlist.get(position).getRfcode1());
        Retrn.returnfnumber.setText(returnlist.get(position).getRnumber1());

        Retrn.Rdcity.setText(returnlist.get(position).getR0city1());
        Retrn.Rdcode.setText(returnlist.get(position).getR0code1());
        Retrn.Rdtime.setText(returnlist.get(position).getRotime1());
        Retrn.Rdterm.setText(returnlist.get(position).getR0term());

        Retrn.Racity.setText(returnlist.get(position).getRacity1());
        Retrn.Racode.setText(returnlist.get(position).getRacode1());
        Retrn.Ratime.setText(returnlist.get(position).getRatime1());
        Retrn.Raterm.setText(returnlist.get(position).getRaterm());

        Retrn.Returncheckin.setText(returnlist.get(position).getCheckin_return());
        Retrn.Returncabin.setText(returnlist.get(position).getCabin_return());
        Retrn.Returndura.setText(returnlist.get(position).getReturn_dura());

        String key = Retrn.returnfcode.getText().toString();
        Picasso.with(Retrn.returnfimage.getContext())
                .load("https://www.farehawker.com/img/Airlines_logo/"+key+".gif")
                // .load(mDataset.get(position).toString())
                .into(Retrn.returnfimage);
    }

    @Override
    public int getItemCount() {
        return returnlist.size();
    }

}

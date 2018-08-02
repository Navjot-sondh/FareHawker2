package com.farehawker.Adaptors;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.farehawker.ClickListener;
import com.farehawker.FarerulesActivity;
import com.farehawker.Model.OnewayModelClass;
import com.farehawker.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by 1 on 3/16/2018.
 */

public class OnewayAdaptor extends RecyclerView.Adapter<OnewayAdaptor.ViewHolder> {
     Context context;
    private ClickListener clicklistener = null;
    private List<OnewayModelClass> mDataset;
    public OnewayAdaptor(Context mcontex,List mDataset) {
        this.context=mcontex;
        this.mDataset = mDataset;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.oneway_onlylayout, parent, false);
        final ViewHolder viewHolderh = new ViewHolder(v);
        return viewHolderh;
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        public TextView onewayname,onewaycode,onewaynumber,onewayarrivtime,onewaydeptime,onewayseats,onewayprice,onewaystop;
        public ImageView imageView;
        public  TextView resultindex;

        public ViewHolder(View v) {
            super(v);
            onewayname = (TextView) v.findViewById(R.id.onewatflightname);
            onewaycode = (TextView) v.findViewById(R.id.onewatflightcode);
            onewaynumber = (TextView) v.findViewById(R.id.onewatflightnumber);
            onewayarrivtime = (TextView) v.findViewById(R.id.onewatflightarrivtime);
            onewaydeptime = (TextView) v.findViewById(R.id.onewatflightdeptime);
            onewayseats = (TextView) v.findViewById(R.id.onewatflightseat);
            onewayprice = (TextView) v.findViewById(R.id.onewatflightprice);
            onewaystop = (TextView) v.findViewById(R.id.onewatflightstop);
            imageView = (ImageView) v.findViewById(R.id.onewayimage);
            resultindex=(TextView)v.findViewById(R.id.resultindex);
            v.setTag(v);
            v.setOnClickListener(this);
            //v.setOnTouchListener((View.OnTouchListener) this);
        }

        @Override
        public void onClick(View vv) {
            if (clicklistener != null) {
                clicklistener.itemClicked(vv, getAdapterPosition());
            }
        }
    }
    public void setClickListener(ClickListener listener) {
        this.clicklistener = listener;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.onewayname.setText(mDataset.get(position).getAirlinename());
        holder.onewaycode.setText(mDataset.get(position).getFlightcode());
        holder.onewaynumber.setText(mDataset.get(position).getFlightnumber());
        holder.onewayarrivtime.setText(mDataset.get(position).getArrivingtime());
        holder.onewaydeptime.setText(mDataset.get(position).getDeparturetime());
        holder.onewayprice.setText(mDataset.get(position).getPrice());
        holder.onewayseats.setText(mDataset.get(position).getSeatavalble());
        holder.onewaystop.setText(mDataset.get(position).getNumstop());
        holder.resultindex.setText(mDataset.get(position).getResultindex());
        String key = holder.onewaycode.getText().toString();
        Picasso.with(holder.imageView.getContext())
                .load("https://www.farehawker.com/img/Airlines_logo/"+key+".gif")
                // .load(mDataset.get(position).toString())
                .into(holder.imageView);

    }
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public OnewayModelClass getItem(int position) {
        return mDataset.get(position);
    }
}

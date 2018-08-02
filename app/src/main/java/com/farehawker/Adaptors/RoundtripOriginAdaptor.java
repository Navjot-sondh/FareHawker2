package com.farehawker.Adaptors;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.farehawker.ClickListener;
import com.farehawker.LeftclickI;
import com.farehawker.Model.RoundtripModelclass;
import com.farehawker.R;
import com.farehawker.RoundTripActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by 1 on 3/19/2018.
 */

public class RoundtripOriginAdaptor extends RecyclerView.Adapter<RoundtripOriginAdaptor.MyViewHolderleft> {
    private List<RoundtripModelclass> roundleftlist;
    private LeftclickI leftclick = null;
    int selected_position = 0;
    private Context mcontext;
    private LayoutInflater inflaterleft;

    public RoundtripOriginAdaptor(Context mcontext, List<RoundtripModelclass> roundleftlist) {
        this.mcontext = mcontext;
        this.roundleftlist = roundleftlist;
        inflaterleft = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public class MyViewHolderleft extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView flighnameleft, flighnumberleft, flightcodeleft, arrivtimeleft,
                departuretimeleft, priceleft, stopleft, seataballeft, calculationleft;
        private ImageView imageviewleft;
        private  TextView resultindex_onward;

        public MyViewHolderleft(View itemViewleft) {
            super(itemViewleft);
            flighnameleft = (TextView) itemViewleft.findViewById(R.id.text_roundtriponewayflightname);
            flighnumberleft = (TextView) itemViewleft.findViewById(R.id.text_roundtriponewayflightnumber);
            flightcodeleft = (TextView) itemViewleft.findViewById(R.id.text_roundtriponewayflightcode);
            arrivtimeleft = (TextView) itemViewleft.findViewById(R.id.text_roundtriponewayarrivingtime);
            departuretimeleft = (TextView) itemViewleft.findViewById(R.id.text_roundtriponewaydeparturetime);
            stopleft = (TextView) itemViewleft.findViewById(R.id.text_roundtriponewaynumberofstopes);
            seataballeft = (TextView) itemViewleft.findViewById(R.id.text_leftseatlefts);
            calculationleft = (TextView) itemViewleft.findViewById(R.id.text_roundtriponewaycalculateminutes);
            priceleft = (TextView) itemViewleft.findViewById(R.id.text_roundtriponewaytotalfare);
            imageviewleft = (ImageView) itemViewleft.findViewById(R.id.image_roundtriponewayimage);
            resultindex_onward=(TextView)itemViewleft.findViewById(R.id.resultindex_onward);
            itemViewleft.setTag(itemViewleft);
            itemViewleft.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (leftclick != null) {
                leftclick.leftitemclick(v, getAdapterPosition());
                if (getAdapterPosition() == RecyclerView.NO_POSITION) return;
                // Updating old as well as new positions
                notifyItemChanged(selected_position);
                selected_position = getAdapterPosition();
                notifyItemChanged(selected_position);
            }
        }
    }
    public void setClickListenleft(LeftclickI listener) {
        this.leftclick = listener;
    }

    @Override
    public MyViewHolderleft onCreateViewHolder(ViewGroup parent, int viewType) {

        View rootView = inflaterleft.inflate(R.layout.roundtrip_onewayincludelayout, parent, false);
        return new MyViewHolderleft(rootView);
    }

    @Override
    public void onBindViewHolder(MyViewHolderleft holder, int position) {
        RoundtripModelclass leftnmodel = roundleftlist.get(position);
        //Pass the values of feeds object to Views
        holder.flighnameleft.setText(leftnmodel.getFlightnameneway());
        holder.flighnumberleft.setText(leftnmodel.getNumberneway());
        holder.flightcodeleft.setText(leftnmodel.getCodeneway());
        holder.arrivtimeleft.setText(leftnmodel.getOrigintimeneway());
        holder.departuretimeleft.setText(leftnmodel.getDiparturetimeneway());
        holder.priceleft.setText(leftnmodel.getPriceneway());
        holder.stopleft.setText(leftnmodel.getStopsneway());
        holder.seataballeft.setText(leftnmodel.getSeatsleftneway());
        holder.resultindex_onward.setText(leftnmodel.getResultindex_oneward());
        holder.calculationleft.setText(leftnmodel.getCalculationneway());
        // Here I am just highlighting the background
        holder.itemView.setBackgroundColor(selected_position == position ? ContextCompat.getColor(mcontext, R.color.bgBottomNavigation) : Color.TRANSPARENT);
        String key = holder.flightcodeleft.getText().toString();
        Picasso.with(holder.imageviewleft.getContext())
                .load("https://www.farehawker.com/img/Airlines_logo/"+key+".gif")
                .into(holder.imageviewleft);
    }
    @Override
    public int getItemCount() {
        return roundleftlist.size();
    }
    public RoundtripModelclass getItem(int position) {
        return roundleftlist.get(position);
    }
}

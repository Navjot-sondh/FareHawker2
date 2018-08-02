package com.farehawker.Adaptors;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.farehawker.ClickListener;
import com.farehawker.Model.RoundtripModelclass;
import com.farehawker.Model.RoundtripreturnModelclass;
import com.farehawker.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by 1 on 3/19/2018.
 */

public class RoundtripReturnAdaptor extends RecyclerView.Adapter<RoundtripReturnAdaptor.MyViewHolder> {
    private List<RoundtripreturnModelclass> roundreturnlist;
    private Context context;
    private ClickListener rightclick = null;
    int selected_position = 0;
    private LayoutInflater inflater;
    public RoundtripReturnAdaptor(Context context, List<RoundtripreturnModelclass> roundreturnlist) {
        this.context = context;
        this.roundreturnlist = roundreturnlist;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        private TextView returnflighname, returnflighnumber, returnflightcode, returnflightarrivtime,
                returnflightdeparturetime, returnprice, returnnumberofstop, returnseatabal, retuntotalcalculation;
        private ImageView imageviewright;
        private TextView resultindex_return;

        public MyViewHolder(View itemView) {
            super(itemView);
            returnflighname = (TextView) itemView.findViewById(R.id.returnflighname);
            returnflighnumber = (TextView) itemView.findViewById(R.id.returnflighnumber);
            returnflightcode = (TextView) itemView.findViewById(R.id.returnflightcode);
            returnflightarrivtime = (TextView) itemView.findViewById(R.id.returnflightarrivtime);
            returnflightdeparturetime = (TextView) itemView.findViewById(R.id.returnflightdeparturetime);
            returnnumberofstop = (TextView) itemView.findViewById(R.id.returnnumberofstop);
            returnseatabal = (TextView) itemView.findViewById(R.id.returnseatabal);
            retuntotalcalculation = (TextView) itemView.findViewById(R.id.retuntotalcalculation);
            returnprice = (TextView) itemView.findViewById(R.id.returnflightprice);
            imageviewright = (ImageView) itemView.findViewById(R.id.image_roundtripreturnimage);
            resultindex_return=(TextView)itemView.findViewById(R.id.resultindex_return);
            itemView.setTag(itemView);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            if (rightclick != null) {
                rightclick.itemClicked(v, getAdapterPosition());
                if (getAdapterPosition() == RecyclerView.NO_POSITION) return;
                // Updating old as well as new positions
                notifyItemChanged(selected_position);
                selected_position = getAdapterPosition();
                notifyItemChanged(selected_position);
            }
        }
    }
    public void setClickListen(ClickListener listener) {
        this.rightclick = listener;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View rootView = inflater.inflate(R.layout.roundtrip_returnincludelayout, parent, false);
        return new MyViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RoundtripreturnModelclass returnmodel= roundreturnlist.get(position);
        //Pass the values of feeds object to Views

        holder.returnflighname.setText(returnmodel.getReturnflightnamearrive());
        holder.returnflighnumber.setText(returnmodel.getReturnflightnumberarrive());
        holder.returnflightcode.setText(returnmodel.getReturnflightcodearrive());
        holder.returnflightarrivtime.setText(returnmodel.getReturnflightonewaytimearrive());
        holder.returnflightdeparturetime.setText(returnmodel.getReturnflightonewaydiparturetime());
        holder.returnprice.setText(returnmodel.getReturnroundtriponewayprice());
        holder.returnnumberofstop.setText(returnmodel.getReturnroundtriponewaynumberofstops());
        holder.returnseatabal.setText(returnmodel.getReturnroundtriponewayseatsleft());
        holder.retuntotalcalculation.setText(returnmodel.getReturnflightonewayroundtriptimecalculation());
        holder.resultindex_return.setText(returnmodel.getResultindex_return());
        holder.itemView.setBackgroundColor(selected_position == position ? ContextCompat.getColor(context, R.color.bgBottomNavigation) : Color.TRANSPARENT);
        String key2 = holder.returnflightcode.getText().toString();
        Picasso.with(holder.imageviewright.getContext())
                .load("https://www.farehawker.com/img/Airlines_logo/"+key2+".gif")
                // .load(mDataset.get(position).toString())
                .into(holder.imageviewright);
    }
    @Override
    public int getItemCount() {
        return roundreturnlist.size();
    }

    public RoundtripreturnModelclass getItem(int position) {
        return roundreturnlist.get(position);
    }
}

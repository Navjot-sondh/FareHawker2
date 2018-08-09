package com.farehawker.Adaptors;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.farehawker.Model.OfferModel;
import com.farehawker.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by FareHawker.com on 27-02-2018.
 */

public class RecyclerViewChepListAdapter extends RecyclerView.Adapter<RecyclerViewChepListAdapter.ryceryViewHolder>{
    private List<OfferModel> horizontalGrocderyList;
    Context context;
    public RecyclerViewChepListAdapter(List<OfferModel> horizontalGrocderyList, Context context){
        this.horizontalGrocderyList= horizontalGrocderyList;
        this.context = context;
    }
    @Override
    public ryceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.chepestflight_layout, parent, false);
        ryceryViewHolder gvh = new ryceryViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(ryceryViewHolder holder, final int position) {

        holder.cheap_txtfrom.setText(horizontalGrocderyList.get(position).getProductFrom());
        holder.cheap_txtto.setText(horizontalGrocderyList.get(position).getProductTo());
        holder.cheap_textprice.setText(horizontalGrocderyList.get(position).getProductPrice());
        Picasso.with(context)
                .load(horizontalGrocderyList.get(position).getProductImage())
                .into(holder.cheap_imageView);
        holder.cheap_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productfrom = horizontalGrocderyList.get(position).getProductFrom().toString();
                String productTO = horizontalGrocderyList.get(position).getProductFrom().toString();
                Toast.makeText(context, productfrom +productTO+" is selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return horizontalGrocderyList.size();
    }

    public class ryceryViewHolder extends RecyclerView.ViewHolder {
        ImageView cheap_imageView;
        TextView cheap_txtfrom,cheap_txtto,cheap_textprice;
        public ryceryViewHolder(View view) {
            super(view);
            cheap_imageView=view.findViewById(R.id.cheap_image);
            cheap_txtfrom=view.findViewById(R.id.chep_idProductFrom);
            cheap_txtto=view.findViewById(R.id.chep_idProducTo);
            cheap_textprice=view.findViewById(R.id.cheap_product_price);
        }
    }
}

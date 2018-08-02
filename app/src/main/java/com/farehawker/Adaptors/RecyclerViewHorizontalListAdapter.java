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
 * Created by Gajendra Sharma on 27-02-2018.
 */

public class RecyclerViewHorizontalListAdapter extends RecyclerView.Adapter<RecyclerViewHorizontalListAdapter.GroceryViewHolder>{
    private List<OfferModel> horizontalGrocderyListc;
    Context context;
    public RecyclerViewHorizontalListAdapter( Context context,List<OfferModel> horizontalGrocderyListc){
        this.horizontalGrocderyListc= horizontalGrocderyListc;
        this.context = context;
    }
    @Override
    public GroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View groceryProductVieww = LayoutInflater.from(parent.getContext()).inflate(R.layout.offers_layout, parent, false);
        GroceryViewHolder gvhr = new GroceryViewHolder(groceryProductVieww);
        return gvhr;
//
    }

    @Override
    public void onBindViewHolder(GroceryViewHolder holder, final int position) {


        holder.txtfrom.setText(horizontalGrocderyListc.get(position).getProductFrom());
        holder.txtto.setText(horizontalGrocderyListc.get(position).getProductTo());
        holder.textprice.setText(horizontalGrocderyListc.get(position).getProductPrice());
        Picasso.with(context)
                .load(horizontalGrocderyListc.get(position).getProductImage())
                .into(holder.imageView);

    }
    @Override
    public int getItemCount() {
        return horizontalGrocderyListc.size();
    }
    public class GroceryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txtfrom,txtto,textprice;
        public GroceryViewHolder(View view) {
            super(view);
            imageView=view.findViewById(R.id.idProductImage);
            txtfrom=view.findViewById(R.id.idProductFrom);
            txtto=view.findViewById(R.id.idProducTo);
            textprice=view.findViewById(R.id.product_price);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(context,   horizontalGrocderyListc.get(getAdapterPosition()).getProductFrom()+" "+horizontalGrocderyListc.get(getAdapterPosition()).getProductTo(), Toast.LENGTH_SHORT).show();

                }
            });
        }
    }
}

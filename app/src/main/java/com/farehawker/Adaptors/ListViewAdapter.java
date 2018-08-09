package com.farehawker.Adaptors;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.farehawker.Model.MovieNames;
import com.farehawker.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FareHawker.com on 05-03-2018.
 */

public class ListViewAdapter extends BaseAdapter implements Filterable {
    Context context;
    private LayoutInflater inflater;
    private List<MovieNames> beanList;
    private List<MovieNames> mStringFilterList;
    ValueFilter valueFilter;
    public ListViewAdapter(Context context, List<MovieNames> beanList) {
        this.context = context;
        this.beanList = beanList;
        mStringFilterList = beanList;
    }


    @Override
    public int getCount() {
        return beanList.size();
    }

    @Override
    public Object getItem(int i) {
        return beanList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (view == null) {
            view = inflater.inflate(R.layout.listview_item, null);
        }
        TextView txtcode = (TextView) view.findViewById(R.id.name);
        TextView txtname = (TextView) view.findViewById(R.id.full);
        TextView txtcountry=(TextView)view.findViewById(R.id.countryn);

        MovieNames bean = beanList.get(i);
        String code = bean.getName();
        String name = bean.getFull();
        String country=bean.getCountry();

        txtcode.setText(code);
        txtname.setText(name);
        txtcountry.setText(country);
        return view;
    }

    @Override
    public Filter getFilter() {
        if (valueFilter == null) {
            valueFilter = new ValueFilter();
        }
        return valueFilter;
    }

    private class ValueFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();

            if (constraint != null && constraint.length() > 0) {
                ArrayList<MovieNames> filterList = new ArrayList<MovieNames>();
                for (int i = 0; i < mStringFilterList.size(); i++) {
                    if ((mStringFilterList.get(i).getName().toUpperCase())
                            .contains(constraint.toString().toUpperCase())) {

                        MovieNames bean = new MovieNames(mStringFilterList.get(i)
                                .getName(), mStringFilterList.get(i)
                                .getFull(),mStringFilterList.get(i).getCountry());
                        filterList.add(bean);
                    }
                }
                results.count = filterList.size();
                results.values = filterList;
            } else {
                results.count = mStringFilterList.size();
                results.values = mStringFilterList;
            }
            return results;

        }

        @Override
        protected void publishResults(CharSequence constraint,
                                      FilterResults results) {
            beanList = (ArrayList<MovieNames>) results.values;
            notifyDataSetChanged();
        }

    }
}
package com.example.android.miwok.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.miwok.R;

/**
 * Created by MFQ on 11/12/16.
 */

public class DummyAdapter extends RecyclerView.Adapter<DummyAdapter.ItemViewHolder> {


    Context mContext;

    public DummyAdapter(Context context) {
        mContext = context;
    }

    /**
     * create the view Holder to hold the Views in the Adapter
     */
    @Override
    public DummyAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DummyAdapter.ItemViewHolder(LayoutInflater.from(mContext).inflate(R.layout.dummy_list_item, parent, false));
    }


    /**
     * Bind the View from ViewHolder to display the real DATA
     */
    @Override
    public void onBindViewHolder(DummyAdapter.ItemViewHolder holder, int position) {

    }

    /**
     * How Many Item we want to display ? return the number
     */
    @Override
    public int getItemCount() {
        return 10;
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {

        public ItemViewHolder(View itemView) {
            super(itemView);
        }
    }
}
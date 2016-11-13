package com.example.android.miwok.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.miwok.R;


public class WordAdapter extends RecyclerView.Adapter<WordAdapter.ItemViewHolder> {


    Context mContext;

    public WordAdapter(Context context) {
        mContext = context;
    }

    /**
     * create the view Holder to hold the Views in the Adapter
     */
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false));
    }


    /**
     * Bind the View from ViewHolder to display the real DATA
     */
    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

    }

    /**
     * How Many Item we want to display ? return the number
     */
    @Override
    public int getItemCount() {
        return 0;
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {

        public ItemViewHolder(View itemView) {
            super(itemView);
        }
    }


}

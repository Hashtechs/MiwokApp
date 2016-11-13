package com.example.android.miwok.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.Models.Word;
import com.example.android.miwok.R;

import java.util.ArrayList;

/**
 * Created by MFQ on 11/13/16.
 */

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.ItemViewHolder> {


    Context mContext;
    private ArrayList<Word> mWords;


    public NumberAdapter(Context context, ArrayList<Word> words) {
        mContext = context;
        mWords = words;
    }


    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);

        ItemViewHolder itemViewHolder = new ItemViewHolder(view);

        return itemViewHolder;
    }


    @Override
    public int getItemCount() {
        return mWords.size();
    }


    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

        holder.textViewEnglish.setText(mWords.get(position).getEnglishWord());
        holder.textViewEnglish.setText(mWords.get(position).getMiwokWord());
        holder.imageView.setImageResource(mWords.get(position).getImgId());


    }


    class ItemViewHolder extends RecyclerView.ViewHolder {


        private final TextView textViewMiwok, textViewEnglish;
        private final ImageView imageView;

        public ItemViewHolder(View itemView) {
            super(itemView);

            textViewMiwok = (TextView) itemView.findViewById(R.id.miwok_text_view);
            textViewEnglish = (TextView) itemView.findViewById(R.id.default_text_view);
            imageView = (ImageView) itemView.findViewById(R.id.image);


        }
    }
}

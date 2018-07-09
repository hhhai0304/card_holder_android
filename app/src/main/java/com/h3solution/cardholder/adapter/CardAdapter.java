package com.h3solution.cardholder.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.h3solution.cardholder.R;
import com.h3solution.cardholder.model.CardModel;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private ArrayList<CardModel> items;
    private Activity context;

    public CardAdapter(ArrayList<CardModel> items, Activity context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardModel item = items.get(position);
        holder.imgLogo.setImageDrawable(context.getResources().getDrawable(item.getLogoId()));
        holder.imgCode.setImageDrawable(context.getResources().getDrawable(R.drawable.img_barcode_default));
        holder.tvTitle.setText(item.getTitle());
        holder.tvCodeContent.setText(item.getDetail());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        ImageView imgCode;
        TextView tvTitle;
        TextView tvCodeContent;

        ViewHolder(View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.img_logo);
            imgCode = itemView.findViewById(R.id.img_code);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvCodeContent = itemView.findViewById(R.id.tv_code_content);
        }
    }
}
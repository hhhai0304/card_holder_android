package com.h3solution.cardholder.activity;

import android.support.v7.widget.RecyclerView;

import com.h3solution.cardholder.R;
import com.h3solution.cardholder.adapter.CardAdapter;
import com.h3solution.cardholder.base.BaseActivity;
import com.h3solution.cardholder.model.CardModel;
import com.ramotion.cardslider.CardSliderLayoutManager;
import com.ramotion.cardslider.CardSnapHelper;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    RecyclerView rvCardHolder;
    CardAdapter adapter;
    ArrayList<CardModel> items;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onInitialize() {
        items = new ArrayList<>();
        adapter = new CardAdapter(items, this);

        rvCardHolder = findViewById(R.id.rv_card_holder);
        rvCardHolder.setLayoutManager(new CardSliderLayoutManager(100, 500, 16));
        rvCardHolder.setAdapter(adapter);

        new CardSnapHelper().attachToRecyclerView(rvCardHolder);

        mockData();
    }

    private void mockData() {
        items.clear();
        items.add(new CardModel(R.drawable.ic_coopmart, "Coopmart", "423532235352132321"));
        items.add(new CardModel(R.drawable.ic_family, "Family Mart", "423532235352132321"));
        items.add(new CardModel(R.drawable.ic_coopmart, "Coopmart", "423532235352132321"));
        items.add(new CardModel(R.drawable.ic_coopmart, "Coopmart", "423532235352132321"));
        items.add(new CardModel(R.drawable.ic_coopmart, "Coopmart", "423532235352132321"));
        items.add(new CardModel(R.drawable.ic_coopmart, "Coopmart", "423532235352132321"));
        items.add(new CardModel(R.drawable.ic_coopmart, "Coopmart", "423532235352132321"));
        adapter.notifyDataSetChanged();
    }
}
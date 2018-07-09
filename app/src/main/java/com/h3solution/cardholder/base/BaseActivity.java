package com.h3solution.cardholder.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.Objects;

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract int getLayoutId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        Objects.requireNonNull(getSupportActionBar()).hide();
        onInitialize();
    }

    protected abstract void onInitialize();

    protected void showActionBar() {
        Objects.requireNonNull(getSupportActionBar()).show();
    }
}
package com.didikee.materialdesigncolortool;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.ll_dialog)
    LinearLayout llDialog;
    @BindView(R.id.activity_main)
    ScrollView activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.ll_dialog)
    public void onClick() {
        new AlertDialog.Builder(this)
                .setTitle("This is title")
                .setMessage("Hello,How are you!")
                .setPositiveButton("Action",null)
                .setNegativeButton("Dismiss",null)
                .show();
    }
}

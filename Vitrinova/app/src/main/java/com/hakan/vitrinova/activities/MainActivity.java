package com.hakan.vitrinova.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hakan.vitrinova.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(NavigationDrawerActivity.newIntent(this));
    }
}
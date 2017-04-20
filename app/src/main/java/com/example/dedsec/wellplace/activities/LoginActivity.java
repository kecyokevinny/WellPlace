package com.example.dedsec.wellplace.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dedsec.wellplace.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }
}

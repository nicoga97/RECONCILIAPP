package com.bsocial.reconciliapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_page);
    }

    public void sendMainPage(View view) {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
    }

}
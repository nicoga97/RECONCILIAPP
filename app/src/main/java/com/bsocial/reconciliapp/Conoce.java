package com.bsocial.reconciliapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bsocial.reconciliapp.ui.login.LoginActivity;

public class Conoce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conoce);
    }

    public void sendRegister(View view) {
        Intent intent = new Intent(this, WelcomePage.class);
        startActivity(intent);
    }
}
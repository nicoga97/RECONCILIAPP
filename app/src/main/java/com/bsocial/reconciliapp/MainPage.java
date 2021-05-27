package com.bsocial.reconciliapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void sendEncuentros(View view) {
        Intent intent = new Intent(this, Encuentros.class);
        startActivity(intent);
    }

    public void sendToRutaDeAtencion(View view) {
        Intent intent = new Intent(this, AttentionActivity.class);
        startActivity(intent);
    }

    public void sendToAliados(View view) {
        Intent intent = new Intent(this, AlliesActivity.class);
        startActivity(intent);
    }

    public void sendToBanco(View view) {
        Intent intent = new Intent(this, StoryNavigationActivity.class);
        startActivity(intent);
    }
}
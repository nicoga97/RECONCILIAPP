package com.bsocial.reconciliapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstMainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_main_page);
    }

    public void sendToPerfil(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void sendToUniversityMatch(View view) {
        Intent intent = new Intent(this, UniversityMatchActivity.class);
        startActivity(intent);
    }

    public void sendToWorkMatch(View view) {
        Intent intent = new Intent(this, WorkMatchActivity.class);
        startActivity(intent);
    }

    public void sendToBanco(View view) {
        Intent intent = new Intent(this, StoryActivity.class);
        startActivity(intent);
    }
}
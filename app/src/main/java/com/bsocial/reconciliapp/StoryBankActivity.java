package com.bsocial.reconciliapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StoryBankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_bank);
    }

    public void sendToMyStory(View view) {
        Intent intent = new Intent(this, StoryActivity.class);
        startActivity(intent);
    }
}
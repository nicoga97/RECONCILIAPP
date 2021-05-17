package com.bsocial.reconciliapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class WelcomePage extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup rg1;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_page);
        rg1= (RadioGroup) findViewById(R.id.radioGroup2);
        rg1.setOnCheckedChangeListener(this);

        edit = (EditText) findViewById(R.id.cuantosText);
        actv(false);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.yes:
                actv(true);
                break;
            case R.id.no:
                actv(false);
                break;
        }
    }

    private void actv(final boolean active) {
        edit.setEnabled(active);
        if (active) {
            edit.requestFocus();
        }
    }
    public void sendMainPage(View view) {
        EditText register = (EditText) findViewById(R.id.registroSelect);
        EditText name = (EditText) findViewById(R.id.personNameText);
        EditText interest = (EditText) findViewById(R.id.interesEditText);
        rg1= (RadioGroup) findViewById(R.id.radioGroup1);
        RadioGroup rg2= (RadioGroup) findViewById(R.id.radioGroup2);
        if( TextUtils.isEmpty(name.getText())){
            name.setError( "Pon tu nombre!" );
        }else if( TextUtils.isEmpty(register.getText())){
            register.setError( "Pon tu numero de registro!" );
        }else if( TextUtils.isEmpty(interest.getText())){
            interest.setError( "Pon tu interes!" );
        }else if( rg1.getCheckedRadioButtonId() == -1){
            Toast.makeText(getApplicationContext(), "Selecciona un genero", Toast.LENGTH_SHORT).show();
        }else if( rg2.getCheckedRadioButtonId() == -1){
            Toast.makeText(getApplicationContext(), "Selecciona algo en el campo referido a hijos", Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent(this, FirstMainPage.class);
            startActivity(intent);
        }
    }

}
package com.bsocial.reconciliapp.ui.login;

import android.app.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bsocial.reconciliapp.R;
import com.bsocial.reconciliapp.ui.login.LoginViewModel;
import com.bsocial.reconciliapp.ui.login.LoginViewModelFactory;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;
    private static final String TAG = "EmailPassword";
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;
    private AlertDialog alertDialog;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textInputEmail = findViewById(R.id.username);
        textInputPassword = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.button);

    }

    private void buildDialog(String message) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setTitle(getApplicationContext().getResources().getString(R.string.login_failed_dialog_title));
        builder1.setMessage(message);
        builder1.setCancelable(true);
        builder1.setNegativeButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        return;
                    }
                });
        alertDialog = builder1.create();
    }

    private boolean validateEmail() {
        AppCompatEditText emailInput = (AppCompatEditText) textInputEmail.getEditText();
        textInputEmail.setError(null);
        if (TextUtils.isEmpty(emailInput.getText().toString())) {
            textInputEmail.setError(getApplicationContext().getResources().getString(R.string.field_valiation_empty));
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput.getText().toString()).matches()) {
            textInputEmail.setError(getApplicationContext().getResources().getString(R.string.field_validation_email));
            return false;
        } else {
            textInputEmail.setError(null);
            return true;
        }
    }

    private boolean validatePassword() {
        textInputPassword.setError(null);
        AppCompatEditText passwordInput = (AppCompatEditText) textInputPassword.getEditText();
        if (TextUtils.isEmpty(passwordInput.getText().toString())) {
            textInputPassword.setError(getApplicationContext().getResources().getString(R.string.field_valiation_empty));
            return false;
        } else {
            textInputPassword.setError(null);
            return true;
        }
    }

    //private void switchToMainView() {
       // Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
        //finish();
    //}

    private void signIn(String email, String password) {
        Log.d(TAG, "signIn:" + email);
        if (!validateEmail() && !validatePassword()) {
            return;
        }


    }



    public void login(View v) {
        v.setEnabled(false);
        Snackbar.make(v, R.string.wait, Snackbar.LENGTH_SHORT)
                .show();
        buttonLogin.setEnabled(false);
        signIn(textInputEmail.getEditText().getText().toString(), textInputPassword.getEditText().getText().toString());
        buttonLogin.setEnabled(true);
        v.setEnabled(true);
    }

    public void createAccount(View v){
        //Intent intent = new Intent(this, CreateAccountActivity.class);
        //startActivity(intent);
    }
}
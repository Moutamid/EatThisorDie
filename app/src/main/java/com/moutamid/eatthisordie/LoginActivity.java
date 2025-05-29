package com.moutamid.eatthisordie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

    }

    public void signup_click(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
    }
    public void forgot_click(View view) {
        startActivity(new Intent(this, ForgotPasswordActivity.class));
    }
    public void back(View view) {
        onBackPressed();
    }
}
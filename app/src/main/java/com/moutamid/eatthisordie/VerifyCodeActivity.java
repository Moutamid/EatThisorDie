package com.moutamid.eatthisordie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class VerifyCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_verify_code);

    }

    public void back(View view) {
        onBackPressed();
    }

    public void verify_code(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
package com.moutamid.eatthisordie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

    }

    public void create_acount(View view) {
        startActivity(new Intent(this, VerifyCodeActivity.class));
    }
    public void back(View view) {
        onBackPressed();
    }
}
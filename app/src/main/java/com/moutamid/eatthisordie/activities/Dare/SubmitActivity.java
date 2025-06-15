package com.moutamid.eatthisordie.activities.Dare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.moutamid.eatthisordie.R;

public class SubmitActivity extends AppCompatActivity {
    ImageView submit_record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        submit_record = findViewById(R.id.submit_record);
        submit_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SubmitActivity.this, UploadActivity.class));
            }
        });
    }
}
package com.moutamid.eatthisordie.activities.Dare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.moutamid.eatthisordie.R;

public class RecordDareActivity extends AppCompatActivity {
    ImageView record_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_dare);
        record_video = findViewById(R.id.record_video);
        record_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecordDareActivity.this, SubmitActivity.class));
            }
        });
    }

}
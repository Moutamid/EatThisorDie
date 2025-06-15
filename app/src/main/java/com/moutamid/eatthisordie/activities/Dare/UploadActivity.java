package com.moutamid.eatthisordie.activities.Dare;

import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.moutamid.eatthisordie.MainActivity;
import com.moutamid.eatthisordie.R;
import com.moutamid.eatthisordie.utils.Constants;

public class UploadActivity extends AppCompatActivity {
    Button upload_dare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        upload_dare = findViewById(R.id.uploadBtn);
        upload_dare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constants.PARAMS = Constants.UPLOAD_DARE;
                startActivity(new Intent(UploadActivity.this, MainActivity.class));
                finishAffinity();
            }
        });
    }
}
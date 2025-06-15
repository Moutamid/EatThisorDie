package com.moutamid.eatthisordie;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.moutamid.eatthisordie.utils.Constants;

public class VideoPreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_preview);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Constants.PARAMS=Constants.EARN_COINS;
        startActivity(new Intent(this, MainActivity.class));
        finishAffinity();
    }
}
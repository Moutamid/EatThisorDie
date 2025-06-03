package com.moutamid.eatthisordie;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.moutamid.eatthisordie.fragments.StatisticsFragment;
import com.moutamid.eatthisordie.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {
    ImageView btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//        btnProfile = findViewById(R.id.btnProfile);
//        btnProfile.setOnClickListener(v -> {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, new StatisticsFragment())
                    .commit();
//        });

    }

    public void back(View view) {
        onBackPressed();
    }
}
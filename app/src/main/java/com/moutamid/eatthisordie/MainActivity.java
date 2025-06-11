package com.moutamid.eatthisordie;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.moutamid.eatthisordie.fragments.StatisticsFragment;
import com.moutamid.eatthisordie.fragments.CoinsFragment;
import com.moutamid.eatthisordie.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {
    ImageView btnAccount, btnNotification, btnProfile, btnCoins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnAccount = findViewById(R.id.btnAccount);
        btnNotification = findViewById(R.id.btnNotification);
        btnProfile = findViewById(R.id.btnProfile);
        btnCoins = findViewById(R.id.btnCoins);

        loadFragment(new StatisticsFragment());
        updateTint(btnAccount);

        btnAccount.setOnClickListener(v -> {
            loadFragment(new StatisticsFragment());
            updateTint(btnAccount);
        });

        btnNotification.setOnClickListener(v -> {
            loadFragment(new StatisticsFragment());
            updateTint(btnNotification);
        });
        btnCoins.setOnClickListener(v -> {
            loadFragment(new CoinsFragment());
            updateTint(btnCoins);
        });

        btnProfile.setOnClickListener(v -> {
            loadFragment(new ProfileFragment());
            updateTint(btnProfile);
        });

    }
    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

    private void updateTint(ImageView selected) {
        int yellow = ContextCompat.getColor(this, android.R.color.holo_orange_light);
        int white = ContextCompat.getColor(this, android.R.color.white);
        btnAccount.setColorFilter(btnAccount == selected ? yellow : white);
        btnNotification.setColorFilter(btnNotification == selected ? yellow : white);
        btnProfile.setColorFilter(btnProfile == selected ? yellow : white);
        btnCoins.setColorFilter(btnCoins == selected ? yellow : white);
    }
    public void back(View view) {
        onBackPressed();
    }
}
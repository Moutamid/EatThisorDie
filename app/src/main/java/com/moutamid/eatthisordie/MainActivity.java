package com.moutamid.eatthisordie;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.moutamid.eatthisordie.fragments.CoinsFragment;
import com.moutamid.eatthisordie.fragments.LeaderBoardFragment;
import com.moutamid.eatthisordie.fragments.ProfileFragment;
import com.moutamid.eatthisordie.fragments.StatisticsFragment;
import com.moutamid.eatthisordie.utils.Constants;

public class MainActivity extends AppCompatActivity {
    ImageView btnAccount, btnLeadership, btnProfile, btnCoins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnAccount = findViewById(R.id.btnAccount);
        btnLeadership = findViewById(R.id.btnLeadership);
        btnProfile = findViewById(R.id.btnProfile);
        btnCoins = findViewById(R.id.btnCoins);

        loadFragment(new StatisticsFragment());
        updateTint(btnAccount);
        btnAccount.setOnClickListener(v -> {
            loadFragment(new StatisticsFragment());
            updateTint(btnAccount);
        });

        btnLeadership.setOnClickListener(v -> {
            loadFragment(new LeaderBoardFragment());
            updateTint(btnLeadership);
        });
        btnCoins.setOnClickListener(v -> {
            loadFragment(new CoinsFragment());
            updateTint(btnCoins);
        });

        btnProfile.setOnClickListener(v -> {
            loadFragment(new ProfileFragment());
            updateTint(btnProfile);
        });
        if (Constants.PARAMS.equals(Constants.UPLOAD_DARE)) {
            showUploadDareDialog();
        } else if (Constants.PARAMS.equals(Constants.EARN_COINS)) {
            showEarnDialog();
        }
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

    private void updateTint(ImageView selected) {
        int yellow = ContextCompat.getColor(this, R.color.green);
        int white = ContextCompat.getColor(this, android.R.color.white);
        btnAccount.setColorFilter(btnAccount == selected ? yellow : white);
        btnLeadership.setColorFilter(btnLeadership == selected ? yellow : white);
        btnProfile.setColorFilter(btnProfile == selected ? yellow : white);
        btnCoins.setColorFilter(btnCoins == selected ? yellow : white);
    }

    public void back(View view) {
        onBackPressed();
    }

    private void showUploadDareDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.upload_dailogue, null); // Replace with your XML file name
        builder.setView(dialogView);
        Button closeButton = dialogView.findViewById(R.id.uploadBtn);
        final AlertDialog dialog = builder.create();
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }

        if (closeButton != null) {
            closeButton.setOnClickListener(v -> dialog.dismiss());
        }
        dialog.show();
    }

    private void showEarnDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.earned_dailogue, null); // Replace with your XML file name
        builder.setView(dialogView);
        Button okBtn = dialogView.findViewById(R.id.okBtn);
        final AlertDialog dialog = builder.create();
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }

        if (okBtn != null) {
            okBtn.setOnClickListener(v -> dialog.dismiss());
        }
        dialog.show();
    }

}
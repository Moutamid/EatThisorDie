package com.moutamid.eatthisordie.fragments;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.moutamid.eatthisordie.R;

public class ProfileFragment extends Fragment {
    RelativeLayout notification, terms_condition, privacy_policy, about, logout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        terms_condition = view.findViewById(R.id.terms_condition);
        notification = view.findViewById(R.id.notification);
        privacy_policy = view.findViewById(R.id.privacy_policy);
        about = view.findViewById(R.id.about);
        logout = view.findViewById(R.id.logout);
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        terms_condition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, new Terms_and_Condition_Fragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, new NotificationFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
        privacy_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, new PrivacyFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, new AboutFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              showSignOutDialog();
            }
        });
        return view;
    }
    private void showSignOutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.signout_dailogue, null); // Replace with your XML file name
        builder.setView(dialogView);
        Button closeButton = dialogView.findViewById(R.id.signOutBtn);
        final AlertDialog dialog = builder.create();
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }

        if (closeButton != null) {
            closeButton.setOnClickListener(v -> dialog.dismiss());
        }
        dialog.show();
    }

}
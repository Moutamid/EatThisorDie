package com.moutamid.eatthisordie.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.moutamid.eatthisordie.R;

public class ProfileFragment extends Fragment {
    RelativeLayout notification, terms_condition;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        terms_condition = view.findViewById(R.id.terms_condition);
        notification = view.findViewById(R.id.notification);
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


        return view;
    }
}
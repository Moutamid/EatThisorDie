package com.moutamid.eatthisordie.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.moutamid.eatthisordie.R;



public class StatisticsFragment extends Fragment {
      TextView see_all;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_statistics, container, false);
        see_all = view.findViewById(R.id.see_all);
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        see_all.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               fragmentManager.beginTransaction()
                       .replace(R.id.fragment_container, new ExploreFragment())
                       .addToBackStack(null)
                       .commit();
           }
       });
        return view;
    }
}
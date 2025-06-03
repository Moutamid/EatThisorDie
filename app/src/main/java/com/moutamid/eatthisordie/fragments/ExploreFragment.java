package com.moutamid.eatthisordie.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moutamid.eatthisordie.R;

import java.util.Arrays;
import java.util.List;

import com.moutamid.eatthisordie.*;
public class ExploreFragment extends Fragment {

    RecyclerView recyclerView;
    ImageAdapter adapter;
    List<Integer> imageList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));

        imageList = Arrays.asList(
                R.drawable.exp_1, R.drawable.exp_2, R.drawable.exp_3,
                R.drawable.exp_4, R.drawable.exp_5, R.drawable.exp_6,
                R.drawable.exp_1, R.drawable.exp_2, R.drawable.exp_3,
                R.drawable.exp_4, R.drawable.exp_5, R.drawable.exp_6,
                R.drawable.exp_7, R.drawable.exp_8, R.drawable.exp_9
        );

        adapter = new ImageAdapter(getContext(), imageList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
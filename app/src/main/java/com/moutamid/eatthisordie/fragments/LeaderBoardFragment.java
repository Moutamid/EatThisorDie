package com.moutamid.eatthisordie.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.moutamid.eatthisordie.R;
import com.moutamid.eatthisordie.adapter.LeaderboardAdapter;
import com.moutamid.eatthisordie.model.LeaderModel;

import java.util.ArrayList;
import java.util.List;


public class LeaderBoardFragment extends Fragment {
    TextView tab2active;
    LinearLayout tabactive1, tabactive2, profileLayout;
    private RecyclerView recyclerView;
    private LeaderboardAdapter adapter;
    private List<LeaderModel> leaders;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leader_board, container, false);
        tabactive1 = view.findViewById(R.id.tabactive1);
        tabactive2 = view.findViewById(R.id.tabactive2);
        tab2active = view.findViewById(R.id.tab2active);
        profileLayout = view.findViewById(R.id.profileLayout);
        recyclerView = view.findViewById(R.id.recyclerViewLeaderboard);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        leaders = new ArrayList<>();
        leaders.add(new LeaderModel(R.drawable.ic_profile, "playername1", 100));
        leaders.add(new LeaderModel(R.drawable.ic_profile, "playername2", 98));
        leaders.add(new LeaderModel(R.drawable.ic_profile, "playername3", 95));
        leaders.add(new LeaderModel(R.drawable.ic_profile, "playername4", 55));
        leaders.add(new LeaderModel(R.drawable.ic_profile, "playername5", 34));
        leaders.add(new LeaderModel(R.drawable.ic_profile, "playername6", 97));
        leaders.add(new LeaderModel(R.drawable.ic_profile, "playername7", 69));
        leaders.add(new LeaderModel(R.drawable.ic_profile, "playername8", 45));
        adapter = new LeaderboardAdapter(leaders);
        recyclerView.setAdapter(adapter);
        tab2active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tabactive1.setVisibility(View.INVISIBLE);
                recyclerView.setVisibility(View.VISIBLE);
                tabactive2.setVisibility(View.VISIBLE);
                profileLayout.setVisibility(View.INVISIBLE);
            }
        });
        return view;
    }
}
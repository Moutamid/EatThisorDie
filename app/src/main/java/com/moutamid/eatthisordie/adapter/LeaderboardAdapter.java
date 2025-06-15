package com.moutamid.eatthisordie.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moutamid.eatthisordie.R;
import com.moutamid.eatthisordie.model.LeaderModel;

import java.util.List;

public class LeaderboardAdapter extends RecyclerView.Adapter<LeaderboardAdapter.LeaderViewHolder> {

    private List<LeaderModel> leaders;

    public LeaderboardAdapter(List<LeaderModel> leaders) {
        this.leaders = leaders;
    }

    @NonNull
    @Override
    public LeaderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_leaderboard, parent, false);
        return new LeaderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LeaderViewHolder holder, int position) {
        LeaderModel leader = leaders.get(position);
        holder.textUsername.setText(leader.getUsername());
        holder.textDares.setText(leader.getDares() + " dares");

//        holder.imageViewProfile.setImageResource(leader.getProfilePicture());
    }

    @Override
    public int getItemCount() {
        return leaders.size();
    }

    static class LeaderViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewProfile;
        TextView textUsername;
        TextView textDares;

        LeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewProfile = itemView.findViewById(R.id.imageViewProfile);
            textUsername = itemView.findViewById(R.id.textUsername);
            textDares = itemView.findViewById(R.id.textDares);
        }
    }
}


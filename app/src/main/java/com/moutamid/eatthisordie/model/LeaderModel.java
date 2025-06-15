package com.moutamid.eatthisordie.model;

public class LeaderModel {
    private int profilePicture;
    private String username;
    private int dares;

    public LeaderModel(int profilePicture, String username, int dares) {
        this.profilePicture = profilePicture;
        this.username = username;
        this.dares = dares;
    }

    public int getProfilePicture() {
        return profilePicture;
    }

    public String getUsername() {
        return username;
    }

    public int getDares() {
        return dares;
    }
}

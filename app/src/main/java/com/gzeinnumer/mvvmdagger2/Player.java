package com.gzeinnumer.mvvmdagger2;

public class Player {
    private String name;
    private String club;
    private String position;

    public Player() {
    }

    public Player(String name, String club, String position) {
        this.name = name;
        this.club = club;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getClub() {
        return club;
    }

    public String getPosition() {
        return position;
    }
}

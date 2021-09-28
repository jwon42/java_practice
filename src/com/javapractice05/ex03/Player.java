package com.javapractice05.ex03;

public class Player {
    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }

    public void play(int jumpCount) {
        level.go(jumpCount);
    }
}

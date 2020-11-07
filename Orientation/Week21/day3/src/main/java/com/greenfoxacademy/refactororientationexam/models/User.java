package com.greenfoxacademy.refactororientationexam.models;

public class User {
    private int score;

    public User() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public User(int score) {
        this.score = score;
    }
}

package com.greenfoxacademy.frontend.models;

public class Num {
    private Integer recieved;
    private Integer result;

    public Num(Integer recieved) {
        this.recieved = recieved;
    }

    public Integer getResult() {
        return recieved * 2;
    }
}

package com.greenfoxacademy.frontend.models;

public class Errors {
    private String error;

    public Errors() {
    }

    public Errors(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

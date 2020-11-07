package com.greenfoxacademy.frontend.models;

public class ArrayModel {
    private String what;
    private int[] numbers;

    public ArrayModel() {
    }

    public ArrayModel(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public String getWhat() {
        return what;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public String whatIsMissing() {
        if (getNumbers() == null) {
            return "numbers";
        } else if (getWhat() == null) {
            return "what";
        } else if (getWhat() == null && getNumbers() == null) {
            return "numbers and what";
        } else {
            return "none";
        }
    }

    public boolean containsAllFields() {
        if (whatIsMissing().equals("none")) {
            return true;
        } else return false;
    }

    public boolean isWahtDouble() {
        if (getWhat().equals("double")) {
            return true;
        } else {
            return false;
        }
    }
}

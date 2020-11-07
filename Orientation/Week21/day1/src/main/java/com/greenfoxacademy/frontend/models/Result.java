package com.greenfoxacademy.frontend.models;

public class Result {
    private int result;

    public Result() {
    }

    public int calculateResult(ArrayModel arrayModel) {
        if (arrayModel.getWhat().equals("sum")) {
            int sum = 0;
            for (int value : arrayModel.getNumbers()) {
                sum += value;
            }
            result = sum;
        } else if (arrayModel.getWhat().equals("multiply")) {
            int multiplication = 1;
            for (Integer number : arrayModel.getNumbers()) {
                multiplication *= number;
            }
            result = multiplication;
        }
        return result;
    }
}

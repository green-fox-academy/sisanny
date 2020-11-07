package com.greenfoxacademy.frontend.models;

public class ResultArray {
    private int[] result;

    public ResultArray() {
    }

    public int[] multiplyByTwo(ArrayModel arrayModel) {
        for (int i = 0; i < arrayModel.getNumbers().length; i++) {
            arrayModel.getNumbers()[i] *= 2;
        }
        result = arrayModel.getNumbers();
        return result;
    }
}

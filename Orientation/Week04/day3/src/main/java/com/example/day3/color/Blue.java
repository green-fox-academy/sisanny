package com.example.day3.color;

import org.springframework.stereotype.Service;

@Service
public class Blue implements MyColor {
    @Override
    public void printColor() {
        System.out.println("Blue");
    }
}

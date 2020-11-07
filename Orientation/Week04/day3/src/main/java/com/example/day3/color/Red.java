package com.example.day3.color;

import org.springframework.stereotype.Service;

@Service
public class Red implements MyColor {
    @Override
    public void printColor() {
        System.out.println("Red");
    }
}

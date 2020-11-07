package com.example.day3.helloIDproject;

import com.example.day3.color.Blue;
import com.example.day3.color.Green;
import com.example.day3.color.Red;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

    final
    Red red;

    final
    Blue blue;

    final
    Green green;

    public Printer(Red red, Blue blue, Green green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }

    public Blue getBlue() {
        return blue;
    }

    public Green getGreen() {
        return green;
    }

    public Red getRed() {
        return red;
    }
}

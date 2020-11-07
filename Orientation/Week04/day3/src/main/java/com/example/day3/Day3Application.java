package com.example.day3;

import com.example.day3.color.Blue;
import com.example.day3.color.Green;
import com.example.day3.color.Red;
import com.example.day3.helloIDproject.Printer;
import com.example.day3.untilities.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day3Application implements CommandLineRunner {

    final
    Printer printer;

    public Day3Application(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(Day3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
        printer.getBlue().printColor();
        printer.getGreen().printColor();
        printer.getRed().printColor();
    }
}

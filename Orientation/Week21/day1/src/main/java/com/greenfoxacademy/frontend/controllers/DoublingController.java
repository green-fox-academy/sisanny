package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Num;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

    @GetMapping(path = "/doubling")
    public Object doubling(@RequestParam("input") Integer recieved) {
        if (recieved != null) {
            Num number = new Num(recieved);
            return number.getResult();
        } else {
            return "Please provide an input!";
        }
    }
}

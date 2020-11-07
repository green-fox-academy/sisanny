package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    Greetings greetings = new Greetings(null, new AtomicLong(0));

    @RequestMapping(method = RequestMethod.GET, path = "/greet")
    public Greetings greeting(@RequestParam(required = false) AtomicLong greetCounter, @RequestParam String name) {
        greetings.greetCounter.incrementAndGet();
        greetings.content = "Hello, " + name + "!";
        return greetings;
    }
}

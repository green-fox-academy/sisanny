package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Errors;
import com.greenfoxacademy.frontend.models.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping(path = "/greeter")
    public Object renderGreeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        Errors error = new Errors();
        Message message = new Message();
        if (name != null && title != null) {
            message.setWelcome_message("Oh, hi there " + name + " , my dear " + title + ".");
            return message;
        } else if (name != null) {
            error.setError("Please provide a title!");
            return ResponseEntity.badRequest().body(error);
        } else if (title != null) {
            error.setError("Please provide a name!");
            return ResponseEntity.badRequest().body(error);
        } else {
            error.setError("Please provide a name and a title!");
            return ResponseEntity.badRequest().body(error);
        }
    }
}

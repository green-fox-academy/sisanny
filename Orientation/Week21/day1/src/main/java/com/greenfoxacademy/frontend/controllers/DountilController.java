package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Action;
import com.greenfoxacademy.frontend.models.Errors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DountilController {

    @PostMapping("/dountil/{action}")
    public Object dountil(@RequestBody Action number) {
        Errors error = new Errors();
        if (number == null) {
            error.setError("Please provide a number!");
            return ResponseEntity.badRequest().body(error);
        }
        return ResponseEntity.ok();
    }
}

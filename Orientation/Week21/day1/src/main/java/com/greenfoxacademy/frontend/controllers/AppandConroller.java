package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Appendable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppandConroller {

    @GetMapping("/appenda")
    public ResponseEntity noAppendable() {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/appenda/{appendable}")
    public Object appenda(@PathVariable Appendable appendable) {
        appendable.setAppended("kuty");
        appendable.setAppended(appendable.getAppended().concat("a"));
        return appendable;
    }
}

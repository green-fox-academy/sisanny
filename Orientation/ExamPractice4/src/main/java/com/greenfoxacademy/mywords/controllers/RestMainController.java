package com.greenfoxacademy.mywords.controllers;

import com.greenfoxacademy.mywords.services.MyWordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {

    final
    MyWordService myWordService;

    public RestMainController(MyWordService myWordService) {
        this.myWordService = myWordService;
    }

    @GetMapping(path = "/api/frequent")
    public ResponseEntity getFourMostFrequent() {
        return ResponseEntity.ok(myWordService.getMostFrequentList(myWordService.findAll()));
    }
}

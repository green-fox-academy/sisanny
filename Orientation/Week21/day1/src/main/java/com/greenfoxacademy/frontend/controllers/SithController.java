package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.models.Sith;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SithController {

    @PostMapping(path = ("/sith"))
    public Object reverseSith(@RequestBody Sith sith) {
        if (sith.getText() == null) {
            return new Error("Feed me some text you have to, padawan young you are. Hmmm.");
        } else {
            return "bla";
        }
    }
}

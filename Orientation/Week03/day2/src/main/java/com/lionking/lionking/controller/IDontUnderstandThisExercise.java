package com.lionking.lionking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IDontUnderstandThisExercise {

    @GetMapping(path = "display")
    public String displayString(Model model) {
        model.addAttribute("display", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "HTMLception";
    }
}

package com.greenfoxacademy.refactororientationexam.controllers;

import com.greenfoxacademy.refactororientationexam.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(path = "/home")
    public String renderHomePage(Model model) {
        model.addAttribute("user", new User());
        return "home";
    }
}

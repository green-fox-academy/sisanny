package com.example.day3.untilities.controllers;

import com.example.day3.untilities.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

    final
    UtilityService utilityService;

    public UtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping(path = "/useful")
    public String showHomePage() {
        return "useful";
    }

    @GetMapping(path = "/useful/colored")
    public String colorBackground(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping(path = "useful/email")
    public String showEmails(Model model, @RequestParam(name = "email") String email) {
        model.addAttribute("email", utilityService.validateEmail(email));
        return "email";
    }

    @GetMapping(path = "/decoder")
    public String caesarDecoder(Model model, @RequestParam(name = "text") String text, @RequestParam(name = "number") int number) {
        model.addAttribute("coded", utilityService.caesar(text, -number));
        return "caesar";
    }

    @GetMapping(path = "/encoder")
    public String caesar(Model model, @RequestParam(name = "text") String text, @RequestParam(name = "number") int number) {
        model.addAttribute("coded", utilityService.caesar(text, number));
        return "caesar";
    }
}


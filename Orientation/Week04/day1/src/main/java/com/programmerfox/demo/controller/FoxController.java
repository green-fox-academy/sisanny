package com.programmerfox.demo.controller;

import com.programmerfox.demo.model.Food;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoxController {

    @GetMapping(path = "/nutritionStore")
    public String changeNutritions(Model model) {
        model.addAttribute("foods", Food.values());
        model.addAttribute("drinks", Food.values());
        return "nutrition";
    }
}

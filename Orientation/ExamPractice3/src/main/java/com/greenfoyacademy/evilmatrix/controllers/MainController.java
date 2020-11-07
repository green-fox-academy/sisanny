package com.greenfoyacademy.evilmatrix.controllers;

import com.greenfoyacademy.evilmatrix.models.EvilMatrix;
import com.greenfoyacademy.evilmatrix.services.EvilMatrixService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    final
    EvilMatrixService evilMatrixService;

    public MainController(EvilMatrixService evilMatrixService) {
        this.evilMatrixService = evilMatrixService;
    }

    @GetMapping(path = "/")
    public String renderMainPage(Model model, @RequestParam(required = false, name = "warnA") boolean warnA,
                                 @RequestParam(required = false, name = "warnM") boolean warnM,
                                 @ModelAttribute EvilMatrix evilMatrix) {
        model.addAttribute("warnA", warnA);
        model.addAttribute("warnM", warnM);
        return "index";
    }

    @PostMapping(path = "/matrix")
    public String postMainPage(Model model, @ModelAttribute EvilMatrix evilMatrix) {
        if (evilMatrix.getMatrix().isEmpty() || evilMatrix.getMatrix() == null) {
            return "redirect:/?warnM=true";
        } else if (evilMatrix.getAuthor().isEmpty() || evilMatrix.getAuthor() == null) {
            return "redirect:/?warnA=true";
        } else if (evilMatrixService.isSquare(evilMatrix.getMatrix())) {
            evilMatrix.setSquare(true);
        } else {
            evilMatrix.setSquare(false);
        }
        evilMatrixService.save(evilMatrix);
        model.addAttribute("evilMatrix", evilMatrix);
        model.addAttribute("success", "Success!");
        return "index";
    }

    @GetMapping(path = "/edit/{id}")
    public Object editMatrix(@PathVariable int id, @ModelAttribute EvilMatrix evilMatrix, Model model) {
        if (evilMatrixService.findById(id) != null) {
            if (evilMatrix.isSquare()) {
                evilMatrix.setSquare(true);
            } else {
                evilMatrix.setSquare(false);
            }
            model.addAttribute("evilMatrix", evilMatrixService.findById(id));
            evilMatrixService.save(evilMatrixService.findById(id));
            return "index";
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}


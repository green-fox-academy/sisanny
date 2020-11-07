package com.greenfoyacademy.evilmatrix.controllers;

import com.greenfoyacademy.evilmatrix.services.EvilMatrixService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {
    final
    EvilMatrixService evilMatrixService;

    public RestMainController(EvilMatrixService evilMatrixService) {
        this.evilMatrixService = evilMatrixService;
    }

    @GetMapping(path = "/matrices")
    public ResponseEntity getMatrices() {
        return ResponseEntity.ok(evilMatrixService.findAll());
    }

    @GetMapping(path = "/matrices/author/{author}")
    public ResponseEntity getMatricesFromSameAuthor(@PathVariable String author) {
        return ResponseEntity.ok(evilMatrixService.getListOfMatricesFromSameAuthor(author));
    }
}

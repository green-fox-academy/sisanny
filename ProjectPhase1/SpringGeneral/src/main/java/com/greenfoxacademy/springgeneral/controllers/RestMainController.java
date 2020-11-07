package com.greenfoxacademy.springgeneral.controllers;

import com.greenfoxacademy.springgeneral.models.Meal;
import com.greenfoxacademy.springgeneral.services.MealService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestMainController {
    final
    MealService mealService;

    public RestMainController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping(path = "/")
    public ResponseEntity getMeals() {
        return ResponseEntity.ok(mealService.findAll());
    }

    @PostMapping(path = "/add")
    public ResponseEntity addMeal(@RequestBody Meal meal) {
        mealService.save(meal);
        return (ResponseEntity) ResponseEntity.ok();
    }

    @PutMapping(path = "/update")
    public ResponseEntity updateMeals(@RequestBody Meal meal) {
        mealService.save(meal);
        return (ResponseEntity) ResponseEntity.ok();
    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity deleteMeal(@RequestBody Meal meal) {
        mealService.delete(meal);
        return (ResponseEntity) ResponseEntity.ok();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity getMeals(@PathVariable int id) {
        return ResponseEntity.ok(mealService.findById(id));
    }
}

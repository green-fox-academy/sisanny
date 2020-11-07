package com.greenfoxacademy.springgeneral.services;

import com.greenfoxacademy.springgeneral.models.Meal;

import java.util.List;

public interface MealService {
    List<Meal> findAll();
    Meal findById(int id);
    void save(Meal meal);
    void delete(Meal meal);
}

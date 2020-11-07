package com.greenfoxacademy.springgeneral.repositories;

import com.greenfoxacademy.springgeneral.models.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends CrudRepository<Meal, Integer> {
    List<Meal> findAll();
    Meal findById(int id);
    void delete(Meal meal);
}

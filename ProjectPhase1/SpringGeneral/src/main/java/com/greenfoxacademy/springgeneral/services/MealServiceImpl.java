package com.greenfoxacademy.springgeneral.services;

import com.greenfoxacademy.springgeneral.models.Meal;
import com.greenfoxacademy.springgeneral.repositories.MealRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealServiceImpl implements MealService{

    final
    MealRepository mealRepository;

    public MealServiceImpl(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public List<Meal> findAll() {
        return mealRepository.findAll();
    }

    @Override
    public Meal findById(int id) {
        return mealRepository.findById(id);
    }

    @Override
    public void save(Meal meal) {
        mealRepository.save(meal);
    }

    @Override
    public void delete(Meal meal) {
        mealRepository.delete(meal);
    }
}

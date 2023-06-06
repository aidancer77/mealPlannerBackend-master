package com.example.demo.controller;

import com.example.demo.domain.Meal;
import com.example.demo.repo.MealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class MealController {
    private final MealRepo mealRepo;

    @Autowired
    public MealController(MealRepo mealRepo) {
        this.mealRepo = mealRepo;
    }

    @GetMapping("/meals")
    public List<Meal> getAll() {
        return mealRepo.findAll();
    }

    @GetMapping("/meals/{meals_id}")
    public Meal getOne(@PathVariable("meals_id") Meal meal) {
        return meal;
    }

    @PostMapping("/meals")
    public Meal create(@RequestBody Meal meal) {
        return mealRepo.save(meal);
    }
}
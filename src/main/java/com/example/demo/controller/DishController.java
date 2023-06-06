package com.example.demo.controller;

import com.example.demo.domain.Dish;
import com.example.demo.domain.Meal;
import com.example.demo.repo.DishRepo;
import com.example.demo.repo.MealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class DishController {
    private final DishRepo dishRepo;

    @Autowired
    public DishController(DishRepo dishRepo) {
        this.dishRepo = dishRepo;
    }

    @GetMapping("/dishes")
    public List<Dish> getAll() {
        return dishRepo.findAll();
    }

    @GetMapping("/dishes/{dishes_id}")
    public Dish getOne(@PathVariable("dishes_id") Dish dish) {
        return dish;
    }

    @PostMapping("/dishes")
    public Dish create(@RequestBody Dish dish) {
        return dishRepo.save(dish);
    }
}
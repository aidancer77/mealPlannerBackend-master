package com.example.demo.controller;

import com.example.demo.domain.Dish;
import com.example.demo.domain.DishCategory;
import com.example.demo.repo.DishCategoryRepo;
import com.example.demo.repo.DishRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class DishCategoryController {
    private final DishCategoryRepo dishCategoryRepo;

    @Autowired
    public DishCategoryController(DishCategoryRepo dishCategoryRepo) {
        this.dishCategoryRepo = dishCategoryRepo;
    }

    @GetMapping("/categories")
    public List<DishCategory> getAll() {
        return dishCategoryRepo.findAll();
    }

    @GetMapping("/categories/{dishes_categories_id}")
    public DishCategory getOne(@PathVariable("dishes_categories_id") DishCategory dishCategoryRepo) {
        return dishCategoryRepo;
    }

    @PostMapping("/categories")
    public DishCategory create(@RequestBody DishCategory dishCategory) {
        return dishCategoryRepo.save(dishCategory);
    }
}
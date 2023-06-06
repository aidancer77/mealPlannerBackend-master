package com.example.demo.controller;

import com.example.demo.domain.Ingredient;
import com.example.demo.repo.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class IngredientController {
    private final IngredientRepo ingredientRepo;

    @Autowired
    public IngredientController(IngredientRepo ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @GetMapping("/ingredients")
    public List<Ingredient> getAll() {
        return ingredientRepo.findAll();
    }

    @GetMapping("/ingredients/{ingredients_id}")
    public Ingredient getOne(@PathVariable("ingredients_id") Ingredient ingredient) {
        return ingredient;
    }

    @PostMapping("/ingredients")
    public Ingredient create(@RequestBody Ingredient ingredient) {
        return ingredientRepo.save(ingredient);
    }
}
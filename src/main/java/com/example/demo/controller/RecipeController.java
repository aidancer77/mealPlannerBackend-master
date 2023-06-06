package com.example.demo.controller;

import com.example.demo.domain.Ingredient;
import com.example.demo.domain.Recipe;
import com.example.demo.repo.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class RecipeController {
    private final RecipeRepo recipeRepo;

    @Autowired
    public RecipeController(RecipeRepo recipeRepo) { this.recipeRepo = recipeRepo; }

    @GetMapping("/recipes")
    public List<Recipe> getAll() {
        return recipeRepo.findAll();
    }

    @GetMapping("/recipes/{id}")
    public Recipe getOne(@PathVariable("id") Recipe recipe) {
        return recipe;
    }

    @PostMapping("/recipes")
    public Recipe create(@RequestBody Recipe recipe) {
        return recipeRepo.save(recipe);
    }
}

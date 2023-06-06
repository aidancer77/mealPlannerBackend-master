package com.example.demo.repo;

import com.example.demo.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepo extends JpaRepository <Recipe, Long> {
}

package com.example.demo.repo;

import com.example.demo.domain.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepo extends JpaRepository<Meal, Long> {
}

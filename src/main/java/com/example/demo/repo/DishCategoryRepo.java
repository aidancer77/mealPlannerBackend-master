package com.example.demo.repo;

import com.example.demo.domain.DishCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DishCategoryRepo extends JpaRepository<DishCategory, Long> {
}

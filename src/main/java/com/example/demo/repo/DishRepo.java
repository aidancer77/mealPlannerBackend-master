package com.example.demo.repo;

import com.example.demo.domain.Dish;
import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepo extends JpaRepository<Dish, Long> {
}

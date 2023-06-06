package com.example.demo.repo;

import com.example.demo.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo  extends JpaRepository<Order, Long> {
    List<Order> findByUsersId(String userId);
}

package com.example.demo.controller;

import com.example.demo.domain.Order;
import com.example.demo.repo.OrderRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class OrderController {
    private final OrderRepo orderRepo;

    @Autowired
    public OrderController(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @GetMapping("/orders")
    public List<Order> getAll() {
        return orderRepo.findAll();
    }

    @GetMapping("/orders/users/{usersId}")
    public ResponseEntity<List<Order>> getAllUsersId(@PathVariable String usersId) {
        return new ResponseEntity<List<Order>>(orderRepo.findByUsersId(usersId), HttpStatus.OK);
    }

    @GetMapping("/orders/{id}")
    public Order getOne(@PathVariable("id") Order order) {
        return order;
    }

    @PostMapping("/orders")
    public Order create(@RequestBody Order order) {
        return orderRepo.save(order);
    }

    @PutMapping("/orders/{id}")
    public Order update(
            @PathVariable("id") Order orderFromDb,
            @RequestBody Order order
    ) {
        BeanUtils.copyProperties(order, orderFromDb, "id");
        return orderRepo.save(orderFromDb);
    }

    @DeleteMapping("/orders/{id}")
    public void delete(@PathVariable("id") Order order) {
        orderRepo.delete(order);
    }
}
package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(name = "order_date", updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDateTime orderDate;

    @Column(name = "dishes_date", updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDateTime dishesDate;

    @Column(name = "dishes_id")
    private Long dishesId;

    @Column(name = "meals_id")
    private Long mealsId;

    @Column(name = "users_id")
    private Long usersId;

    public Order() { }

    public Order(Long id, LocalDateTime orderDate, LocalDateTime dishesDate, Long dishesId, Long mealsId, Long usersId) {
        Id = id;
        this.orderDate = orderDate;
        this.dishesDate = dishesDate;
        this.dishesId = dishesId;
        this.mealsId = mealsId;
        this.usersId = usersId;
    }

    public Long getId() { return Id; }
    public void setId(Long Id) { this.Id = Id; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }

    public LocalDateTime getDishesDate() { return dishesDate; }
    public void setDishesDate(LocalDateTime dishesDate) { this.dishesDate = dishesDate; }

    public Long getDishesId() { return dishesId; }
    public void setDishesId(Long dishesId) { this.dishesId = dishesId; }

    public Long getMealsId() { return mealsId; }
    public void setMealsId(Long mealsId) { this.mealsId = mealsId; }

    public Long getUsersId() { return usersId; }
    public void setUsersId(Long usersId) { this.usersId = usersId; }
}

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dishes_id", nullable = false)
    private Dish dishesId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "meals_id", nullable = false)
    private Meal mealsId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_id", nullable = false)
    private User usersId;

    public Order() { }

    public Order(Long id, LocalDateTime orderDate, LocalDateTime dishesDate, Dish dishesId, Meal mealsId, User usersId) {
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

    public Dish getDishesId() { return dishesId; }
    public void setDishesId(Dish dishesId) { this.dishesId = dishesId; }

    public Meal getMealsId() { return mealsId; }
    public void setMealsId(Meal mealsId) { this.mealsId = mealsId; }

    public User getUsersId() { return usersId; }
    public void setUsersId(User usersId) { this.usersId = usersId; }
}

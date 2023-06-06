package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "meals")
public class Meal {
    @Id
    @Column(name = "meals_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(name = "meals_name")
    private String mealsName;

    public Meal() { }

    public Meal(Long Id, String mealsName) {
        this.Id = Id;
        this.mealsName = mealsName;
    }

    public Long getId() { return Id; }
    public void setId(Long Id) { this.Id = Id; }

    public String getMealsName() { return mealsName; }
    public void setMealsName(String mealsName) { this.mealsName = mealsName; }
}

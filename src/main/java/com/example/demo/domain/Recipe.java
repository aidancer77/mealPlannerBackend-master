package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe {
    @Id
    //@Column(name = "recipes_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(name = "ingredients_quantity")
    private Long ingredientsQuantity;

    @Column(name = "ingredients_id")
    private Long ingredientsId;

    @Column(name = "dishes_id")
    private Long dishesId;

    public Recipe(Long id, Long ingredientsQuantity, Long ingredientsId, Long dishesId) {
        Id = id;
        this.ingredientsQuantity = ingredientsQuantity;
        this.ingredientsId = ingredientsId;
        this.dishesId = dishesId;
    }

    public Recipe() { }

    public Long getId() { return Id; }
    public void setId(Long id) { Id = id; }

    public Long getIngredientsQuantity() { return ingredientsQuantity; }
    public void setIngredientsQuantity(Long ingredientsQuantity) { this.ingredientsQuantity = ingredientsQuantity; }

    public Long getIngredientsId() { return ingredientsId; }
    public void setIngredientsId(Long ingredientsId) { this.ingredientsId = ingredientsId; }

    public Long getDishesId() { return dishesId; }
    public void setDishesId(Long dishesId) { this.dishesId = dishesId; }
}

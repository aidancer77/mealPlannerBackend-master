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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ingredients_id", nullable = false)
    private Ingredient ingredientsId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dishes_id", nullable = false)
    private Dish dishesId;

    public Recipe(Long id, Long ingredientsQuantity, Ingredient ingredientsId, Dish dishesId) {
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

    public Ingredient getIngredientsId() { return ingredientsId; }
    public void setIngredientsId(Ingredient ingredientsId) { this.ingredientsId = ingredientsId; }

    public Dish getDishesId() { return dishesId; }
    public void setDishesId(Dish dishesId) { this.dishesId = dishesId; }
}

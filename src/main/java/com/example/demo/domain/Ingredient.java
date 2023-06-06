package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @Column(name = "ingredients_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(name = "ingredients_name")
    private String ingredientsName;

    @Column(name = "ingredients_measure")
    private String ingredientsMeasure;

    public Ingredient() { }

    public Ingredient(Long id, String ingredientsName, String ingredientsMeasure) {
        Id = id;
        this.ingredientsName = ingredientsName;
        this.ingredientsMeasure = ingredientsMeasure;
    }

    public Long getId() { return Id; }
    public void setId(Long Id) { this.Id = Id; }

    public String getIngredientsName() { return ingredientsName; }
    public void setIngredientsName(String ingredientsName) { this.ingredientsName = ingredientsName; }

    public String getIngredientsMeasure() { return ingredientsMeasure; }
    public void setIngredientsMeasure(String ingredientsMeasure) { this.ingredientsMeasure = ingredientsMeasure; }
}

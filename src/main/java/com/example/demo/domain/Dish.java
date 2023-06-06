package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @Column(name = "dishes_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(name = "dishes_categories_id")
    private Long dishesCategoriesId;

    @Column(name = "dishes_name")
    private String dishesName;

    @Column(name = "duration")
    private String duration;

    @Column(name = "complexity")
    private String complexity;

    @Column(name = "energy_value")
    private String energyValue;

    @Column(name = "proteins")      //белки
    private String proteins;

    @Column(name = "fats")          //жиры
    private String fats;

    @Column(name = "carbohydrates")     //углеводы
    private String carbohydrates;

    @Column(name = "description", columnDefinition="TEXT")
    private String description;

    @Column(name = "dishes_image")
    private String dishesImage;



    public Dish() { }

    public Dish(Long id, Long dishesCategoriesId, String dishesName, String duration, String complexity,
                String energyValue, String proteins, String fats, String carbohydrates, String description,
                String dishesImage) {
        Id = id;
        this.dishesCategoriesId = dishesCategoriesId;
        this.dishesName = dishesName;
        this.duration = duration;
        this.complexity = complexity;
        this.energyValue = energyValue;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.description = description;
        this.dishesImage = dishesImage;
    }

    public Long getId() { return Id; }
    public void setId(Long Id) { this.Id = Id; }

    public Long getDishesCategoriesId() { return dishesCategoriesId; }
    public void setDishesCategoriesId(Long dishesCategoriesId) {
        this.dishesCategoriesId = dishesCategoriesId; }

    public String getDishesName() { return dishesName; }
    public void setDishesName(String dishesName) { this.dishesName = dishesName; }

    public String getDishesImage() { return dishesImage; }
    public void setDishesImage(String dishesImage) { this.dishesImage = dishesImage; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public String getComplexity() { return complexity; }
    public void setComplexity(String complexity) { this.complexity = complexity; }

    public String getEnergyValue() { return energyValue; }
    public void setEnergyValue(String energyValue) { this.energyValue = energyValue; }

    public String getProteins() { return proteins; }
    public void setProteins(String proteins) { this.proteins = proteins; }

    public String getFats() { return fats; }
    public void setFats(String fats) { this.fats = fats; }

    public String getCarbohydrates() { return carbohydrates; }
    public void setCarbohydrates(String carbohydrates) { this.carbohydrates = carbohydrates; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
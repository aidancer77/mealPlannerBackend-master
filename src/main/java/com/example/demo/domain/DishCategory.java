package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dishes_categories")
public class DishCategory {

    @Id
    @Column(name = "dishes_categories_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(name = "dishes_categories_name")
    private String dishesCategoriesName;

/*    @OneToMany(fetch = FetchType.EAGER, mappedBy = "dishCategory")
    private List<Dish> dish;
    */

    public DishCategory() { }

    public DishCategory(Long id, String dishesCategoriesName, List<Dish> dish) {
        Id = id;
        this.dishesCategoriesName = dishesCategoriesName;
       // this.dish = dish;
    }

    public Long getId() { return Id; }
    public void setId(Long Id) { this.Id = Id; }

    public String getDishesCategoriesName() { return dishesCategoriesName; }
    public void setDishesCategoriesName(String dishesCategoriesName) {
        this.dishesCategoriesName = dishesCategoriesName; }

 /*   public List<Dish> getDish() { return dish; }
    public void setDish(List<Dish> dish) { this.dish = dish; }
  */
}

package com.epam.pizza.model.products;

import java.util.List; //импотирование библиотеки для list

public class Pizza extends Product {
    private String pizza_type;
    private String nutritional_value;
    private int cCal;
    private List<Ingredients> ingredients;

    //конструктор
    public Pizza(String product_name, int product_value, String pizza_type, String nutritional_value, int cCal, List<Ingredients> ingredients) {
        super(product_name, product_value);
        this.pizza_type = pizza_type;
        this.nutritional_value = nutritional_value;
        this.cCal = cCal;
        this.ingredients = ingredients;
    }

    public String getPizza_type() { //getter
        return pizza_type;
    }

    public String getNutritional_value() { //getter
        return nutritional_value;
    }

    public int getcCal() { //getter
        return cCal;
    }

    public List<Ingredients> getIngredients() { //getter
        return ingredients;
    }
}

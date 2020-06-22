package com.epam.pizza.model.products;

import java.util.List; //импотирование библиотеки для list
import java.util.Objects;

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

    // для remove в функции "удаления"
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pizza pizza = (Pizza) o;
        return cCal == pizza.cCal &&
                pizza_type.equals(pizza.pizza_type) &&
                nutritional_value.equals(pizza.nutritional_value) &&
                ingredients.equals(pizza.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pizza_type, nutritional_value, cCal, ingredients);
    }
}

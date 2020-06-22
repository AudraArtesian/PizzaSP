package com.epam.pizza.model.products;

public class Drink extends Product{ // класс-наследник от "Продукт"
    private int drink_size;

    public Drink(String product_name, int product_value, int drink_size) { //конструктор
        super(product_name, product_value);
        this.drink_size = drink_size;
    }

    public int getDrink_size() { //getter
        return drink_size;
    }
}

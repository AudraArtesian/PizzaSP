package com.epam.pizza.model.products;

import java.util.Objects;

public class Drink extends Product{ // класс-наследник от "Продукт"
    private int drink_size;

    public Drink(String product_name, int product_value, int drink_size) { //конструктор
        super(product_name, product_value);
        this.drink_size = drink_size;
    }

    public int getDrink_size() { //getter
        return drink_size;
    }

    // для remove в функции "удаления"
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Drink drink = (Drink) o;
        return drink_size == drink.drink_size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), drink_size);
    }
}

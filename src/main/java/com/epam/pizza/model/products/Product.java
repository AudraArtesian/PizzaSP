package com.epam.pizza.model.products;

import java.util.Objects;

public abstract class Product {  //абстрактный класс "Продукт"
    protected String product_name;
    protected int product_value; // protected = #

    Product(String product_name, int product_value) { //конструктор
        this.product_name = product_name;
        this.product_value = product_value;
    }

    public String getProduct_name() { //getter
        return product_name;
    }

    public int getProduct_value() { //getter
        return product_value;
    }

    // для remove в функции "удаления"
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return product_value == product.product_value &&
                product_name.equals(product.product_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_name, product_value);
    }
}

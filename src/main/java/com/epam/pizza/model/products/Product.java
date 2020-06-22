package com.epam.pizza.model.products;

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
}

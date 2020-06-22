package com.epam.pizza.model.order;
import com.epam.pizza.model.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private String client_name;
    private String phone_number;
    private String address;
    private Pay_method pay_method;
    private int amount_pizza;
    private int amount_drink;

    public Order(String client_name, String phone_number, String address, Pay_method pay_method) { //конструктор
        this.client_name = client_name;
        this.phone_number = phone_number;
        this.address = address;
        this.pay_method = pay_method;
        amount_drink = 0;
        amount_pizza = 0;
        products = new ArrayList<>(); //адрес массива сохраняем в ссылку products
    }


    public void setClient_name(String client_name) { //setter
        this.client_name = client_name;
    }

    public void setPhone_number(String phone_number) { //setter
        this.phone_number = phone_number;
    }

    public void setAddress(String address) { //setter
        this.address = address;
    }

    public void setPay_method(Pay_method pay_method) { //setter
        this.pay_method = pay_method;
    }

    public List<Product> getProducts() { //getter
        return products;
    }

    public String getClient_name() { //getter
        return client_name;
    }

    public String getPhone_number() { //getter
        return phone_number;
    }

    public String getAddress() { //getter
        return address;
    }

    public Pay_method getPay_method() {
        return pay_method;
    }
}

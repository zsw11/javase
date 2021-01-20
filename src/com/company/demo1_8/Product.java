package com.company.demo1_8;

/**
 * @author zsw
 * @date 2020/12/30 12:00
 */
public class Product {

    private int id;
    private String name;
    private String color;
    private Double price;

    public Product(int id, String name, String color, Double price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

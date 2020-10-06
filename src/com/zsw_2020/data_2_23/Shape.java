package com.zsw_2020.data_2_23;

/**
 * 抽象类
 * 抽象方法是为所有子类提供一个统一的接口
 * 抽象类不能实例化
 */
public abstract class Shape {
    String name;

    public Shape(String name) {//抽象类可以定义构造方法
        this.name = name;
    }

    public String getName() {//抽象类可以定义非抽象方法
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double perimeter();//抽象类可以定义抽象方法
    public abstract double area();
}

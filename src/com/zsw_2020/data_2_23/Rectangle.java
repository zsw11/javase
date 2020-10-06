package com.zsw_2020.data_2_23;
//矩形
public class Rectangle extends Shape{
    private int height;
    private int row;

    public Rectangle(int height, int row) {
        super("矩形");
        this.height = height;
        this.row = row;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public  double area(){
        System.out.println(name);
        return 2*height*row;
    }
}

package com.zsw_2020.data_2_23;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        this("Circle",2.0);
    }

    public Circle(String name, double radius) {//构造方法对private变量进行修改
        super(name);
        this.radius = radius;
    }

    @Override
    public double perimeter() {//实现超类的方法
        return 2*Math.PI*radius;
    }

    @Override
    public double area() {
        System.out.println(name);//直接调用父类的name变量
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {//覆盖Object类的toString方法
        return "[Circle]radius="+radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.perimeter());
        System.out.println(c.area());
        System.out.println(c.toString());
        c.setRadius(4.0);//set方法对private变量进行修改
        System.out.println(c.perimeter());
        System.out.println(c.area());
        System.out.println(c.toString());
//  结果： 12.566370614359172
//        12.566370614359172
//        [Circle]radius=2.0
//        25.132741228718345
//        50.26548245743669
//        [Circle]radius=4.0

    }
}

package com.zsw_2020.data_2_18;

/**
 * 圆类的定义
 */
public class Circle {
    static double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public static double area(){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
//       Circle c = new Circle(3.0);
//       System.out.print(c.perimeter()+";"+ area());
        System.out.print(area());//结果为0，radius使用成员变量默认值
        Circle c = new Circle();//c为声明Circle对象的引用，然后使用new调用类的构造方法创建对象
        c.setRadius(10);
        System.out.print(c.perimeter());
        /* 基本数据类型和引用数据类型的参数传递

        *  对象引用赋值
        * int x= 10;
        * int y = x;  将x的值10渎职给y
        *
        * Circle c = new Circle();
        * Circle c1 = c；  将c的引用赋值给对象c1  如果执行c.setRadius(10); c1的Radius值也为10
        *
        * */
    }
}

package com.zsw_2020.data_2_23;

/**
 *多态
 */
public class DuoTaiDemo {
    public static void main(String[] args) {
        Shape[] shapes =new Shape[2];
        shapes[0] =new Circle("circel",10);//多态的体现，父类引用指向子类，还有一张多态的体现，在方法入参时传父类
        shapes[1] =new Rectangle(10,10);
        for(Shape shape:shapes){
            System.out.println(shape.area());
        }

    }
}

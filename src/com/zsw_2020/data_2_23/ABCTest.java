package com.zsw_2020.data_2_23;

/**
 * 接口使互不相关的类具有相同的行为    interface
 * 接口只有常量和方法(只有声明，没有实现jdk8以前)
 * 接口与抽象类的区别
 */
public class ABCTest implements CC {
    private int D = 4;

    @Override
    public void displayA() {
        System.out.println("A=" + A);
    }

    @Override
    public void displayB() {
        System.out.println("B=" + B);
    }

    @Override
    public void displayC() {
        System.out.println("C=" + C);
    }

    public static void main(String[] args) {
        ABCTest abcTest = new ABCTest();
        abcTest.displayA();
        abcTest.displayB();
        abcTest.displayC();
        System.out.println("ABCTest.D="+abcTest.D);
        System.out.println("ABCTest.C="+ABCTest.C);//接口里的常量访问
    }
}

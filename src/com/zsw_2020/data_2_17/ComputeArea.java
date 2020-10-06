package com.zsw_2020.data_2_17;

import java.util.Scanner;
/*
成员变量有初始值
局部变量没有
 */
public class ComputeArea {
    private static int b;
    public static void main(String[] args) {
        double radius;
        double area;
        int a = 0x16;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入半径");
        radius = scanner.nextDouble();
        area = radius*radius*Math.PI;
        System.out.println("圆的面积为："+area);
        System.out.println(a+";"+b);
    }
}

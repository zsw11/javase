package com.zsw_2020.data_2_17;

public class LightYear {
    public static void main(String[] args) {
        int speed = 300000;
        int days= 365;
        long seconds = days*24*60*60;
        Long distance = seconds*speed;
        System.out.println(distance);
        WhileDemo.continueDemo();/*来自WhileDemo类的方法，默认修饰符同一个包下可以访问*/
    }

}


package com.zsw_2020.data_2_18;

/**
 * 方法的重载
 */
public class OverLoadDemo {
    public void show(){
        System.out.print("No params!");
    }
    public void show(int a,int b){
        System.out.print("a="+a+",b="+b);
    }
    public void show(double a,int b){
        System.out.print("a="+a+",b="+b);
    }
    public void show(int a){
        System.out.print("a="+a);
    }

    public static void main(String[] args) {
        OverLoadDemo od =new OverLoadDemo();
        od.show();
        od.show(1);
        od.show(2,3);
        od.show(2.4,2);
    }
}

package com.zsw_2020.data_2_18;

public class AB {
    int  a, b;
    public void init(int x){
        a= x; /*改变了成员变量的值*/
        int b=5;  //局部变量b隐藏类成员变量b
        System.out.println("a="+a+";b="+b);
        System.out.println("a="+a+";b="+this.b);/*this的用途*/
    }
    public void display(){
        System.out.println("a="+a+";b="+b);//这里b为成员变量
    }

    public static void main(String[] args) {
        AB ab = new AB();
        ab.display();
        ab.init(6);
        ab.display();
    }
}

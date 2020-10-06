package com.zsw_2020.data_2_18;

/**
 * static写一个单例模式
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private int a = 0;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        return INSTANCE;
    }
    public void methodA(){
        a++;
        System.out.println("a="+a);
    }
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.methodA();
        s2.methodA();
        System.out.println(s1==s2);
    }
}

package com.zsw_2020.data_2_19;

/**
 * 实例变量使用默认初始化，初始值是在调用构造方法之前获得的，以及初始化的顺序，我用静态代码块0->1->2->3标出
 */
/*
*垃圾回收期，一个对象不在被引用，就有可能被回收。强制回收System.gc();
* */
/*
* 变量的作用域和生存期
* */
public class InitDemo {
    int i;//              1
    boolean b;
    double d;
    String g;
    int [] a;/*以上为默认初始化*/

//    int z =3;//声明时初始化          1
//    int r=f();//使用方法初始化
//    {//初始化代码块，是在调用构造方法之前调用的             2
//        int g=5;
//    }
//    static  {//静态初始化代码块，与类一起初始化,里面的变量是静态变量             0
//        int g=5;
//    }
//
//    public InitDemo(int i, boolean b, double d, String g, int[] a) {//构造方法初始化            3
//        this.i = i;
//        this.b = b;
//        this.d = d;
//        this.g = g;
//        this.a = a;
//    }

    public void display(){
        System.out.println("i="+i);
        System.out.println("b="+b);
        System.out.println("d="+d);
        System.out.println("g="+g);
        System.out.println("a="+g);
    }

    public static void main(String[] args) {
        InitDemo initDemo = new InitDemo();
        initDemo.display();
    }

}

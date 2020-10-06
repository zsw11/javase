package com.zsw_2020.data_2_24;

/**
 * try-catch-finally语句
 */
public class DivideDemo {
    public static void main(String[] args) {
        int a= 4;
//        try{
//            int b=a/0;
//            System.out.println("b="+b);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        int b=a/0;//没有捕获异常，程序就停止了
        System.out.println("b="+b);
        cd();
    }
    public static void cd(){
        int  a= 5;
        int c= a/0;
        System.out.println(c);
    }
}

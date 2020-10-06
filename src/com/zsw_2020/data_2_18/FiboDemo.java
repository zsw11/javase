package com.zsw_2020.data_2_18;

/**
 * 递归
 */
public class FiboDemo {
    public static long fib(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<20;i++){
            System.out.println("fib("+i+")="+fib(i));
        }
    }

}

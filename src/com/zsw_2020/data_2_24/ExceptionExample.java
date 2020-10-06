package com.zsw_2020.data_2_24;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * 自定义异常类
 */
public class ExceptionExample {
    static void makeException(int a) throws MyException {
        System.out.println("called makeException("+a+")");
        if(a==0){
            throw new MyException(a);
        }
        System.out.println("exit without exception");
    }
    public static void main(String[] args) {
        try {
            makeException(5);
            makeException(0);
            makeException(5);
        } catch (MyException e) {
            System.out.println("caught:"+e);
        }
    }
}

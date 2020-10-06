package com.zsw_2020.data_2_24;

import java.io.IOException;

/**
 * 编译时异常,程序必须捕获的异常
 * Throwable
 * error  Exception
 *        运行时异常   非运行时异常（必须捕获或声明抛出，否则编译不通过）
 */
public class InputChar {
    public static void main(String[] args) {
        System.out.println("input a char:");
        try {
            char c = (char) System.in.read();//read()方法在定义时声明抛出异常
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

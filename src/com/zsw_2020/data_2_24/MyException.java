package com.zsw_2020.data_2_24;

/**
 * 自定义异常类
 */
public class MyException extends Exception{
    private int num;

    public MyException(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "num=" + num +
                '}';
    }
}

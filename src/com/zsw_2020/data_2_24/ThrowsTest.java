package com.zsw_2020.data_2_24;

import java.io.IOException;

public class ThrowsTest {
    public static void method() throws IOException {
        try {
            throw new IOException("文件不存在");//创建一个异常对象并抛出
        } catch (IOException e) {
            System.out.println("捕获异常：");
//            e.printStackTrace();
            throw e; //将捕获的异常再次抛出
        }
    }
    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            System.out.println("捕获异常输出信息："+e);
        }

    }
}

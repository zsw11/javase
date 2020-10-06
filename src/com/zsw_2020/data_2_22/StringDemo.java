package com.zsw_2020.data_2_22;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * java语言3种字符串类，String，StringBuilder,StringBuffer类，都是final类
 * StringBuilder实例是线程不安全的，StringBuffer实例是线程安全的
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        char[] chars1 = {'A','B','C'};
        char[] chars2 = {'中','古','*','w'};
        String s1 = new String(chars1);//String类有很多构造方法
        String s2= new String(chars2,0,4);
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        byte[] ascil1 = {54,35,97,65,45};
        byte[] ascil2 = {'A',35,97,65,45};//这里的97为utf-8的编码值
        String s3 = new String(ascil1, StandardCharsets.UTF_8);
        String s4 = new String(ascil2,0,5);
        System.out.println("s3="+s3);
        System.out.println("s4="+s4);
    }
}

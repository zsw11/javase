package com.zsw_2020.data_2_22;

/**
 * 字符串的解析
 * 字符串的比较，字符串常量池与字符串对象比较不一样，
 * 字符串大小的比较，不能用大于号比较，要用s1.compareTo(s2),返回一个整数>0时，s1>s2,=0时s1=s2，<0时s1<s2.
 */
public class SplitDemo {
    public static void main(String[] args) {
        String ss = "one little,two little,three little.";
        String[] str = ss.split("[ ,.]");//使用空格逗号句号为分隔符解析字符串
        for(String s:str){
            System.out.println(s);
        }
        System.out.println(ss.matches(".*little.*"));//ss是否与给定的正则表达式匹配

    }
}

package com.zsw_2020.data_2_22;

/**
 * 字符串的查找
 */
public class StringTest {
    public static void main(String[] args) {
        String s = new String("This is a Java String.");
//        String s1 = new String("This is a Java String.");
//        s.replace("a","an");
//        System.out.println(s==s1);//false
//        System.out.println(s);//This is a Java String.  String类型不可变性
        System.out.println(s.length());
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.lastIndexOf("a",10));//到第10为止出现的位置
        System.out.println(s.indexOf("is"));
        String s1 = "is interesting";
        s1 = s.concat(s1);
        System.out.println(s);//This is a Java String.
        System.out.println(s1.toUpperCase());
        System.out.println(s.endsWith("ing"));

    }


}

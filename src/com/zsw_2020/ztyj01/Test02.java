package com.zsw_2020.ztyj01;

/**
 * @author 54623
 * @date 2021/7/6 13:46
 */
public class Test02 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = new String("b");
        String s4 = s1 + s3;
        StringBuffer a = new StringBuffer("a");
        StringBuffer b = a.append("b");
        String s5="ab";
        String s6 = s1 + s2;
        String s66= s1 + s2;
        String s7 = "a" + s2;
        String s8 = s1 + "b";
        String s9 = "a" + "b";
        String zsw = "zsw";
        String zsw1 = "zsw";
        System.out.println(zsw == zsw1); // true

        System.out.println(s2 == s3);  //false
        System.out.println(s4 == b.toString());  //false
        System.out.println(b.toString()==s5);  //false
        System.out.println(s4 == s5);   //false   s4 是使用了StringBulider来相加了
        System.out.println(s4 == s6);  //false  s4和s6 两个都是使用了StringBulider来相加了
        System.out.println(s6 == s66);     //false   两个都是使用了StringBulider来相加了
        System.out.println(s5 == s7);    //false   s7是使用了StringBulider来相加了
        System.out.println(s5 == s8);  //false   s8是使用了StringBulider来相加了
        System.out.println(s7 == s8);  //false  两个都是使用了StringBulider来相加了
        System.out.println(s9 == s8);  //false  两个都是使用了StringBulider来相加了
    }
}

package com.zsw_2020.test1;

public class StringTest                        {
    public static void main(String[] args) {
        String s1="s";
        StringBuilder s2 = new StringBuilder("sb");
//        for(int i=0;i<10;i++){
////            s2.append(s1);
////        }
        //String的值是不可变的，这就导致每次对String的操作都会生成新的String对象
        s1.replace("s","r");
        String s3 = s1.replace('s','b');
        s2.setCharAt(0,'r');
        s2.replace(0,1,"z");
        System.out.println(s2);
        System.out.println(s1+":"+s3);
    }
}

package com.zsw_2020.data_2_25;

import java.util.HashSet;
import java.util.Set;

/**
 * Hashset
 */
public class FindDups {
    public static void main(String[] args) {
        String s ="one little,two little,three little";
        String[] str = s.split("[ ,.]");
        Set<String> hs = new HashSet<>();
        for(String s1: str){
            if(!hs.add(s1)){
                System.out.println("重复单词："+s1);
            }
        }
        System.out.println("共有："+hs.size()+"个单词");
        System.out.println(hs);//数据不重复
    }
}

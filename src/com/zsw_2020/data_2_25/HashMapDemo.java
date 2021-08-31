package com.zsw_2020.data_2_25;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMap
 * Map接口常用方法
 *
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //map的3种对象的迭代
        Map<String,String> s = new HashMap<>();
        s.put("1", "1");
        s.put("2", "1");
        s.put("3", "1");
        s.put("4", "1");
        System.out.println(s.keySet());
        for(String key:s.keySet()){
            System.out.println(key);
        }
        for(Map.Entry<String, String> entry:s.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        for (Iterator iterator=s.keySet().iterator(); iterator.hasNext();){
            if(iterator.hasNext()){
                iterator.remove();
            }
        }
    }
}

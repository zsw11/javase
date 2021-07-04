package com.zsw_2020.ztyj01;

import java.util.Comparator;

/**
 * @author 54623
 * @date 2021/7/3 15:27
 */
public class MyCustomCompator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        int i = s1.compareTo(s2);
        if(s1.charAt(0)== s2.charAt(0)){
            s1.indexOf("-",2);//第二次出现-的下标
            String numstart = s1.substring(1, s1.indexOf("-"));
            String numend = s2.substring(1, s2.indexOf("-"));
            Integer intstart = Integer.valueOf(numstart);
            Integer intend = Integer.valueOf(numend);
           return intstart.compareTo(intend);
        }
        return i;
    }
}

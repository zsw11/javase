package com.zsw_2020.test1;

import java.util.Arrays;

/**
 * 枚举
 */
public enum WeekDay{
    SUNDAY,MONDAY,TUESDAY,
    WESDAY,FRIDAY,STARTADAY;

}
class EnumDemo{
    public static void main(String[] args) {
        WeekDay[] days = WeekDay.values();
        System.out.println(Arrays.toString(days));
        String s= "SUNDAY";
        System.out.println(WeekDay.valueOf(s).ordinal());
    }

}

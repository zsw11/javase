package com.zsw_2020.test1;

import java.util.Arrays;

/**
 * 枚举
 */
public enum WeekDay {
    SUNDAY("s"), MONDAY("s"), TUESDAY("s"),
    WESDAY("s"), FRIDAY("s"), STARTADAY("s"),
    ;
    private String string;


    WeekDay(String string) {
        this.string = string;
    }

    public String getValue() {
        return string;
    }

}
class EnumDemo{
    public static void main(String[] args) {
        WeekDay[] days = WeekDay.values();
        System.out.println(Arrays.toString(days));
        String s= "SUNDAY";
        System.out.println(WeekDay.valueOf(s).ordinal());
        System.out.println(WeekDay.FRIDAY.getValue()==WeekDay.FRIDAY.getValue());
    }

}

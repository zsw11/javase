package com.company.demo1_8;


import lombok.extern.slf4j.Slf4j;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author zsw
 * @date 2021/2/20 14:27
 * @description : date和calendar 并不是特别好用  jdk1.8 本地日期（LocalDate）、本地时间（LocalTime）、本地日期时间（LocalDateTime） 时间格式化（DateTimeFormatter）
 */
@Slf4j
public class TimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(); //获取当前日期时间
        int dayOfMonth = localDateTime.getDayOfMonth();
        int dayOfYear = localDateTime.getDayOfYear();
        int year = localDateTime.getYear();
        System.out.println(localDateTime);
        System.out.println(dayOfMonth);
        System.out.println(dayOfYear);
        System.out.println(year);
        // 自己设置时间
        LocalDateTime start = LocalDateTime.of(2021, 1, 20, 14, 57);
        System.out.println(start);
        LocalDateTime end = LocalDateTime.now();
       // Duration 计算时间间隔
        Duration between = Duration.between(start, end);
        long millis = between.toMillis();//获取时间间隔的毫秒
        System.out.println(between+" -- "+millis);
        //TemporalAdjusters
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nextMondayTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));//获取到下一个周一的日期，时分秒不变
        System.out.println("nextMondayTime"+nextMondayTime);
        //自定义时间矫正器，获取下一个工作日
        TemporalAdjuster adjuster = i -> {
            DayOfWeek dayOfWeek = ((LocalDateTime) i).getDayOfWeek();
            if (DayOfWeek.FRIDAY.equals(dayOfWeek)) return ((LocalDateTime) i).plusDays(3);
            else if (DayOfWeek.SATURDAY.equals(dayOfWeek)) return ((LocalDateTime) i).plusDays(2);
            else return ((LocalDateTime) i).plusDays(1);
        };
        // DateTimeFormatter 线程安全。 simpleDateFormat 线程不安全
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        // 把 字符串"2017 06 17" 转换成 日期格式
        LocalDate date = LocalDate.parse("2017 06 17", formatter);
        System.out.println(date);
        // 当前时间转换成字符串yyy MM dd格式
        LocalDate localDate = LocalDate.now();
        String format = localDate.format(formatter);
        System.out.println(format);
    }
}

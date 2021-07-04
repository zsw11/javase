package com.zsw_2020.ztyj01;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 54623
 * @date 2021/7/3 15:12
 * // 库位码排序
 * List<String> list=new ArrayList<>();
 * list.add("M04-002-001");
 * list.add("M3-602-001");
 * list.add("M104-003-001");
 * list.add("M103-002-11");
 * list.add("M18-002-001");
 * list.add("J01-002-001");
 * list.add("A101-052-001");
 * // output:
 * // A101-052-001
 * // J01-002-001
 * // M3-602-001
 * // M04-002-001
 * // M18-002-001
 * // M103-002-11
 * // M104-003-001
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("M04-002-001");
        list.add("M3-602-001");
        list.add("M104-003-001");
        list.add("M103-002-11");
        list.add("M18-002-001");
        list.add("J01-002-001");
        list.add("A101-052-001");
        Collections.sort(list, new MyCustomCompator());// 自定义比较器
//        List<String> collect = list.stream().sorted(Comparator.comparing(a -> a.toLowerCase().toCharArray()[0])).collect(Collectors.toList());
       for(String s: list){
           System.out.println(s);
       }
    }

}

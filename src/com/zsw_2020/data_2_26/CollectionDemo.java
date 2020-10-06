package com.zsw_2020.data_2_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Collections类提供了若干静态方法，大多对List操作
 */
public class CollectionDemo {
    /**
     * sort(),shuffle()
     */
    public static void sortDemo(){
        Integer[] num= {1,24,65,86,8,9,45,34,77};
        List<Integer> list = Arrays.asList(num);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);//重排次序
        System.out.println(list);
    }
    /**
     *查找
     */
    public static void binDemo(){
        List<Integer> list = Arrays.asList(3,6,7,2);
        Collections.sort(list);
        int key =4;
        int pos = Collections.binarySearch(list, key);
        if(pos<0){
            List<Integer> list1=new ArrayList<>(list);
            list1.add(-pos-1,key);//查不到4元素，就把4加入到新的list中，-pos-1为插入位置
            System.out.println(list1);
        }
    }

    /**
     * 对list对象的操作
     */
    public static void test(){
        Integer[] a ={1,2,3,4,5,6,7,8};
        List<Integer> list= new ArrayList<>(Arrays.asList(a));
        Collections.reverse(list);//反转list
        System.out.println(list);
        Collections.fill(list,8);//用指定的值覆盖原来的每一个值
        System.out.println("list="+list);
        List<Integer> list1= new ArrayList<>(Arrays.asList(a));
        list1.add(10);
        System.out.println("list1="+list1);
        Collections.copy(list1,list);
        System.out.println("list1="+list1);
        Collections.swap(list1,7,8);//将指定位置上的元素交换
        System.out.println("list1="+list1);
        Collections.addAll(list1,100,200,300);//用于将指定的多个元素添加到集合中
        System.out.println("list1="+list1);
        Integer min= Collections.min(list1);
        Integer max= Collections.max(list1);
        System.out.println("max="+max+"; min="+min);

    }
    public static void main(String[] args) {
//        sortDemo();
//        binDemo();
        test();
    }
}

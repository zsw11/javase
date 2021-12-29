package com.company.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class TestFiled {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String data = "{\"date\": \"2022-02-05\"}";
        User user = JSON.parseObject(data, User.class, new Feature[]{Feature.AllowISO8601DateFormat});
        test();
    }
   static Map<String,Object> map = new HashMap<String,Object>();
    
    public static void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        map.put("name","whc");
        map.put("sex","男");

        Class<?> classu = Class.forName("com.company.util.User");
        //得到user类的全部属性（修饰符+类型+名字）
        Field[] userFields = classu.getDeclaredFields();
        User user = new User();
        for (int i = 0; i <userFields.length ; i++) {
            // AccessibleTest类中的成员变量为private,故必须进行此操作
//            反射 不依赖 get set()方法
            // 取消属性的访问权限控制，即使private属性也可以进行访问。
            userFields[i].setAccessible(true);
            //遍历keyset
            for (String s : map.keySet()) {
                //如果有属性名和key相同
                if (userFields[i].getName().equals(s)){
                    // 将指定对象变量上(user) 此Field对象表示的字段设置为指定的新值。
                    userFields[i].set(user,map.get(s));
                }
            }
        }
        System.out.println(user);
    }
    
    public void test2() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        map.put("name","whc");
        map.put("sex","男");

        Class<?> classu = Class.forName("com.company.util.User");
        //得到user类的全部属性（修饰符+类型+名字）
        Field[] userFields = classu.getDeclaredFields();
        User user = (User) classu.newInstance();
        for (int i = 0; i <userFields.length ; i++) {//遍历keyset
            for (String s : map.keySet()) {
                //如果有属性名和key相同
                if (userFields[i].getName().equals(s)){
                    //调用user类中的set方法 注意set方法后面字母大写
                    Method method = classu.getMethod("set" + s.substring(0, 1).toUpperCase() + s.substring(1), String.class);
                    method.invoke(user,map.get(s));
                }
            }
        }
        System.out.println(user);
    }
}
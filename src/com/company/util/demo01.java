package com.company.util;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zsw
 * @date 2021/1/7 10:53
 * @description
 */
public class demo01 {
    public static void main(String[] args) {
//        beanTest();
        test();

    }
    public static void beanTest() throws BeansException {
        Student student = new Student();
        student.setId(1); // 字段类型不一样，也无法copy
        student.setAge(24);
        student.setName("zsw");
        student.setSex("nan");
        student.setCard("card");

        StudentVo studentVo = new StudentVo();
        BeanUtils.copyProperties(student, studentVo);
//        studentVo.setNum(new teacher("我是老师"));
//        studentVo.setName("ztyj");
//        student.setName("ztyj");
        System.out.println(student.toString()+"--------"+studentVo.toString());
    }

    public static void test() {
        String s = "erre,wwww";
        String s1 = s.substring(s.substring(0, s.indexOf(",")).length()+1);
        List<Integer> existedIds = Arrays.asList(1, 2, 3);
        List<Integer> validIds = Arrays.asList(1, 2, 3,4,5);
        List<Integer> finalValidIds = validIds;
        validIds = existedIds.stream().filter(a -> !finalValidIds.contains(a)).collect(Collectors.toList());
        System.out.println(validIds);
    }
}

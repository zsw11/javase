package com.company.util;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zsw
 * @date 2021/1/7 10:53
 * @description
 */
@Slf4j
public class demo01 {
    public static void main(String[] args) {
//        beanTest();
//        test();
        test2();

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
        System.out.println(s.substring(0, s.indexOf(",")));
        String s1 = s.substring(s.substring(0, s.indexOf(",")).length()+1);
        System.out.println(s1);
        List<Integer> existedIds = Arrays.asList(1, 2, 3);
        List<Integer> validIds = Arrays.asList(1, 2, 3,4,5);
        List<Integer> finalValidIds = validIds;
        validIds = existedIds.stream().filter(a -> !finalValidIds.contains(a)).collect(Collectors.toList());
        System.out.println(validIds);
    }

    public static void test2() {
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("zsw", 22, "a", 12, "id"));
//        students.add(new Student("zsw", 23, "a", 12, "id"));
//        students.add(new Student("zsw", 24, "a", 12, "id"));
//        Student refundInfo = students.stream().max(Comparator.comparing(Student::getAge)).get();
//        System.out.println(refundInfo);
        Student student = new Student();
        if (student.getAge() !=0 && student.getAge() != null) {
            log.info("1");
            return;
        }
        log.info(student.getName());

    }
}

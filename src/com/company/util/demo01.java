package com.company.util;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

/**
 * @author zsw
 * @date 2021/1/7 10:53
 * @description
 */
public class demo01 {
    public static void main(String[] args) {
        beanTest();

    }
    public static void beanTest() throws BeansException {
        Student student = new Student();
        student.setId(1);
        student.setAge(24);
        student.setName("zsw");
        student.setSex("nan");
        student.setCard("card");

        StudentVo studentVo = new StudentVo();
        BeanUtils.copyProperties(student, studentVo);
        studentVo.setNum(new teacher("我是老师"));
//        studentVo.setName("ztyj");
//        student.setName("ztyj");
        System.out.println(student.toString()+"--------"+studentVo.toString());
    }
}

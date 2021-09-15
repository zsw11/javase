package com.company.util;

/**
 * @author zsw
 * @date 2021/1/7 10:45
 * @description
 */

public class StudentVo {
    private String name;
    private Integer age;
    private String sex;
    private String id;
    // vo特有的
    private teacher num;

    public teacher getNum() {
        return num;
    }

    public void setNum(teacher num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentVo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                ", num='" + num + '\'' +
                '}';
    }
}

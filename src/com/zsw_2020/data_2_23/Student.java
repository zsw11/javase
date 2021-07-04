package com.zsw_2020.data_2_23;

/**
 * @author zsw
 * @date 2021/6/11 16:10
 * @description : clone 深浅拷贝
 */
public class Student implements Cloneable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class testClone{
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student("zsw",12);
        Student student2 = student1;
        student1.setAge(13);
        System.out.println(student1.toString()+"-------"+student2.toString()); // 浅拷贝
        Object student3 = student1.clone();
        student1.setAge(14);
        System.out.println(student1+"-------"+student3); // clone默认是浅拷贝，重写的是深拷贝
    }
}

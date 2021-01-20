package com.company.collection;

/**
 * @author zsw
 * @date 2021/1/4 10:17
 */
public class  Student {
    static int id;

    private String name;
    private int age;

    String card;

    @Override
    public String toString() {
        return "Student{" +
                " name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    public class Person {
//        public static int num;
//        public int number;
//        public String name;
//
//        public static void main(String[] args) {
//            Person p1 = new Person();
//            Person p2 = new Person();
//            p1.num = 2;
//            p2.num = 3;
//            p1.number = 4;
//            p2.number = 5;
//            p1.name = "张三";
//            p2.name = "李四";
//            System.out.println(p1.num);
//            System.out.println(p2.num);
//            System.out.println(p1.number);
//            System.out.println(p2.number);
//            System.out.println(p1.name);
//            System.out.println(p2.name);
//        }
//    }



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
}

package com.zsw_2020.ztyj01;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        Car baoMa = new Car();
        Person person = new Person();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        s1.score = 67;
        s1.name = "zhangsan";
        s2.score = 53;
        s2.name = "lisi";
        s3.score = 78;
        s3.name = "sss";
        s4.score = 88;
        s4.name = "zsan";
        s5.score = 96;
        s5.name = "aan";
        Student[] arr = {s1, s2, s3, s4, s5};
        sort(arr);
    }


    public static void sort(Student[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j].score > a[j + 1].score) {
                    double temp = a[j].score;
                    a[j].score = a[j + 1].score;
                    a[j + 1].score = temp;

                }
            }

        }
        int count =1;
        for ( Student s : a){
            System.out.println(s.toString(count++));

        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i].name + a[i].score);
//
//        }


    }

}

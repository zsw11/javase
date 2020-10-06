package com.zsw_2020.data_2_23;

/**
 * 构造方法调用过程：在创建一个类的实例会沿着继承链调用所有超类的构造方法
 *
 */
class Person{
    String name;

    public  Person(){}

    public Person(String name) {
        this.name = name;
        System.out.println("create a Person object");
    }
}
class Employee extends Person{
    double salary;

    public Employee() {
       this(null,0.0);
       System.out.println("create  an employee object");
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}

class Manager extends Employee{
    String title;

    public Manager() {
        System.out.println("create a Manager Object");
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
    }
}

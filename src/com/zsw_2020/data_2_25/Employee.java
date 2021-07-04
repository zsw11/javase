package com.zsw_2020.data_2_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * 对象序列，对象实现Comparable接口，重写compareTo方法
 */
public class Employee implements Comparable<Employee>{
    public String name;
    public int age;
    public double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.age-o.age;//通过年龄排序
    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0]= new Employee("zsw",12,3.4);
        employees[1]= new Employee("ztyj",11,3.5);
        employees[2]= new Employee("zswztyj",15,6.4);
//        ArrayList<Employee> employeeArrayList = new ArrayList<>();
//        employeeArrayList.add(new Employee("zsw22",34,6.8));
        TreeSet<Employee> empList = new TreeSet<>(Arrays.asList(employees));
//        ArrayList<Employee> arrayList = new ArrayList<>(Arrays.asList(employees));
//        System.out.println(arrayList);
        System.out.println(empList);//年龄排序
    }
}

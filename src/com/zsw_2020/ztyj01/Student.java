package com.zsw_2020.ztyj01;

public class Student implements Comparable{
    String name;
    int no;
    double score;

    /*public String toString(Student[] student) {
        for(int i=0;i<student.length;i++){
            return i+":"+student[i]+
                    "score=" + this.score +
                    '}';
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }*/

    public String toString(int count) {
        return "Student"+count+"{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

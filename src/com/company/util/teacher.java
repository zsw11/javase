package com.company.util;

/**
 * @author zsw
 * @date 2021/1/8 10:15
 * @description
 */
public class teacher {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}

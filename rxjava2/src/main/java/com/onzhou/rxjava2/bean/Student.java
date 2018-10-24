package com.onzhou.rxjava2.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class Student {

    public int age;

    public String name;

    public List<Integer> courses;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getCourses() {
        return courses;
    }

    public void setCourses(List<Integer> courses) {
        this.courses = courses;
    }

    public static List<Student> create() {
        List<Student> students = new ArrayList<>();
        Student student;
        for (int i = 0; i < 5; i++) {
            student = new Student();
            student.setAge(i);
            student.setName("name " + i);
            student.setCourses(Arrays.asList(1, 2, 3));
            students.add(student);
        }
        return students;
    }

}

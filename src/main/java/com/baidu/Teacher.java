package com.baidu;

/**
 * Created by xxf123 on 2020/4/22.
 */
public class Teacher {
    private double salary;

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}';
    }
}

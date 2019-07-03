package com.chryl.controller.test;

/**
 * Created By Chr on 2019/7/3.
 */
public class Child extends Human {

    private String schoolName;

    public Child(String schoolName) {
        this.schoolName = schoolName;
    }

    public Child(String name, Integer age, String schoolName) {
        super(name);
//        super(age);
        this.schoolName = schoolName;
    }

    @Override
    public void walk() {
        System.out.println(" i want walk");
    }

    public static void main(String args[]) {
        Child child = new Child("aa", 23, "清华");
        System.out.println(child);
        child.walk();
    }
}

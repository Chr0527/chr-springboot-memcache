package com.chryl.controller.test;

/**
 * Created By Chr on 2019/7/3.
 */
public abstract class Human {

    private String name;
    private Integer age;


    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public abstract void walk();
}

package com.chryl.controller.test;

/**
 * Created By Chr on 2019/7/3.
 */
public class Student {
    private String name;
    private String no;
    private Integer age;

    public Student(String name, String no, Integer age) throws MyException {
        if (no.length() == 11) {
            this.name = name;
            this.no = no;
            this.age = age;
        } else {
            throw new MyException("输入的学号必须为11位");
        }
    }

    public static void main(String args[]) throws MyException {
        Student ak47 = new Student("ak47", "11111111111", 121);
        System.out.println(ak47);
        System.out.println("---------------");
        Student ak48 = new Student("ak48", "011", 12);
        System.out.println(ak48);

    }
    public class MyException extends Throwable {

        public MyException(String message){
            super(message);
        }
    }
}

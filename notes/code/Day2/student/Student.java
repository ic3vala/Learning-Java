package com.lyh.method.student;

public class Student {
    private String id;
    private String name;
    private int age;


    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("学号：" + id);
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("----------------");
    }

    public String getId() {
        return id;
    }
}

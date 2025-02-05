package com.lyh.method.student;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentManager {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent(){
        System.out.println("请输入学号：");
        String id = scanner.nextLine();
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(id, name, age);
        students.add(student);
        System.out.println("添加成功！");
    }

    public void showAllStudents(){
        if (students.isEmpty()){
            System.out.println("暂无学生信息！");
            return;
        }
        for (Student student : students){
            student.displayInfo();
        }
    }

    public void findStudentById(){
        System.out.print("请输入要查找的学号：");
        String targetId = scanner.nextLine();
    }
}

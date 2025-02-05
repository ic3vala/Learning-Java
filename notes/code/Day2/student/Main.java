package com.lyh.method.student;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== 学生管理系统 ===");
            System.out.println("1. 添加学生");
            System.out.println("2. 显示所有学生");
            System.out.println("3. 查找学生");
            System.out.println("0. 退出");
            System.out.print("请输入选项: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // 吸收换行符

            switch (choice) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.showAllStudents();
                    break;
                case 3:
                    manager.findStudentById();
                    break;
                case 0:
                    System.out.println("感谢使用！");
                    break;
                default:
                    System.out.println("无效选项！");
            }
        } while (choice != 0);
    }
}
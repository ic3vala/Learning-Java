package com.lyh.method.mathutils;

public class MathUtils {
    // 1. 编写一个方法，计算两个整数的和
    public static int add(int a, int b) {
        // 实现代码
        return a + b;
    }

    // 2. 重载add方法，支持三个整数相加
    public static int add(int a, int b, int c) {
        // 实现代码
        return a + b + c;
    }

    // 3. 编写递归方法计算阶乘（n!）
    public static int factorial(int n) {
        // 基线条件：n=0或1时返回1
        // 递归条件：n * factorial(n-1)
        if(n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
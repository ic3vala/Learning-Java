package com.lyh.method.mathutils;

public class Main {
    public static void main(String[] args) {
        // 测试add方法
        System.out.println("2 + 3 = " + MathUtils.add(2, 3));
        System.out.println("2 + 3 + 4 = " + MathUtils.add(2, 3, 4));

        // 测试阶乘方法
        System.out.println("5! = " + MathUtils.factorial(5));
    }
}
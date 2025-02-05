## Day 2: Java方法与简单学生管理系统
### 学习内容
1.流程控制
- `java.util.Sanner`
```java
Scanner s = new Scanner(System.in)
```
- 顺序结构 -> 选择结构 -> 循环结构 
- `for`循环和`if`语句等
- `System.out.println`输出一行，`System.out.print`不换行
---
2.方法 `Method`
- 方法的定义与调用|  一个方法只做一个功能 （类似C语言里的函数）
- 调用方法： 对象名.方法名（实参列表）
- 方法重载 `Overload` 参数列表必须不同（个数、类型、参数排列顺序不同等）方法返回类型可以相同可以不相同
- 命令行传参、可变参数（int...i）
```java
public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.test(1, 2);
    }
    public void test(int...i){
        System.out.println(i[0]);
        System.out.println(i[1]);
    }
}
```
- 递归结构：
  - 递归头：了解什么时候不调用自身方法，如果没有头，将陷入死循环
  - 递归体：了解什么时候需要调用自身方法
- 面向对象基础（类、对象）
---
### 代码练习
- [ScannerText.java](./code/Day2/ScannerText.java)
- [九九乘法表](./code/Day2/ForDemo.java)
- [打印三角形](./code/Day2/Triangle.java)
- [四则运算](./code/Day2/Operation.java)

- [StudentManager简单学生管理系统](./code/Day2/student)
#### **管理结构**
```
student/
├── Student.java
├── StudentManager.java
└── Main.java
```

---
### 遇到的问题
- 如何在方法中正确传递参数？

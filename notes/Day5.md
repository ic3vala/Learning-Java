## Day 5: Java面向对象进阶
### 学习内容
- `继承 Inheritance`：`Dog`和`Cat`继承`Animal`
- `多态 Polymorphism`：重写`eat()`方法
- `封装 Encapsulation`：私有属性 + `getter/setter`
---


#### 封装
- **高内聚，低耦合**
- 属性私有，`get/set`
  - 通过set设置，通过get获取
  - 提高程序安全性，保护数据，隐藏代码实现细节
```java
public class Student {

    //属性私有
    private String name;
    private int id;
    private char sex;

    //提供一些可以操作这个属性的方法
    //提供一些public的get、set方法

    //get 获得这个数据
    public String getName() {
        return this.name;
    }

    //set 给这个数据设置值
    public void setName(String name) {
        this.name = name;
    }

}
```



#### 继承
- `extends` 扩展
- 所有类默认继承`Object`类
- `super` 调用父类方法
  - `super();` //调用父类的构造器必须在子类构造器第一行
  - 必须只能出现在子类的方法或构造方法中
  - `super`和`this`不能同时调用构造方法！
- `this`:
  - 代表的对象不同：
    - `this`: 本身调用这个对象
    - `super`: 代表父类对象的应用
  - 前提
    - `this`: 没有继承也可使用
    - `super`: 只能在继承条件才可以使用
  - 构造方法
    - `this()` : 本类的构造
    - `super()` : 父类的构造

- **方法重写**
  - `静态方法`是`类`的方法，`非静态`是`对象`的方法
  - 需要继承关系，子类重写父类方法
    1. 方法名必须相同
    2. 参数列表必须相同
    3. 修饰符：`范围`可以`扩大`但不能`缩小`：public > protected > default > private
    4. 抛出的异常：`范围`可以被`缩小`但不能`扩大`：ClassNotFoundException --> Exception(大)

  - 子类方法与父类必须一致，方法体不同



#### 多态

- 父类型能指向子类但不能调用子类独有的方法
- `多态`是`方法`的`多态`，`属性`没有`多态`
- 父类和子类有联系 类型转换异常！ `ClassCastException`
- 存在条件：继承关系，方法需要重写，父类引用指向子类对象！father f1 = new Son();
  -`static`方法属于类，不属于实例
  - `final`常量
  - `private`方法

**instanceof(类型转换)**
- 测试它左边的对象是否是它右边的类的实例，返回 boolean 的数据类型

```java
Object object = new Student();
System.out.printIn(object instanceof Teacher); // False
```
---
### 代码练习
- [Animal.java](./code/Day5/Animal.java)
- [Dog.java](./code/Day5/Dog.java)
- [Cat.java](./code/Day5/Cat.java)
- [Main.java](./code/Day5/Main.java)
---
### 遇到的问题
- 向下转型时如何避免类型转换异常？
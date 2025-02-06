## Day 3: 数组与基础应用
### 学习内容
- `数组`的定义与初始化
  - 声明：
    - `int[ ] nums;` `//首选`
    - `int nums[ ];`
    - `nums = new nums[10];`
  - 获取数组长度：`array.lenth`
  ```java
  int[] a = new int[2];
  a[0] = 1;
  a[1] = 2;
  ```
--- 
  - `数组`创建后大小不能改变，`数组对象`本身在`堆`中 
  - `For-Each`循环 
```java
    for (int array : arrays) {
        System.out.printIn(array);
    }
```

- `数组`遍历与常见操作（增删改查）

---

#### Array类 
- `Arrays.toString` 打印数组元素
- `Arrays.sort(a);` 数组 **升序** 排序
- `Arrays.fill(a, 0);` 填充数组 （用0覆盖）

#### 八大排序之 **冒泡排序**
- 时间复杂度 `O(n)`
- 两层循环，外层冒泡轮数，里层依次比较

#### 稀疏数组 `Sparse Array`
- 一个数组中大部分元素为0时或为同一值时，使用稀疏数组来保存该数组

### 代码练习
- [数组基本使用 ArrayDemo.java](./code/Day3/ArrayDemo.java)
- [ArrayDemo1.java](./code/Day3/ArrayDemo1.java)
- [ArrayDemo2.java](./code/Day3/ArrayDemo2.java)
- [MaoPao.java](./code/Day3/MaoPao.java)
- [SparsrArray.java](./code/Day3/SparseArray.java)
- [GradeManager.java](./code/Day3/GradeManager.java)
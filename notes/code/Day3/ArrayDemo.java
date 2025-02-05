public class ArrayDemo {
    public static void main(String[] args) {
        //dataType[] arrayRefVar = new dataType[arraySize];

        int[] nums; //2.声明一个数组
        nums = new int[10]; //3.创建一个数组

        //3.给数组元素赋值
        for (int i = 0; i < 10; i++) {
            nums[i] = i+1;
        }

        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("总和为："+sum);
    }
}

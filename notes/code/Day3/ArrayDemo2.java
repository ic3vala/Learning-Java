import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,9090,31231,543,21,3,23};

        System.out.println(a); // [I@4f3f5b24
        //打印数组元素
        System.out.println(Arrays.toString(a));
        printArray(a);
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                System.out.print("[");
            }
            if(i==a.length-1){
                System.out.print(a[i]+"]");
            }else {
                System.out.print(a[i]+", ");
            }
            //System.out.print(a[i] + " ");
        }
    }
}

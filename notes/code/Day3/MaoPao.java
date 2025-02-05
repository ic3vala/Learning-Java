import java.util.Arrays;

public class MaoPao
{
    public static void main(String[] args)
    {
        int[] a = {1,4,5,6,72,2,2,2,25,6,7};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }

    /*冒泡排序
    1.比较数组中，两个相邻的元素，如果第一个数比第二个数大，交换他们的位置
    2.每次比较，都会产生一个最大或最小的数字；
    3.下一轮则可少一次排序
    4.依次循环至结束！     */

    public static int[] sort(int[] array){
        int temp = 0;
        //外层，判断这个要走多少次；
        for(int i=0; i<array.length-1; i++){
            //内层循环，比较判断两数，如果第一个数比第二个大，则交换位置
            for(int j=0; j<array.length-1-i; j++){
                if(array[j+1]<array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}

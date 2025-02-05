import java.util.Scanner;

public class ScannerText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        //计算输入了多少字

        int m = 0;

        //通过循环判断是否还有输入，并在里面对每次进行求和统计
        while(scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m = m + 1;//m++
            sum = sum + x;
            System.out.println("你输入了第"+m+"个数据，然后当前结果smu=" + sum);

        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值为" + (sum / m));

        scanner.close();
    }
}

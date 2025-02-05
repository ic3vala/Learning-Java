import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入四则运算左式: (如 1 + 2)");
        double a = sc.nextDouble();
        String op = sc.next();
        double b = sc.nextDouble();
        double ret = 0;
        switch (op) {
            case "+":
                ret = sum(a, b);
                break;
                case "-":
                    ret = sub(a, b);
                    break;
                    case "*":
                        ret = mul(a, b);
                        break;
                        case "/":
                            ret = div(a, b);
                            break;
                            default:
                                System.out.println("输入有误！");
                                return;
        }
        System.out.println("结果为：" + a +" "+ op+" " + b + " = " + ret);
        sc.close();
    }

    public static double sum(double a, double b){
        return a+b;
    }

    public static double sub(double a, double b){
        return a-b;
    }
    public static double mul(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        return a/b;
    }
}

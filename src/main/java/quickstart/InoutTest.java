package quickstart;

import java.util.Scanner;

public class InoutTest {
    public static void main(String[] args) {
        double d = 3.1415926;
        //输出
        System.out.printf("%.2f\n", d);
        //输入
        Scanner scanner = new Scanner(System.in); //创建Scanner对象
        System.out.println("input your name:");
        String name = scanner.nextLine(); //读取一行输入并获取字符串
        System.out.println("input your age");
        int age = scanner.nextInt(); //读取一行并获取整数
        System.out.printf("Hi, %s , your are %d\n", name, age); //格式化输出

        System.out.println("输入上一次成绩：");
        int grade1 = scanner.nextInt();
        System.out.println("输入本次成绩：");
        int grade2 = scanner.nextInt();
        float dev = (float) (grade2 - grade1) / grade1 * 100;
        System.out.printf("成绩提高了%.2f%%\n", dev);


    }
}

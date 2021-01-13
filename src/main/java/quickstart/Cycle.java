package quickstart;

public class Cycle {
    public static void main(String[] args) {
        //switch循环
        int option = 3;
        //switch不要忘记break和default
        //switch的计算结果必须是整型、字符串或枚举类型；
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }

        //while循环
        int sum = 0;
        int n = 0;
        while (n <= 100) { //先判断循环条件，再循环
            n ++;
            sum = sum + n;
        }
        System.out.println(sum);

        //do-while循环
        do {
            sum = sum + n;
            n ++;
        } while (n <= 200);
        System.out.println(sum);

        //for循环
        //break跳出循环
        //continue跳出当前循环，继续执行下一次循环
    }
}

package quickstart;

public class Calculation {
    public void intCalculate() {
        //除数为0运行时报错，编译不会报错。
        int x = 12345 / 67;
        //模余
        int y = 12345 % 67;
        //整型存在范围限制，会溢出，溢出不会出错，但会得到一个奇怪的结果。
        int z = 2147483640;
        int v = 10;
        int sum = z + v;
        System.out.println("int:"+sum);
    }


    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.intCalculate();
    }
}

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
        System.out.println("int:" + sum);
        int n = 7;       // 00000000 00000000 00000000 00000111 = 7
        int a = n << 1;  // 00000000 00000000 00000000 00001110 = 14
        int b = n << 2;  // 00000000 00000000 00000000 00011100 = 28
        int c = n << 28; // 01110000 00000000 00000000 00000000 = 1879048192
        //左移29位时，由于最高位变成1，因此结果变成了负数。
        int d = n << 29; // 11100000 00000000 00000000 00000000 = -536870912
        /*位运算：与、或、非、异或
        与运算：同为 1，则为 1；
        或运算：任意一个为 1,结果为 1；
        非运算：0 1 互换；
        异或：不同为 1 相同为 0；
         */
        //强制转型
        int i = 12345;
        short s = (short) i;
        /*
        - 整数运算结果永远是精确的；
        - 运算结果会自动提升；
        - 可以强制转型，但超出范围的强制转型会得到错误的结果；
        - 应该选择合适范围的整型，没有必要为了节省内存而使用 byte 和 short 进行整数运算。
         */
    }


    public void floatCalculate() {
        //浮点数常常无法精确表示！！
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        System.out.println(x);
        System.out.println(y);
        //如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型
        //可以将浮点数强制转型为整数。在转型时，浮点数的小数部分会被丢掉。如果转型后超过了整型能表示的最大范围，将返回整型的最大值。
        /*
        - 浮点数常常无法精确表示，并且浮点数的运算结果可能有误差；
        - 比较两个浮点数通常比较它们的绝对值之差是否小于一个特定值；
        - 整型和浮点型运算时，整型会自动提升为浮点型；
        - 可以将浮点型强制转为整型，但超出范围后将始终返回整型的最大值。
         */
    }


    public void booleanCalculate() {
        /*
        布尔运算的关系运算符优先级：
        - ！
        - > >= < <=
        - == !=
        - &&
        - ||
         */
        //短路运算：如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果。
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);

        //三元运算符:true 返回第一个值，否则返回第二个
        int n = -100;
        int x =  n > 0 ? n : -n;
        System.out.println(x);

    }


    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.intCalculate();
        calculation.floatCalculate();
    }
}

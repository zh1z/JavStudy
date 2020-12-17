package quickstart;

public class Variable {

    /*
    ++n表示先加1再引用n
    n++表示先引用n再加1
    具体看下面方法
     */
    public void add() {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 100; i++) {
            sum1 = sum1++;
            sum2 = ++sum2;
        }
        System.out.println("n1:" + sum1 + ",n2:" + sum2);

    }

    public static void main(String[] args) {
        int x = 100;
        //等号乃赋值语句
        x = x + 100;
        Variable v = new Variable();
        v.add();
    }
}
/* 变量类型分为基本类型和引用类型
基本数据类型：8种
    整数类型：byte, short, int, long
    浮点数类型：float, double
    字符类型：char
    布尔类型：boolean
 */

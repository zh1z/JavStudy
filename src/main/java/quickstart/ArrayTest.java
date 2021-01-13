package quickstart;

import java.util.Arrays;

public class ArrayTest {
    public void arraysTest(){
        //数组定义
        /*
        数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false;
        数组一旦创建后，大小就不可改变。
        数组元素可以是值类型或引用类型，但数组本身是引用类型。
         */
        int[] ns = new int[5];
        int[] nx = new int[] {1,3};
        int[] nc = {1,2,3};
        /*
        遍历数组有两种方式：for循环和foreach
         */
        //打印数组
        System.out.println(nx);//得到的是数组在JVM中的引用地址
        System.out.println(Arrays.toString(nx));
        //数组排序
        Arrays.sort(nc);

        //二维数组
        int[][] tArray = {
                {12,3,4},
                {1,4,8},
                {5,2,1}
        };
        //打印二维数组
        //1. 双层嵌套循环
        //2.Arrays.deepToString()

    }

    public static void main(String[] args) {
        /*
        main方法接受一个命令行参数，它是一个String数组
        命令行参数由JVM接收用户输入并传给main方法；
        如何解析命令行参数需要由程序自己实现。
         */

    }
}

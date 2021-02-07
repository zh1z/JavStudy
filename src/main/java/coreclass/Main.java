package coreclass;

public class Main {
    public static void main(String[] args) {
        //String
        String s1 = "hello!"; //字符串在String内部是通过一个char[]数组表示的。
        String s2 = new String(new char[]{'H','e','l','l','o'});
        //java编译器在编译期，会自动把所有相同的字符串当做一个对象放入常量池。
        //两个字符串比较，必须总是使用equals()方法
        s1.contains("ll"); //true
        s1.indexOf("l"); //2
        s1.lastIndexOf("l");//3
        s1.startsWith("He");//true
        s1.endsWith("lo");//true
        s1.substring(2);//llo
        //去除首尾空白字符
        " \tHello\r\n".trim(); //Hello
        //替换子串
        s2.replace('l','w');//hewwo
        //分割字符串
        String s = "A,B,C,D";
        String[] ss = s.split("\\,"); //{"A","B","C","D"}
        //拼接字符串
        String[] arr = {"A","B","C"};
        String sss = String.join("&&&",arr); // "A&&&B&&&C"

    }
}

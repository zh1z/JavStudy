package quickstart;

public class StrTest {
    public void charTest(){
        //一个char保存一个Unicode字符
        char c1 = 'A';
        char c2 = '中';
        int n1 = 'A'; // 字母“A”的Unicode编码是65
        int n2 = '中'; // 汉字“中”的Unicode编码是20013
        System.out.println(n1+n2);
    }

    public void StriTest(){
        //转义字符
        String s = "abc\"xyz"; //包含7个字符
        String s1 = "abc\\xyz";
        /*
        常见转义字符：
        - \" 表示字符 “
        - \' 表示字符 '
        - \\ 表示字符 \
        - \n 表示换行符
        - \r 表示回车符
        - \t 表示Tab
        - \\u #### 表示一个Unicode编码的字符
         */
        String ss = "ABC\n\u4e2d\u6587";
        System.out.println(ss);
        //如果使用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接。
    }


    public static void main(String[] args) {
        StrTest strTest = new StrTest();
        strTest.StriTest();
    }
}

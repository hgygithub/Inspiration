package day05;

/**
  双引号包裹 的是字符串    单引号的是字符 char
 String 可义和8种 基本数据类型做运算   byte short int long  float double  布尔值 char
 只能做连接运算 + String 承接运算结果

 */

public class StringTest {


    public static void main(String[] args){

        String s = "11a";
        String s1 = "";
//        char c = '';  编译不通过
        System.out.println(s);

        int i = 10;
        boolean b = false;
        System.out.println(s + i + b);



    }
}

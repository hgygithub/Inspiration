package day03;

/*
 8种基本数据类型 ： 数值型（整数，浮点）  布尔型(true false)  字符型char
 引用数据类型 class字符串   interface  数组[]array
 */

public class VariableTest {

    public static void main(String[] arg) {
//    整数类型 内存从小到大排列
//     1个字节   范围-128~127 超出范围编译不通过
        byte a = 127;
//      byte a1 = 128;

        short b = 2; // 2个字节
        int age = 322; //4 个字节

//      long 必须要以"l","L" 结尾
        long c = 422L; //8个字节
        System.out.println(c);

//    浮点型  java 默认是double类型 , float 必须以F，f 结尾 否则编译不通过
//      float比long 得数值范围大
        float d = 1.10f;   //单精度 4个字节
        double f = 1.1d;   //双精度 8个字节

//    字符型 只能写一个字符 或一个转义字符 或 一个unicode 单引号包裹''
        char A ='A';
//        char q ='ac'; 超过一个字符编译不通过
        char u = '\u0041';
        System.out.println(u);
    }
}
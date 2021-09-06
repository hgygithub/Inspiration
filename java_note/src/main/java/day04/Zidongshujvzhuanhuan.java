package day04;

/**
 * 自动转换
 * 容量小的数据类型和容量大的数据类型做运算时  ，自动提升为容量大的数据类型 （容量是指承接数值的范围）
 * byte  short int long float double 从小到大
 *
 * byte short char 3者之间做运算 结果是int 类型
 */

public class Zidongshujvzhuanhuan {

    public static void main(String[] arg){

        byte a1 = 1;
        int a2 = 200;
//      编译不通过  只能用大范围的去接受
//        byte v = a1 + a2;
//        浮点数接受自动补充.0
        float c = a1 +a2;
        System.out.print(c);

        short s1 = 1;
        double d1 =s1;
        System.out.print(d1);

        char c2 = 'a';
        short s2= 2;
        byte b5 = 5;
//        编译不通过
//        byte short char 3者之间做运算 结果是int 类型 否则就编译不通过
//        char sum =c2 +b5;
//        System.out.print(sum);

//        byte b =b5 + a1;



    }
}

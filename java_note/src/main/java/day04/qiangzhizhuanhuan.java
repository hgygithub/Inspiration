package day04;

/**
 * 强制转换
 *
 * ···强制转换 变量前声明转换的数据类型  强转符()
 *
 *
 */

public class qiangzhizhuanhuan {

    public static void  main(String[] a){

        double d1 =17.9;
        double d2 =17.1;
/*        截断 1. 不会四舍五入的,2. 可能导致损失精度
          强制转换 变量前声明转换的数据类型
 */
        int i = (int) d1;
        int i1 = (int) d2;
        System.out.println(i);
        System.out.println(i1);

        long L1 = 111;
        short s2 = (short)L1;
//        没有精度损失

        int c1 = 1200;
        byte bb =(byte)c1;
        System.out.println(bb); //-128

        /*
        特殊情况
         */
        long ll = 1234;  //默认是int 转换换为long，如果数值过大就要加L 否则就会编译不通过  比如
        //long l2 =999999999;
        System.out.println(ll);

        /*
        浮点数默认是double。  float 不带f是不行的会编译失败的   float 比double的范围小
         */
//        float ff = 11.1;
        float f1 = 11.2f;

        //整型常量是： int
        byte b2 = 1;
//        byte b1 = b2 +1; 编译不通过
        int ii = b2 +1;
        System.out.println(ii);

//        float ff1 =f1 + 1.1; 编译不通过
        double ff1 =f1 + 1.1;
        System.out.println(ff1);

    }
}

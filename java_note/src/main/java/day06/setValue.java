package day06;

/**
 * 赋值运算符   --》不会改变数据类型
 * += -= /= *= %=
 */


public class setValue {

    public static void main(String[] args) {
//        赋值符号 =   不会改变数据类型
        int i1 = 100;
//        连续赋值
        int a1 ,b1 ;
        a1 = b1= 100;

        int c1 =11,z1 =12;
        System.out.println(a1);
        System.out.println(b1);

        a1 +=3;
        System.out.println(a1);
        c1 -=3;
        System.out.println(c1);
        c1 *= 3;
        System.out.println(c1);
        c1 /=3;
        System.out.println(c1);
        c1 %=3;
        System.out.println(c1);


//        练习
        int v= 4;
        int m =10;
        m *= v++;
        System.out.println("v= " + v);
        System.out.println("m= " + m);


    }
}

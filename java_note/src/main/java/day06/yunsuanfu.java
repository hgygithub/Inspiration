package day06;

/*
运算符
+  -   * /
% 取余
++
--

自增是不会改变的数据类型的
 */

public class yunsuanfu {

    public static void main(String[] args) {
        // 除法 /
        int i1 = -30;
        int i2 = 7;
        int res = i1 / i2;
        System.out.println(res);

        double res1 = i1 / i2 + 0.0;
        //括号内先运算
        double res2 = i1 / (i2+0.0);

        double res3 = i1 / (double)i2;
        System.out.println(res2);

        //%取余   结果是与被模数符号相同


        int re = i1 % i2;
        System.out.println("@@@@@3######res:"+re);


        // ++
        int a1 =2 ;
        //++ 在后   先赋值 后运算
        int b1 =a1++ ;
        System.out.println("a1="+a1+",b1="+b1);
        int c1  =10;
        // ++ 在前 先运算在赋值
        int c2 =++c1 ;
        System.out.println("c1=:"+c1+"c1="+c1);

        int s1 = 10;
        int s2 = ++s1;
        System.out.println("s2="+s2);

        int s3 = 30;
        int s4 = --s3;
        int s0 = 10;
        int s5 = --s0;

        System.out.println("s4="+s4);
        System.out.println("s5="+s5 );







    }
}

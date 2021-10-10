package day06;

/**
 * 三元运算符
 * 格式   （条件）？表达式1  ： 表达试2
 * 条件是Boolean类型： 如果为true执行1  否则执行2
 * 表达式的申明的要求必须要一样
 *--------------------------------------
 * 三元运算可以进行嵌套
 *
 * --------------------------------------
 * 凡是使用三元运算符的地方 都可以改用if else  反之不成立
 *
 */



public class SanYuan {

    public static void main(String[] args) {
        //获取较大的数
        int a = 1;
        int b = 20;
        int max = (a>b)? a : b;
        System.out.println(max);


//        (a>b)? 'a' : "b";   不统一编译不通过
        int c = -1;
        //三元嵌套
        String maxStr = (a>c)? "a大" : "c大";
        String maxStr1 = (a>c)? "a大" : (a==c)? "ac相等" : "c大";

        System.out.println(maxStr);
        System.out.println(maxStr1);

        //获取3个数的最大值
        String maxStr2 = (a>b)? ((a>c)?"a 最大" :  "c zuida ") :" b 大 " ;
        System.out.println(maxStr2);

        //if - else

        if (a>b){
            System.out.println(a);

        }else {
            System.out.println(b);

        }


    }
}

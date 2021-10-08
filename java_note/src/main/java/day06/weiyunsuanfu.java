package day06;

/**
 *

 * 位运算符
 *都是整型的数据
 * >> 在一定的范围内，移动1位就是乘以2的   拿0来补位
 *<<  移动1位就是除以2的 最高位是啥就拿啥补  最高位是1就用1补  最高位时0 就用0补
 *
 * >>> 无符号右移 五十最高位的值 统一用0补位
 *
 * ^ 异或  1 0 是1    连不一样就就为true
 * |   0 0 就是0
 * &   1 1 就是1
 *
 * ~  取反  就是0变1 1变0  2进制运算
 */



public class weiyunsuanfu {

    public static void main(String[] args) {

        //移动n位就是乘以2的n次方
        int f = 11;
        System.out.println(f<<8);

        int a = 2;
        System.out.println("&" +(f & a));
        System.out.println("|" +(f | a));
        System.out.println("^" +(f ^ a));

        //异或
        System.out.println((a^f)^a);

    }
}
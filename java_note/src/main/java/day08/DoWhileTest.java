package day08;

import java.util.Scanner;

/**
 * do-while 结构
 *1. 初始化条件
 *2. 循环条件
 *3.循环体
 *4.迭代条件
 * 1
 * do{
 *  3
 *  4
 * }while（2）
 *
 * 执行过程  1 -3-4-2-3-4-2.
 *
 * do-while 循环至少执行一次循环体\
 *
 *
 *
 *
 */


public class DoWhileTest {
    public static void main(String[] args) {
        //遍历100以内的偶数
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 100);


        //从键盘上输入任意数字。计算正数和复数的个数，输入0结束‘；
        Scanner scanner = new Scanner(System.in);
        int z = 0;
        int f = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > 0) {
                z++;
            } else if (num < 0) {
                f++;
            }
        }
        System.out.println("正数：" + z);
        System.out.println("负数：" + f);
    }
}

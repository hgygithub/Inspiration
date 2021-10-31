package day08;

/**
 *1. 初始化条件
 * 2. 循环条件
 * 3.循环体
 * 4.迭代条件
 *
 *
 * 1
 * while（2）{
 * 3
 * 4
 * }
 *
 * 一定要记住写迭代条件 ，防止进入死循环
 * for & while 是可以相互转换的
 */


public class whileTest {

    public static void main(String[] args) {

        int i = 1;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
            System.out.println(i);
        }
    }
}





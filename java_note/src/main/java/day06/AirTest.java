package day06;

/**
 * 打印一个三位数的 个位 百位 十位
 */

public class AirTest {

    public static void main(String[] args) {
        int number= 321;
        int baiwei = number / 100;
        int shiwei = number % 100 /10;
        int gewei = number % 100 % 10;


        System.out.println("百位是：" + baiwei);
        System.out.println("十位是：" + shiwei);
        System.out.println("个位是：" + gewei);

    }
}

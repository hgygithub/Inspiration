package day07;

import java.util.Scanner;

/**
 * 如果 switch-case 结构中有多个相同的执行语句可以考虑合并
 *
 * 凡是可以用switch case  都可转换为if - else 反之 不行
 * 当switch-case（case的取值情况不多） 和if -else 都可以使用的时候，优先使用switch-case
 */

public class SwithTest1 {

    public static void main(String[] a) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入任意一个字母：");
        String s = scanner.next();
        char c = s.charAt(0);
        switch (c) {
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            default:
                System.out.println("other");
        }

        //判断季节
        System.out.println("输入你的出生月份");
        int i = scanner.nextInt();
        switch (i) {
            case 0:
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬");
                break;
        }


        //输入一个日期计算出是这一年年的第几天
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int sumD =0;
//        int day = 20;
        switch (month){

            case 12:
                sumD += 30;
            case 11:
                sumD += 31;
            case 10:
                sumD += 30;
            case 9:
                sumD += 31;
            case 8:
                sumD += 31;
            case 7:
                sumD += 30;
            case 6:
                sumD += 31;
            case 5:
                sumD += 30;
            case 4:
                sumD += 30;
            case 3:
                if ((year %4== 0 && year % 100 !=0) ||year % 400==0){

                    sumD += 28;
                }else {
                    sumD += 29;
                }
            case 2:
                sumD += 31;
            case 1:
                sumD += day;

        }
        System.out.println((sumD)+ "天");
    }

}

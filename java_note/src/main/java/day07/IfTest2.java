package day07;

import java.util.Scanner;

public class IfTest2 {

    public static void main(String[] args) {

        System.out.println("输入第一个数字");
        Scanner sca = new Scanner(System.in);
        int num1 = sca.nextInt();
        System.out.println("输入第二个数字");
        int num2 = sca.nextInt();

        System.out.println("输入第三个数字");
        int num3 = sca.nextInt();

        if (num1 > num2){
            if (num3>num1){
                System.out.println("num3大 2  1");

            }else if (num3<num2){
                System.out.println("1da  2  3");
            }else {
                System.out.println("2da  3  1");

            }
        }
    }

    public static void main22(String[] arg1) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if (n1 + n2 >= 50) {
            System.out.println("good");
        }

    }

    public static void main3(String[] arg2) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        if (n1 >= 20 && n2 <=50) {
            System.out.println(n1+n2);
        }else {
            System.out.println(n1*n2);

        }

    }

    public static void main11(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入狗的年龄：");
        double n1 = scanner.nextDouble();

        if (n1>0){
            System.out.println("人的年龄：" +  ((n1-2)*4 +10.5*2));
        }else {

        }
    }

}



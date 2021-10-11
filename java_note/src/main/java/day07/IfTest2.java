package day07;

import java.util.Scanner;

public class IfTest2 {

    public static void main1(String[] args) {

        System.out.println("输入第一个数字");
        Scanner sca = new Scanner(System.in);
        int num1 = sca.nextInt();
        System.out.println("输入第二个数字");
        int num2 = sca.nextInt();

        System.out.println("输入第三个数字");
        int num3 = sca.nextInt();

        String max = (num1 > num2) ? ((num1 > num3) ? ("num1::::--" + num1) : "num3 大") : "num2大";
        System.out.println(max);

    }

    public static void main2(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if (n1 + n2 >= 50) {
            System.out.println("good");
        }

    }

    public static void main3(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        if (n1 >= 20 && n2 <=50) {
            System.out.println(n1+n2);
        }else {
            System.out.println(n1*n2);

        }

    }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入狗的年龄：");
        double n1 = scanner.nextDouble();

        if (n1>0){
            System.out.println("人的年龄：" +  ((n1-2)*4 +10.5*2));
        }else {

        }
    }

}


package day07;

import java.util.Scanner;

//获取指定的数据类型
//char 型 Scanner 没有提供找个方法 只能获取字符串

public class ScannerT {

    public static void main(String[] args) {
        //实例化
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入名字");
        String name = scanner.next();
        //String   的   charAt 方法根据索引取值
        char na = name.charAt(0);
        System.out.println("输入年龄");
        int a = scanner.nextInt();
        System.out.println(na + "::::"+a);
        boolean b = scanner.nextBoolean();

    }
}

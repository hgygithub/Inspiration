package day07;

import java.util.Scanner;

/**|
 * 获取随机数 10-99
 *
 *
 * 获去闭区间的随机数   [a,b]  (int)(Math.random()*(b-a +1)) + a
 *
 */

//随机输入2位数 如果匹配上随机生成的2位数 给宝马 ，若顺序不一致 给奥迪   若满足顺序只匹配一个数就 吉利 ，不满足顺序的一个数给五菱


public class IfTest3 {

    public static void main1(String[] args) {
        //只能获取[0.0 , 1.0 )  random生成的随机数 double
//        double num = Math.random();
        //获取 10-99
        int randomNum = (int)(Math.random()*90+10);

        int rshi = randomNum/10;
        int rge = randomNum%10;

        System.out.println(randomNum);
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入数字");
        int inputNum = scanner.nextInt();
        int ishi = inputNum/10;
        int ige = inputNum%10;

        if (inputNum==randomNum){
            System.out.println("宝马");
        }else if (rshi==ige && rge ==ishi){
            System.out.println("奥迪");
        }else if (rshi ==ishi || rge ==ige){
            System.out.println("吉利");
        }else if (rshi==ige || rge ==ishi){
            System.out.println("五菱");
        }else {
            System.out.println("下次再来");

        }
    }

    //结婚条件筛选

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入身高");
        int inputcm = scanner.nextInt();
        System.out.println("钱");
        double input2 = scanner.nextDouble();
        System.out.println("是否帅");
        String input3 = scanner.next();
//        String input3 = scanner.nextBoolean(); 布尔值也是可以
        if (inputcm >=180 && input2 >=1.0 && input3.equals("是")){
            System.out.println("直接完事");

        }else if (inputcm >=180 || input2 >=1.0 || input3.equals("是")){
            System.out.println("还行");
        }else {
            System.out.println("滚啊");

        }

    }
}

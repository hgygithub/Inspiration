package day07;

public class ForTest1 {

    public static void main(String[] args) {

        /*
        打印出1-150每个数字,3的倍数输出foo,的倍数 biz,7的倍数baz
         */

        for (int i =1;i<=150;i++){
            if (i %3==0){
                System.out.println(i+"foo");
            }else if (i %5==0){
                System.out.println(i+"biz");
            }else if (i %7==0){
                System.out.println(i+"baz");
            }else {
                System.out.println(i);
            }
        }
    }
}

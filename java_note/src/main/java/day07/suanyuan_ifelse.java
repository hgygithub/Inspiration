package day07;

public class suanyuan_ifelse {

    public static void main(String[] args) {
        double i = 11;
        double a = 191;
        if (i> 10.0 && a< 20.0){
            System.out.println("和是"+ (i+a));
        }else {
            System.out.println("差是"+ (a-i));
        }
    // 2个变量值交换
        String  a1 ="杭州";
        String  a2 ="西湖";
        String a3 =a1;
        a1=a2;
        a2 = a3;
        System.out.println(a1);
        System.out.println(a2);


    }
}

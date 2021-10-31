package day08;

public class ForFotTest {
    public static void main(String[] args) {
        for (int i =0;i<5;i++){
            for (int a =0;a<5;a++){
                System.out.print("*");
            }
            System.out.println();
        }
//"----------------------------------------------------"

//99乘法
        for(int i=1;i<10;i++){
            for (int c=1;c<=i;c++){
                System.out.print(i + "*" + c + "="+ i*c +"\t");
            }
            System.out.println();
        }
    }

}

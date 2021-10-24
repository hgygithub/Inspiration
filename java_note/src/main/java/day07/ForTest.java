package day07;

/**|
 * for 循环结构
 * 1. 初始化条件
 * 2. 循环条件  .---Boolean 类型
 * 3. 循环体
 * 4. 迭代条件
 * for(1；2；4){
 *      3
 * }


 */

public class ForTest {

    public static void main(String[] args) {
        for (int i= 1;i<=100;i++){
            System.out.println("hello");
            System.out.println(i);
        }
        int a = 1;
        for (System.out.print('a');a<=3;System.out.println('c'),a++){
            System.out.print("b");
        }
        System.out.println("-------------遍历100内的偶数,输入所以偶数的和-偶数的个数--------------");
        int sum =0;
        int count = 0;
        for (int i =1; i<=100;i++){
            if (i % 2 ==0){
                System.out.println(i+",");
                sum +=i;
                count++;
            }
        }
        System.out.println("偶数和：" +sum);
        System.out.print("偶数个数：" +count);


    }
}

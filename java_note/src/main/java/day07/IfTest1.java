package day07;

/**
 * 条件表达式： 如果条件是互斥得，没有交集得条件顺序是无所谓的
 * 如果条件存在交集关系，，，就要根据实际情况，考虑清楚 把那个结构放在上边
 *
 *如果条件存在包含关系， 要把范围小的放在上边先执行   若把大的大范围放在上边就永远不会执行小范围得条件
 */

import java.util.Scanner;

public class IfTest1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");
        int score =scanner.nextInt();

        if (score== 100) {
            System.out.println("法拉利");
        }else  if(score>80  && score <=99){
            System.out.println("十三香");
        }else if (score>=60 && score<=80){
            System.out.println("3080显卡");
        }else {
            System.out.println("菜狗");
        }
    }




}

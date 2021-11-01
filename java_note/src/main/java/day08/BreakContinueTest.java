package day08;

/**
 *
 * break  直接跳出当前循环 ，
 *
 * continue 忽略此次循环 ，继续运行
 *
 */
public class BreakContinueTest {

    public static void main(String[] args) {
        for (int i=1;i<=6;i++){
            if (i % 3==0){
//                break; 默认跳出最近的for
                continue;
            }
            System.out.println(i);
        }

        System.out.println("------------------------------------");
        //跳出指定的for    前边加上标识
        tag:for (int i=1;i<=6;i++){
            if (i % 3==0){
                break tag;//结束指定标识的那一层
//                continue;
            }
            System.out.println(i);
        }
    }
}

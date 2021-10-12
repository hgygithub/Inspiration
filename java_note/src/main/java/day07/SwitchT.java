package day07;

/**
 * 格式
 * switch (表达式){
 *      case  "常量1":
 *          "执行语句";
 *           break;
 *      case  "常量2":
 *           "执行语句";
 *            break;
 *              .....
 *    default:
 *        "执行语句："
 *          break；
 *         }
 *
 *  说明： 根据switch 的值，依次按照顺序去匹配case的值，一旦匹配成功，进入caes之后的
 *  这个后的全部case会执行 ，直到遇见break 或到结构末尾结束
 *
 *  break 可以使用在switch 结构中 标师一旦执行到关键字，就跳出
 *-------------划重点记住------------
 *  表达式 只能使用这6中数据类型  ：：  byte short ,char ,int , 枚举类型 ， String
 *  输入其他类型直接编译不通过
 *  case 之后声明常量  不能是范围
 *  break 是可选的根据具体情况 选择
 *  default 相当于if -else 结构的 else
 *       default是可选的
 *       default的位置随意开头，中间，结尾都可以
 *
 */

public class SwitchT {

    public static void main(String[] args) {
        int i =1;
        switch (i){
            case 1:
                System.out.println("1");
                break;
            case 11:
                System.out.println("11");

            default:
                System.out.println("www");

        }
        //支持的6种数据类型外的其他数据类型 编译不通过的
//        boolean isok = true;
//        switch (isok){
//            case true:
//                System.out.println("www");
//                break;
//        }
        /*----------------------编译不通过
        int i1 = 1;
        switch (i1){
            case i1> 3:
                System.out.println("吃烧烤");
                break;
            case 2:
                System.out.println("喝奶茶");
                break;
            default:
                System.out.println("干饭结束");

        }
*/
    }
}

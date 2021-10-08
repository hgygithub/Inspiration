package day06;

/**
 *  & && | ||
 *
 *  逻辑运算都是针对Boolean 的
 */



public class luojiyunsuan {

    public static void main(String[] args) {
        //区分 &    &&     |  ||
        //想同点：1. 运算结果一样
        //      2.当符号左边是true 二者都会执行右边的条件
        //      3.当符号左边是false 就不执行右边的条件

        boolean a = true;
        int b = 99;
        if(a & b>1){
            System.out.println("喝奶茶");
        }else {
            System.out.println("喝可乐");
        }

        a=false;
        if(a && b>1){
            System.out.println("喝奶茶");
        }else {
            System.out.println("喝可乐&&");
        }

        if(a & b<1){
            System.out.println("喝奶茶");
        }else {
            System.out.println("喝可乐");
        }

        a=false;
        if(a || b>1){
            System.out.println("喝奶茶||");
        }else {
            System.out.println("喝可乐");
        }

    }
}

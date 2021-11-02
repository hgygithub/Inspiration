package day09;

/*
 * 多个相同类型的数据按一定的顺序排列的集合 通过索引统一管理
 *
 * 数组名
 * 元素
 * 角标 下标 索引
 * 数组的长度 ：有多少个元素
 *数组的特点：
 * 1. 数组是有序的
 *2. 属于引用数据类型 可以是基本数据类型也可以是引用数据类型
 * 3.在内存种开辟一块连续的空间
 * 4. 长度确定后就不能修改
 *
 * 分类：
 * 一维数组 二维数组
 * 基本数据类型数组 和 引用数据类型数组
 *
 */

public class ArrayTest{

    public static void main(String[] args) {

        //声明和初始化
        int num; //声明
        //初始化
        num=10;
        //声明加初始化
        int a =1;

        int[] ids;
        //静态初始化   数组的初始化和数组元素的赋值同时进行
        ids=new int[]{1,2,3,4};
        //动态初始化    数组的初始化和数组元素的赋值分开进行
        //长度
        String[] names = new String[10];

        //调用数组种指定位置的元素 :通过角标的方式
        names[0] ="zhang";
        names[1] ="san";
        //获取数组的长度
        System.out.println(names.length);
        //遍历数组
        for (int i=0;i<names.length-1;i++){

            System.out.println(names[i]);
        }


    }


}
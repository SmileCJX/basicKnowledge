package com.caijx.basic;

/**
 * 变量交换的三种方式
 * Created by Administrator on 2017/4/23/023.
 */
public class Exchange {
    public static void main(String args[]){
        int a = 5;
        int b = 10;

        swapByAnotherVariable(a,b);
        swapByNoAnotherVariable(a,b);
        swapByXOR(a,b);
    }

    //方式1：定义一个其他变量作为中间量来实现
    public static void swapByAnotherVariable(int a, int b){
        int c = a;
        a = b;
        b = c;
        System.out.println("Exchange result: a = " + a + " b = " + b);
    }

    //方式2：试用“数据叠加后再减回来”的方法，可能会存在越界问题
    public static void swapByNoAnotherVariable(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Exchange result: a = " + a + " b = " + b);
    }

    //方式3：异或运算，效率是极高的，而且不会越界。
    public static void swapByXOR(int a,int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Exchange result: a = " + a + " b = " + b);
    }
}

package com.caijx.basic.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Modifier使用一个二进制的位来表示是否包含某个修饰符。
 * Created by Administrator on 2017/4/23/023.
 */
public class Reflection {

    public static void main(String args[]){
        Class<?> clazz = MyTest.class;
        Field[] fields = clazz.getDeclaredFields();//获取这个类的成员变量。
        /**
         * java.lang.reflect.Modifier这个类。
         * Modifier提供了很多静态方法。
         * 如  public static String toString(int mod)就可以输出该整数对应的所有的修饰符。
         *     public static boolean isPublic(int mod)就可以判断该整数对应的是不是包含public修饰符。
         */
        for(Field field : fields){
            System.out.println(field.getName() + "->" + Modifier.toString(field.getModifiers()));
            if(field.getModifiers() == 9){
                System.out.println(field.getName() + "的修饰符为public static");
            }
        }
    }
}




package com.caijx.basic;

import java.text.Collator;
import java.util.*;

/**
 * 中文拼音排序
 * Created by Administrator on 2017/4/29/029.
 * Java提供了Comparable和Comparator两种接口
 *      对象实现Comparable接口后，这个方法就固定了
 *      如果它的排序算法不是固定的，是可以动态调整的，那么就用Comparator接口来扩展
 */
public class SampleChineseSort {
    private final static Comparator CHINA_COMPARE = Collator.getInstance(Locale.CHINA);

    public static void main(String[] args){
        sortList();
        sortArray();
    }

    private static void sortList(){
        List<String> list = Arrays.asList("张三","李四","王五");
        Collections.sort(list,CHINA_COMPARE);
        for(String str : list){
            System.out.println(str);
        }
    }

    private static void sortArray(){
        String[] arr = {"张三","李四","王五"};
        Arrays.sort(arr, CHINA_COMPARE);
        for (String str : arr){
            System.out.println(str);
        }
    }
}

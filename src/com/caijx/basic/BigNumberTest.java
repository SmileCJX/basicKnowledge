package com.caijx.basic;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 首先将大数字加上10，输出结果。
 * 然后将结果的byte位取出来以二进制形式展现。
 * 最后根据二进制字符串反转为数字对象。
 * Created by Administrator on 2017/4/23/023.
 */
public class BigNumberTest {
    /*
    有一个substring()、lPad()操作。
    这是因为Integer.toBinaryString(b)传入的虽然是byte，
    但是会转型为int，如果byte的第1个bit位是1，则代表是负数，那么转换为int的高24位将会填充1。
    其实我们不需要这24位，所以用了substring()。
    如果是正数，那么输出的字符串会将前面的0去掉，
    为了在显示上使用8位二进制对齐方式，所以在代码中用了lPad()。
     */
    public static String lPad(String now, int expectLength, char paddingchar){
        if (now == null || now.length() >= expectLength){
            return now;
        }
        StringBuffer buf = new StringBuffer(expectLength);
        for(int i = 0,paddingLength = expectLength - now.length(); i < paddingLength; i++){
            buf.append(paddingchar);
        }

        return buf.append(now).toString();
    }

    public static void main(String [] args){
        //这个数字long是放不下的
        BigDecimal bigDecimal = new BigDecimal("1233243243243243243243243243243243241432423432");
        System.out.println("数字的原始值是：" + bigDecimal);

        //二进制数字
        byte[] bytes = bigDecimal.toBigInteger().toByteArray();
        for(byte b : bytes){
            String bitString = lPad(Integer.toBinaryString(b & 0xff),8,'0');
            System.out.println(bitString);
        }

        //还原结果
        BigInteger bigInteger = new BigInteger(bytes);
        System.out.println("还原结果为：" + bigInteger);
    }
}

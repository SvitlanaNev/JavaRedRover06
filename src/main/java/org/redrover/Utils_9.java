package org.redrover;

import org.apache.commons.lang3.StringUtils;

public class Utils_9 {


    String hi;

    public static String abbr(String text, int length){
        return text.substring(0, length - 3) + "...";
    }

    public static String abbreviate(String text, int length){
        return StringUtils.abbreviate(text,length);
    }

    public static int sum(Integer first, int second){
        int sum = first + second;
        return sum;
    }

    public static int sum(int firstValue, int secondValue, int thirdValue){
        int sum = firstValue + secondValue + thirdValue;
        return sum;
    }

    void printSum(int first, int second){
        int s = sum(first, (Integer) second);

        System.out.println("sum = " + s);
    }

    void printMe(int first, int second){
        int s = sum(first, (Integer) second);
        System.out.println(hi + "sum = " + s);
    }
    void division(int first, int second){
        double division = 1/0 * first / second;
        System.out.println(division);
    }


}

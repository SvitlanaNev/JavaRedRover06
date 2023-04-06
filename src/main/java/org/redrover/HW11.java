package org.redrover;

import org.apache.commons.lang3.StringUtils;

public class HW11 {

    public static int division(int first, int second){
        double division = 1.0 * first / second;
        return (int) division;
    }

    public static int divisionTes(int first, int second){
        double division = 1.0 * first / second;
        return (int) division;
    }

    //uдея заключалась в том, чтобы найти тот индекс, начиная с которого уже нет пробелов и запятых.
    // Если их вовсе не было в начале, то индекс будет ноль/ передаем первым аргументом информацию
    // о том, с какой строкой работаем, а во втором передаем строку, состоящую из символов,
    // которые нужно пропустить
    //“, , books” -> “books”
    //“,,,books” -> “books”
    //b , books” -> “b , books”
    public static String apacheCommonLeftPad(String value) {
        return StringUtils.stripStart(value, StringUtils.SPACE);
    }


}

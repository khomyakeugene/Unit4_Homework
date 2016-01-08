package com.company.utils;

import java.text.MessageFormat;

/**
 * Created by Yevgen on 29.12.2015.
 */
public class Utils {
    public final static String CLASS_NAME_MESSAGE = "Class Name: {0}";

    public static String getClassNameMessage(Object object) {
        return MessageFormat.format(CLASS_NAME_MESSAGE, object.getClass().getName());
    }

    public static void writeMessage(String message) {
        System.out.println(message);
    }

}

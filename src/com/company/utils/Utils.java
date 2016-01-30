package com.company.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.*;

/**
 * Created by Yevgen on 06.01.2016.
 */

public class Utils {
    public final static int LETS_THINK_THIS_IS_THE_NUMBER_OF_CALLING_ELEMENT_OF_STACK = 2;

    public final static String FULL_METHOD_NAME_PATTERN = "{0}.{1}";
    public final static String PLEASE_REPEAT_ENTER =
            "{0} was generated with data \"{1}\". Please, repeat enter action";

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static String getFullMethodName() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        return MessageFormat.format(
                FULL_METHOD_NAME_PATTERN,
                stackTraceElement[LETS_THINK_THIS_IS_THE_NUMBER_OF_CALLING_ELEMENT_OF_STACK].getClassName(),
                stackTraceElement[LETS_THINK_THIS_IS_THE_NUMBER_OF_CALLING_ELEMENT_OF_STACK].getMethodName());
    }

    public static String readInputString(String enterMessageInvitation) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        printMessage(enterMessageInvitation);

        do {
            try {
                return bufferedReader.readLine();
            } catch (IOException e) {
                printMessage(MessageFormat.format(PLEASE_REPEAT_ENTER, e.getClass().getName(), e.getMessage()));
            }
        } while (true);
    }


    public static int readInputInt(String enterMessageInvitation) {
        final Scanner scanner = new Scanner(System.in);

        printMessage(enterMessageInvitation);
        return scanner.nextInt();
    }

    public static double readInputDouble(String enterMessageInvitation) {
        final Scanner scanner = new Scanner(System.in);

        printMessage(enterMessageInvitation);
        return scanner.nextDouble();
    }
}
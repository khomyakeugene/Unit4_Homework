package com.company.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.ArrayList;

/**
 * Created by Yevgen on 10.01.2016.
 */
public class SelfDescribingObjectService {
    public static Method searchOneDoubleArgumentMethod(String className, String methodName, boolean onlyPublic) {
        Method method = null;

        try {
            Class cls = Class.forName(className);
            Class[] parameterTypes = new Class[1];
            parameterTypes[0] = double.class;

            try {
                method = onlyPublic ? cls.getMethod(methodName, parameterTypes) :
                        cls.getDeclaredMethod(methodName, parameterTypes);
            } catch (NullPointerException | SecurityException | NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (NullPointerException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return method;
    }

    public static Method searchOneDoubleArgumentPublicMethod(String className, String methodName) {
        return searchOneDoubleArgumentMethod(className, methodName, true);
    }


    public static double invokeOneDoubleArgumentStaticMethod(Method method, double argument) {
        double result = Double.NaN;

        try {
            result = Double.parseDouble(method.invoke(null, argument).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}

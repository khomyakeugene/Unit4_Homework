package com.company.tests;

import com.company.math.CalcIntegralByMonteCarloMethod;
import com.company.utils.Utils;

import java.text.MessageFormat;

/**
 * Created by Yevgen on 09.01.2016.
 */
public class TestMonteCarloIntegralCalculation {
    public static final String MATH_CLASS_NAME = "java.lang.Math";
    public final static String PLEASE_ENTER_A_DOUBLE_METHOD_DOUBLE_NAME_PATTERN =
            "Please, enter name of a <double> method(<double>) of class {0} (or just type <Return> to stop):";
    public final static String INPUT_START_POINT_MESSAGE = "Input start point double value:";
    public final static String INPUT_FINISH_POINT_MESSAGE = "Input start point double value:";
    public final static String INPUT_PRECISION_MESSAGE = "Input precision int value:";
    public final static String INTEGRAL_VALUE_PATTERN = "Integral value for function {0}.{1} is {2}";

    public void demonstrateCarloIntegralCalculation () {
        Utils.printMessage(Utils.getFullMethodName());

        // Integral calculator
        CalcIntegralByMonteCarloMethod calcIntegralByMonteCarloMethod = new CalcIntegralByMonteCarloMethod(MATH_CLASS_NAME);

        do {
            String methodName = Utils.readInputString(MessageFormat.format(PLEASE_ENTER_A_DOUBLE_METHOD_DOUBLE_NAME_PATTERN, MATH_CLASS_NAME));
            if (methodName.isEmpty()) break;

            // Store method name
            calcIntegralByMonteCarloMethod.setFunctionMethodName(methodName);
            // Is it correct?
            if (calcIntegralByMonteCarloMethod.getFunction() != null) {
                // Get input parameters
                double startPoint = Utils.readInputDouble(INPUT_START_POINT_MESSAGE);
                double finishPoint = Utils.readInputDouble(INPUT_FINISH_POINT_MESSAGE);
                int precision = Utils.readInputInt(INPUT_PRECISION_MESSAGE);

                // Calc and show calcIntegral value
                Utils.printMessage(MessageFormat.format(INTEGRAL_VALUE_PATTERN,
                        calcIntegralByMonteCarloMethod.getFunctionClassName(),
                        calcIntegralByMonteCarloMethod.getFunctionMethodName(),
                        calcIntegralByMonteCarloMethod.calcIntegral(startPoint, finishPoint, precision)));
            }
       } while (true);
    }
}

package com.company.math;

import com.company.utils.SelfDescribingObjectService;
import java.lang.reflect.Method;

/**
 * Created by Yevgen on 09.01.2016.
 */

public class CalcIntegralByMonteCarloMethod {
    private String functionClassName;
    private String functionMethodName;
    private Method function = null;

    public CalcIntegralByMonteCarloMethod(String functionClassName, String functionMethodName) {
        this.functionClassName = functionClassName;
        this.functionMethodName = functionMethodName;

        if (!functionClassName.isEmpty() && !functionMethodName.isEmpty()) {
            initFunction();
        }
    }

    public CalcIntegralByMonteCarloMethod(String functionClassName) {
        this(functionClassName, "");
    }

    private void initFunction() {
        this.function = SelfDescribingObjectService.searchOneDoubleArgumentPublicMethod(functionClassName, functionMethodName);
    }

    public String getFunctionClassName() {
        return functionClassName;
    }

    public void setFunctionClassName(String functionClassName) {
        this.functionClassName = functionClassName;

        initFunction();
    }

    public String getFunctionMethodName() {
        return functionMethodName;
    }

    public void setFunctionMethodName(String functionMethodName) {
        this.functionMethodName = functionMethodName;

        initFunction();
    }

    public Method getFunction() {
        if (function == null) {
            initFunction();
        }

        return function;
    }

    public double calcIntegral(double startPoint, double finishPoint, int precision) {
        double result = 0.0;
        Method func = getFunction();

        // Correct input parameter mistake if necessary
        if (finishPoint < startPoint) {
            double temp = startPoint;
            startPoint = finishPoint;
            finishPoint = temp;
        }

        double currentPoint = startPoint;
        double length = (finishPoint - startPoint);
        double delta = length / precision;
        for (int i = 0; i < precision; i++) {
            result += SelfDescribingObjectService.invokeOneDoubleArgumentStaticMethod(func, currentPoint);
            currentPoint += delta;
        }

        return result * delta;
    }
}

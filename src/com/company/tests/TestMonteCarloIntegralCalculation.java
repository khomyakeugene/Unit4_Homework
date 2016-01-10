package com.company.tests;

import com.company.utils.SelfDescribingObjectService;
import com.company.utils.Utils;

/**
 * Created by Yevgen on 09.01.2016.
 */
public class TestMonteCarloIntegralCalculation {

    public void demonstrateCarloIntegralCalculation () { //я так поняла - тут не дописано?) - 10.01.2016 01:25, Хом'як: угу, це поки що - заготовка

        // Temporary test
        Utils.writeMessage(
                Double.toString(SelfDescribingObjectService.invokeOneDoubleArgumentStaticMethod("java.lang.Math","sqrt", 4.0)));

    }
}

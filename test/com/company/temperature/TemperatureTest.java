package com.company.temperature;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yevgen on 31.01.2016 as a part of the project "Unit4_Homework".
 */
public class TemperatureTest {
    final Double celsiusDegree = 15.0;
    final Double fahrenheitDegree = 30.0;

    @Test (timeout = 1000)
    public void testTransformCelsiusToFahrenheit() throws Exception {
        //Как-то больше принято сначала писать (вычислять) expected результат, а потом уже актуальный
        //По принципу Given - When - Then
        Double result = Temperature.transformCelsiusToFahrenheit(celsiusDegree);

        Double expectedResult = (celsiusDegree * Temperature.CELSIUS_TO_FAHRENHEIT_MULTIPLIER) +
                Temperature.CELSIUS_TO_FAHRENHEIT_DIFFERENCE;

        assertEquals(expectedResult, result);
    }

    @Test (timeout = 1000)
    public void testTransformFahrenheitToCelsius() throws Exception {
        Double result = Temperature.transformFahrenheitToCelsius(fahrenheitDegree);

        Double expectedResult = (fahrenheitDegree - Temperature.CELSIUS_TO_FAHRENHEIT_DIFFERENCE) /
                Temperature.CELSIUS_TO_FAHRENHEIT_MULTIPLIER;
        assertEquals(expectedResult, result);
    }
}
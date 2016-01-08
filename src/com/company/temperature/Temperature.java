package com.company.temperature;

/**
 * Created by Yevgen on 03.01.2016.
 */
public class Temperature {
    public static final Double CELSIUS_TO_FAHRENHEIT_DIFFERENCE = 32.0;
    public static final Double CELSIUS_TO_FAHRENHEIT_MULTIPLIER = 9.0 / 5.0;

    public static Double transformCelsiusToFahrenheit(Double celsiusDegree) {
        return (celsiusDegree * CELSIUS_TO_FAHRENHEIT_MULTIPLIER) + CELSIUS_TO_FAHRENHEIT_DIFFERENCE;
    }

    public static Double transformFahrenheitToCelsius(Double fahrenheitDegree) {
        return (fahrenheitDegree - CELSIUS_TO_FAHRENHEIT_DIFFERENCE) / CELSIUS_TO_FAHRENHEIT_MULTIPLIER;
    }
}

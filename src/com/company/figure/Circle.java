package com.company.figure;

import java.text.MessageFormat;

/**
 * Created by Yevgen on 29.12.2015.
 */
public class Circle extends GeometricFigure {
    public final static String RADIUS_IS_MESSAGE = "radius = {0}";

    private Double radius;

    public Circle(Double radius) {
        super();

        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;

        clearArea();
    }

    @Override
    public void calcArea() {
        setArea(Math.PI * Math.pow(radius, 2));
    }

    @Override
    protected String displayFigureParameters() {
        return MessageFormat.format(RADIUS_IS_MESSAGE, getRadius());
    }
}

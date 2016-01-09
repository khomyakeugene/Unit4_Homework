package com.company.figure;

import java.text.MessageFormat;

/**
 * Created by Yevgen on 29.12.2015.
 */
public class Rectangle extends GeometricFigure {
    public final static String WIDTH_AND_HIGH_ARE_MESSAGE = "width = {0}, height = {1}";

    private Double width; // В других фигурах ты присваивал NAN, здесь нет - почему?
    private Double height;

    public Rectangle(Double width, Double height) {
        super();

        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;

        clearArea();
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;

        clearArea();
    }

    @Override
    public void calcArea() {
        setArea(width * height);
    }

    @Override
    protected String displayFigureParameters() {
        return MessageFormat.format(WIDTH_AND_HIGH_ARE_MESSAGE, getWidth(), getHeight());
    }
}

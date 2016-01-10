package com.company.figure;

import com.company.utils.Utils;

import java.text.MessageFormat;

/**
 * Created by Yevgen on 29.12.2015.
 */
public abstract class GeometricFigure {
    public final static String AREA_OF_FIGURE_MESSAGE = "The area of the figure \"{0}\" (with the parameters such as {1}) is {2}";
    public final static String UNDEFINED_TEXT = "undefined";

    private Double area = Double.NaN;

    public Double getArea() {
        if (area.isNaN()) {
            calcArea();
        }

        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    abstract void calcArea();

    protected String displayFigureParameters() {
        return UNDEFINED_TEXT;
    }

    @Override
    public String toString() {
        return MessageFormat.format(AREA_OF_FIGURE_MESSAGE,
                this.getClass().getName(), displayFigureParameters(), getArea());
    }

    public void showFigureArea() {
        Utils.writeMessage(toString());
    }
}

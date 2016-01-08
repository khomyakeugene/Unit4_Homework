package com.company.figure;

import java.text.MessageFormat;

/**
 * Created by Yevgen on 29.12.2015.
 */
public class Triangle extends GeometricFigure {
    public final static String FIRSTSIDE_SECONDSIDE_THIRDSIDE_MESSAGE = "first side = {0}, second side = {1}, third side = {2}";

    private Double firstSide = Double.NaN;
    private Double secondSide = Double.NaN;
    private Double thirdSide = Double.NaN;

    public Triangle(Double firstSide, Double secondSide, Double thirdSide) {
        super();

        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public Double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(Double firstSide) {
        this.firstSide = firstSide;

        clearArea();
    }

    public Double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(Double secondSide) {
        this.secondSide = secondSide;

        clearArea();
    }

    public Double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(Double thirdSide) {
        this.thirdSide = thirdSide;

        clearArea();
    }

    protected Double calcPerimeter() {
        return (getFirstSide() + getSecondSide() + getThirdSide());
    }

    @Override
    protected String displayFigureParameters() {
        return MessageFormat.format(FIRSTSIDE_SECONDSIDE_THIRDSIDE_MESSAGE, getFirstSide(), getSecondSide(), getThirdSide());
    }

    private Double calcAreaByHeronsFormula() {
        Double halfOfPerimeter = calcPerimeter() / 2.0;

        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - getFirstSide()) * (halfOfPerimeter - getSecondSide()) * (halfOfPerimeter - getThirdSide()));
    }

    @Override
    public void calcArea() {
        setArea(calcAreaByHeronsFormula());
    }
}

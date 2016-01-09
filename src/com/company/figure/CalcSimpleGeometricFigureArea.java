package com.company.figure;

/**
 * Created by Yevgen on 02.01.2016.
 */
public class CalcSimpleGeometricFigureArea {
    public Double calcCircleArea(Double radius, boolean showResult) { //boolean лучше именовать, начиная с is или has, а то не совсем понятно
        Circle circle = new Circle(radius); //тут можно применить полиморфизм GeometricFigure circle = new Circle...
        if (showResult) {
            circle.showFigureArea();
        }

        return circle.getArea();
    }

    public Double calcRectangleArea(Double width, Double height, boolean showResult) {
        Rectangle rectangle = new Rectangle(width, height);

        if (showResult) {
            rectangle.showFigureArea();
        }

        return rectangle.getArea();
    }

    public Double calcTriangleArea(Double firstSide, Double secondSide, Double thirdSide, boolean showResult) {
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);

        if (showResult) {
            triangle.showFigureArea();
        }
        return triangle.getArea();
    }
}

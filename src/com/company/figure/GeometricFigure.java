package com.company.figure;

import com.company.utils.Const;
import com.company.utils.Utils;

import java.text.MessageFormat;

/**
 * Created by Yevgen on 29.12.2015.
 */
public abstract class GeometricFigure {
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

    protected void clearArea() {
        setArea(Double.NaN);
    }

    protected String displayFigureParameters() {
        return Const.UNDEFINED_TEXT;
    }

    @Override
    public String toString() {
        return MessageFormat.format(Const.AREA_OF_FIGURE_MESSAGE, new Object[]{this.getClass().getName(), displayFigureParameters(), getArea()});
    }

    public void showFigureArea() {
        Utils.writeMessage(toString());
    }
}

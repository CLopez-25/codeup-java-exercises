package com.codeup.java.Shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double width;
    protected double length;

    public Quadrilateral(double side, double side1){
    super();
    }

    public void lengthWidth( double length, double width){
        this.length = length;
        this.width = width;


    }
}

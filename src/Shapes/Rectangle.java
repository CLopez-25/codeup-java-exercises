package com.codeup.java.Shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    @Override
    public double getPerimeter() {
        return 2*width + 2*length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

//    public void setLength(double length){
//        this.length = length;
//    }
//
//    public void setWidth(){
//        this.length = width;
//    }

//    protected int width;
//    protected int length;
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public Rectangle(){}
//
//    public Rectangle(int width, int length){
//        this.width = width;
//        this.length = length;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);
//    }

}

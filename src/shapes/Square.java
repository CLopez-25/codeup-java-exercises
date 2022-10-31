package com.codeup.java.shapes;

public class Square extends Rectangle {

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    public Square(double side){
        super(side, side);
    }
//    public Square(){}
//
//    public int getArea(){
//        return (int) Math.pow(getLength(), 2);
//    }
//
//    public int getPerimeter(){
//        return 4 * getLength();
//    }
//
//    public Square(int side){
//        super.setLength(side);
//        super.setWidth(side);
//    }
}

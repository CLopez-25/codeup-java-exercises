package com.codeup.java.Shapes;

public class Square extends Rectangle {
    public Square(){}

    public int getArea(){
        return (int) Math.pow(getLength(), 2);
    }

    public int getPerimeter(){
        return 4 * getLength();
    }

    public Square(int side){
        super.setLength(side);
        super.setWidth(side);
    }
}

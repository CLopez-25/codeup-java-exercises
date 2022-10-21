package com.codeup.java.Shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Rectangle(){}

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }


}

package com.codeup.java.Shapes;

public class ShapesTest {
    public static void main(String[] args) {
//    Rectangle box1 = new Rectangle(4, 5);
//        System.out.println("The area of this rectangle is " + box1.getArea());
//        System.out.println("The perimeter of this rectangle is " + box1.getPerimeter());
//
//    Rectangle box2 = new Square(5);
//        System.out.println("The area of this square is " + box2.getArea());
//        System.out.println("The perimeter of this square is " + box2.getPerimeter());
//    }

        Measurable myShape;

        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Rectangle(4, 5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}

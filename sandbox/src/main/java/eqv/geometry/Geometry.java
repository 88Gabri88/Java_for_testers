package eqv.geometry;

import eqv.geometry.figures.Rectangle;
import eqv.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea (5);
        Square.printSquareArea (7);
        Square.printSquareArea (10);
        Square.printSquareArea (100);

        Rectangle.printRectangleArea (3.0, 5.5);
    }

}
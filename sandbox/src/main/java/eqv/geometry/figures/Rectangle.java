package eqv.geometry.figures;

public class Rectangle {
    public static void printRectangleArea(double a, double b) {
        System.out.println("Площадь прямоугольника со стороной " + a + " + " + b + " = " + RectangleArea(a, b));
    }

    private static double RectangleArea(double a, double b) {
        return a * b;
    }
}

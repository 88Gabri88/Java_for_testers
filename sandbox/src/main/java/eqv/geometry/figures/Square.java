package eqv.geometry.figures;

public class Square {
    public static void printSquareArea(double a) {
        String text = String.format("Площадь квадрата со стороной %f = %f", a, Area(a));
        System.out.printf(text);
    }

    private static double Area(double a) {
        return a * a;
    }
    public static void main(String[] args) {
        Square.printSquareArea (5.0);
    }
}

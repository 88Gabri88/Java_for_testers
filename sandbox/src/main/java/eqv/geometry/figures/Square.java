package eqv.geometry.figures;

public class Square {
    public static void printSquareArea(double a) {
        System.out.println("Площадь квадрата со стороной " + a + " = " + Area(a));
    }

    private static double Area(double a) {
        return a * a;
    }
}

public class Geometry {
    public static void main(String[] args) {
        printSquareArea (5);
        printSquareArea (7);
        printSquareArea (10);
        printSquareArea (100);

        printRectangleArea (3.0, 5.5);
    }

    private static void printRectangleArea(double a, double b) {
        System.out.println("Площадь прямоугольника со стороной " + a + " + " + b + " = " + RectangleArea(a, b));
    }

    private static double RectangleArea(double a, double b) {
        return a * b;
    }

    static void printSquareArea(double a) {
        System.out.println("Площадь квадрата со стороной " + a + " = " + Area(a));
    }

    private static double Area(double a) {
        return a * a;
    }
}

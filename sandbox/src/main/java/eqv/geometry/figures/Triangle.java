package eqv.geometry.figures;

public class Triangle {
    public static void printTriangle(double a, double b, double c) {
        String text = String.format("Прямоугольный треугольник со сторонами %f + %f + %f = %f", a, b, c, Triangle(a,b,c));
        System.out.println(text);
    }
    private static double Triangle(double a, double b, double c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Triangle.printTriangle (5.0, 5.0, 5.0);
    }

}
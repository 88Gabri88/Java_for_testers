package eqv.geometry.figures;

public class ABC {
    public static void printAreaTriangle(String[] args) {
        String Text1 = String.format("Площадь треугольника со сторонами %.2f", AreaTriangle(10, 10, 10));
        System.out.printf(Text1);

    }

    public static double AreaTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p -b) * (p - c));
    }
    public static void main(String[] args) {
        ABC.AreaTriangle (10, 10, 10);
    }
}




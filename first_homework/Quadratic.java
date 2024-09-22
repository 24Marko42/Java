package first_homework;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner chisla = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        double a = chisla.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = chisla.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = chisla.nextDouble();

        String result = solveQuadratic(a, b, c);
        System.out.println(result);
    }

    public static String solveQuadratic(double a, double b, double c) {
        if (a == 0) {
            return "Это не квадратное уравнение.";
        }
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double sqrtDis = Math.sqrt(discriminant);
            double x1 = (-b + sqrtDis) / (2 * a);
            double x2 = (-b - sqrtDis) / (2 * a);
            return String.format("Корни уравнения: x1 = %.6f, x2 = %.6f", x1, x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return String.format("Уравнение имеет один корень: x = %.6f", x);
        } else {
            return "нет вещественных корней";
        }
    }
}
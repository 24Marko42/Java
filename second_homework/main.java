package second_homework;

import java.util.Scanner;

public class main {

    public static boolean triangle(double a, double b, double c) {
        // Проверка, что все длины отрезков положительные
        if (a <= 0 || b <= 0 || c <= 0) {
            return false; // Нельзя построить треугольник с неположительными сторонами
        }
        // Проверка неравенства треугольника для всех комбинаций сторон
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    /*рекурсия первого задания */
    public static boolean triangleRecursive(double a, double b, double c) {
        // Проверка, что все длины отрезков положительные
        if (a <= 0 || b <= 0 || c <= 0) {
            return false; // Нельзя построить треугольник с неположительными сторонами
        }
        // Создаем массив сторон для удобства рекурсивной проверки
        double[] sides = { a, b, c };
        // Запускаем рекурсивную проверку с первого индекса
        return checkTriangleRecursive(sides, 0);
    }

    /**
     * Рекурсивный метод для проверки неравенств треугольника.
     */
    private static boolean checkTriangleRecursive(double[] sides, int index) {
        // Если проверили все стороны, возвращаем true
        if (index == sides.length) {
            return true;
        }
        // Вычисляем сумму двух других сторон
        double sumTwo = 0;
        for (int i = 0; i < sides.length; i++) {
            if (i != index) {
                sumTwo += sides[i];
            }
        }
        // Проверяем неравенство для текущей стороны
        if (sumTwo <= sides[index]) {
            return false; // Неравенство не выполняется
        }
        // Рекурсивно проверяем следующую сторону
        return checkTriangleRecursive(sides, index + 1);
    }

    // ==============================
    // Задание 2: Вычисление расстояния между двумя точками
    // ==============================

    /**
     * Вычисляет расстояние между двумя точками (x1, y1) и (x2, y2) в декартовой системе координат.
     * Использует обычный метод рассчета с использованием теоремы Пифагора.
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        // Вычисляем разницу координат по X и по Y
        double raznica_x = x2 - x1;
        double raznica_y = y2 - y1;
        // Возвращаем корень из суммы квадратов разниц
        return Math.sqrt(raznica_x * raznica_x + raznica_y * raznica_y);
    }

    /**
     * Рекурсивно вычисляет расстояние между двумя точками (x1, y1) и (x2, y2).
     */
    public static double distanceRecursive(double x1, double y1, double x2, double y2) {
        // Вычисляем разницы координат
        double[] diffs = { x2 - x1, y2 - y1 };
        // Рекурсивно суммируем квадраты разниц
        double sumSquares = sumSquaresRecursive(diffs, diffs.length);
        // Возвращаем корень из суммы квадратов
        return Math.sqrt(sumSquares);
    }

    /**
     * Вспомогательный рекурсивный метод для суммирования квадратов элементов массива.
     *
     * diffs массив разниц координат
     * n количество элементов для суммирования
     * сумма квадратов первых n элементов массива
     */
    private static double sumSquaresRecursive(double[] diffs, int n) {
        // Базовый случай: если n = 0, возвращаем 0
        if (n == 0) {
            return 0;
        }
        // Рекурсивно суммируем текущий квадрат с суммой оставшихся
        return diffs[n - 1] * diffs[n - 1] + sumSquaresRecursive(diffs, n - 1);
    }
    /*создаётся массив из разниц координат, он попадает в функцию, в которой вычисляется всё что стоит
     * под корнем. Т.е. берётся первый элемент массива, возводится в квадрат, затем к нему прибавляется
     * квадрат второго элемента, и так далее.
     */


    // ==============================
    // Задание 3: Возведение числа в степень с использованием цикла
    // ==============================

    public static double powerLoop(double a, int n) {
        // Проверка, что основание степени положительно
        if (a <= 0) {
            return -1;
        }
        double result = 1; // Инициализируем результат
        if (n > 0) {
            // Умножаем a на себя n раз для положительного показателя степени
            for (int i = 0; i < n; i++) {
                result *= a;
            }
        } else if (n < 0) {
            // Для отрицательного показателя степени делим 1 на a n раз
            for (int i = 0; i < -n; i++) {
                result /= a;
            }
        }
        // Если n == 0, результат остается равным 1
        return result;
    }

    // ==============================
    // Задание 4: Рекурсивное возведение числа в степень
    // ==============================

    public static double power(double a, int n) {
        // Проверка, что основание степени положительно
        if (a <= 0) {
            return -1;
        }
        // Проверка, что показатель степени не отрицательный
        if (n < 0) {
            return -1;
        }
        // Базовый случай: a^0 = 1
        if (n == 0) {
            return 1;
        } else {
            // Рекурсивный случай: a^n = a * a^(n-1)
            return a * power(a, n - 1);
        }
    }

    // ==============================
    // Задание 5: Вычисление n-го числа Трибоначчи
    // ==============================
    public static int tribonacci(int n) {
        // Что может быть:
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n <= -1) {
            return -1;
        } else {
            // Рекурсивный случай: Tn = Tn-1 + Tn-2 + Tn-3
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }
}
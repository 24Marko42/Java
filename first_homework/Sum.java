package first_homework;

public class Sum {
    public static void main(String[] args) {
        double summa = SumSum();
        // Вывод результата вычисления суммы ряда с точностью до 6 знаков после запятой
        System.out.printf("Результат вычисления суммы ряда: %.6f%n", summa);
    }

    public static double SumSum() {
        double sum = 0.0;
        int n = 2;
        double term;
        do {
            term = 1.0 / (n * n + n - 2);
            sum += term;
            n++;
        } while (term >= 1e-6);//1e-6 == 0.000001
        return sum;
    }
}
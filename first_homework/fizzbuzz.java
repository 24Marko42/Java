package first_homework;

public class fizzbuzz {
    // Главный метод, который запускает программу
    public static void main(String[] args) {
        // Цикл от 1 до 500 для проверки каждого числа
        for (int i = 1; i <= 500; i++) {
            // Получаем значение для текущего числа
            String output = getValue(i);
            // Выводим значение
            System.out.println(output);
        }
    }

    // Метод, который возвращает соответствующее значение для числа
    public static String getValue(int number) {
        // Проверка условий для числа
        if (number % 35 == 0) {
            // Если число делится на 35 (5 и 7), возвращаем "fizzbuzz"
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            // Если число делится на 5, возвращаем "fizz"
            return "fizz";
        } else if (number % 7 == 0) {
            // Если число делится на 7, возвращаем "buzz"
            return "buzz";
        } else {
            // В противном случае возвращаем само число в виде строки
            return Integer.toString(number);
        }
    }
}

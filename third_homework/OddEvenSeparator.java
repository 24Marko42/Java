package third_homework;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    List<Integer> oddNumbers; // Список для хранения нечетных чисел
    List<Integer> evenNumbers; // Список для хранения четных чисел

    public OddEvenSeparator() {
        oddNumbers = new ArrayList<>(); // Инициализация списка для нечетных чисел
        evenNumbers = new ArrayList<>(); // Инициализация списка для четных чисел
    }

    // Метод для добавления числа в соответствующий список (четные или нечетные)
    public void addNumber(int number) {
        if(number % 2 == 0) { // Проверка на четность числа
            evenNumbers.add(number); // Добавление четного числа в список
        } else {
            oddNumbers.add(number); // Добавление нечетного числа в список
        }
    }

    // Метод для вывода четных чисел
    public void even() {
        System.out.println("Even Numbers:");
        System.out.println(evenNumbers);
    }

    // Метод для вывода нечетных чисел
    public void odd() {
        System.out.println("Odd Numbers:");
        System.out.println(oddNumbers);
    }

}

package third_homework;


public class main {
    public static void main(String[] args) {
    // ==============================
    // Задание 1: Кнопка (счетчик нажатий)
    // ==============================

    button btn = new button(); // Создаем экземпляр класса Button
    btn.click(); // Нажимаем на кнопку (вызов метода click)
    btn.click(); // Еще одно нажатие на кнопку
    System.out.println("Total clicks: " + btn.getClickCount());

    // ==============================
    // Задание 2: Весы (балансировка)
    // ==============================

    balance balance = new balance();
    balance.addLeft(10); // Положить 10 на левую чашу
    balance.addRight(8); // Положить 8 на правую чашу
    balance.result(); // Вывести результат

    // ==============================
    // Задание 3: Звоноковый звонок
    // ==============================

    bell bell = new bell();
    for(int i = 0; i < 5; i++) { // Вызываем метод sound 5 раз
        bell.sound();
    }
    bell.sound(); 
    bell.sound();

    // ==============================
    // Задание 4: Сепаратор (фильтрация чисел)
    // ==============================

    OddEvenSeparator separator = new OddEvenSeparator();
    separator.addNumber(5);
    separator.addNumber(8);
    separator.addNumber(3);
    separator.addNumber(12);
    separator.addNumber(14);
    separator.addNumber(15);
    separator.even(); // Вывод четных чисел
    separator.odd(); // Вывод нечетных чисел

    // ==============================
    // Задание 5: СТОЛ (работа с матрицей)
    // ==============================

        table table = new table(3, 4);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 1, 3);
        table.setValue(2, 3, 4);

        System.out.println("Table contents:");
        System.out.println(table.toString());

        System.out.println("Average value in the table: " + table.average());
        System.out.println("Number of rows: " + table.rows());
    }
}

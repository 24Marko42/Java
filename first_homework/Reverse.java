package first_homework;

public class Reverse {
    public static void main(String[] args) {
        // Исходная строка
        String str = "make install";
        // Вызов метода reverseString для реверсирования строки и сохранения результата
        String reversed = reverseString(str);
        
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        // Переменная для хранения реверсированной строки
        String result = "";
        // Цикл прохода по строке в обратном порядке
        for (int i = str.length() - 1; i >= 0; i--) {
            // Добавление символов из оригинальной строки в обратном порядке
            result += str.charAt(i);
        }
        // Возвращение реверсированной строки
        return result;
    }
}

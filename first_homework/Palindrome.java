package first_homework;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner stroka = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = stroka.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Удаление пробелов и перевод всех символов в нижний регистр
        String cleanedstr = str.replaceAll("\\s+", "").toLowerCase();
        int len = cleanedstr.length();
        for (int i = 0; i < len / 2; i++) {
            // Проверка символов с обоих концов строки
            if (cleanedstr.charAt(i) != cleanedstr.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

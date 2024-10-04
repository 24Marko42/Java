package third_homework;

// Класс для описания весов с двумя чашами
public class balance {
    public int leftWeight; // Вес на левой чаше
    public int rightWeight; // Вес на правой чаше

    // Конструктор класса, устанавливающий вес на чашах по умолчанию
    public balance() {
        leftWeight = 0;
        rightWeight = 0;
    }

    // Метод для добавления веса на левую чашу
    public void addLeft(int weight) {
        leftWeight += weight;
    }

    // Метод для добавления веса на правую чашу
    public void addRight(int weight) {
        rightWeight += weight;
    }

    // Метод для определения положения чаш
    public void result() {
        if (leftWeight == rightWeight) {
            System.out.println("="); // Вес на чашах одинаковый
        } else if (leftWeight > rightWeight) {
            System.out.println("L"); // Левая чаша перевесила
        } else {
            System.out.println("R"); // Правая чаша перевесила
        }
    }
}


package third_homework;

public class bell {
    private int count; // Счетчик для определения когда нужно вывести "ding" и когда "dong"
    
    public bell() {
        count = 0; // Инициализация счетчика
    }
    
    public void sound() {
        if(count % 2 == 0) { // Если count делится на 2 без остатка
            System.out.println("ding"); // Вывод "ding"
        } else {
            System.out.println("dong"); // Вывод "dong"
        }
        count++; // Увеличение счетчика для следующего вызова
    }
}


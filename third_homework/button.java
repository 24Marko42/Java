package third_homework;

public class button {
    public int clickCount; // Поле для хранения количества нажатий
    
    // Конструктор класса, инициализирует количество нажатий
    public button() {
        clickCount = 0;
    }
    
    // Метод для увеличения количества нажатий, выводит сообщение с текущим числом нажатий
    public void click() {
        clickCount++;
        System.out.println("Button was clicked " + clickCount + " times");
    }
    
    // Метод для получения текущего количества нажатий (для использования вне класса)
    public int getClickCount() {
        return clickCount;
    }
    
    // Метод main для демонстрации работы класса Button
    public static void main(String[] args) {
        button btn = new button(); // Создаем экземпляр класса Button
        btn.click(); // Нажимаем на кнопку (вызов метода click)
        btn.click(); // Еще одно нажатие на кнопку
        System.out.println("Total clicks: " + btn.getClickCount());
    }
}




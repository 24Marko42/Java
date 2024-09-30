package third_homework;

public class table {
    private int rows;
    private int cols;
    private int[][] table;

    public table(int rows, int cols) {
        rows = rows;
        cols = cols;
        table = new int[rows][cols]; // Инициализация двумерной таблицы
    }

    public int getValue(int row, int col) {
        return table[row][col]; // Получение значения из указанной ячейки
    }

    public void setValue(int row, int col, int value) {
        table[row][col] = value; // Установка значения в указанную ячейку
    }

    public int rows() {
        return rows; // Возвращение количества строк
    }

    public int cols() {
        return cols; // Возвращение количества столбцов
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : table) {
            for (int val : row) {
                sb.append(val).append("t"); // Добавление значения с табуляцией
            }
            sb.append("n"); // Переход на новую строку
        }
        return sb.toString(); // Преобразование таблицы в строку
    }

    public double average() {
        double sum = 0;
        for (int[] row : table) {
            for (int val : row) {
                sum += val; // Суммирование всех значений в таблице
            }
        }
        return sum / (rows * cols); // Возвращение среднего арифметического
    }

    // Пример использования класса Table
    public static void main(String[] args) {
        table table = new table(3, 4);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 1, 3);
        table.setValue(2, 3, 4);

        System.out.println("Table contents:");
        System.out.println(table.toString());

        System.out.println("Average value in the table: " + table.average());
        System.out.println("\nNumber of rows: " + table.rows());

    }
}


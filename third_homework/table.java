package third_homework;

public class table {
    private int rows;
    private int cols;
    private int[][] table;

    public table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols; 
        this.table = new int[rows][cols]; // Инициализация двумерной таблицы
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
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sb.append(table[i][j]).append(" "); // Добавление значения с пробелом
            }
            sb.append("  "); // Переход на новую строку
        }
        return sb.toString(); // Преобразование таблицы в строку
    }
    
    public double average() {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum += table[i][j]; // Суммирование каждого значения
            }
        }
        return (double) sum / (rows * cols); // Возвращение среднего арифметического
    }
}

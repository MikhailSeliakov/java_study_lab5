package lab5;

public class Task6Range {
    private int max;
    private int min;

    public Task6Range(int value1, int value2) {
        setValues(value1, value2);
    }

    public void setValues(int value) {
        setValues(value, value);
    }

    public void setValues(int value1, int value2) {
        if (value1 > value2) {
            max = value1;
            min = value2;
        } else {
            max = value2;
            min = value1;
        }
    }

    public void displayValues() {
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void main(String[] args) {
        Task6Range obj = new Task6Range(10, 5);
        obj.displayValues(); // Вывод: Max: 10 | Min: 5

        obj.setValues(8);
        obj.displayValues(); // Вывод: Max: 8 | Min: 8

        obj.setValues(15, 3);
        obj.displayValues(); // Вывод: Max: 15 | Min: 3
    }
}

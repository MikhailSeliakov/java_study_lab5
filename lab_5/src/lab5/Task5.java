package lab5;

public class Task5 {
    private int myField;

    public Task5() {
        setMyField(0); // Инициализация поля значением 0
    }

    public void setMyField(int value) {
        if (value > 100) {
            myField = 100;
        } else {
            myField = value;
        }
    }

    public int getMyField() {
        return myField;
    }

    public static void main(String[] args) {
        Task5 obj = new Task5();

        System.out.println("Initial value: " + obj.getMyField()); // Вывод: Initial value: 0

        obj.setMyField(50);
        System.out.println("Value after setting to 50: " + obj.getMyField()); // Вывод: Value after setting to 50: 50

        obj.setMyField(200);
        System.out.println("Value after setting to 200: " + obj.getMyField()); // Вывод: Value after setting to 200: 100
    }
}

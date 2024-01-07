package lab5;

public class Task3IntegerFields {
    private int field1;
    private int field2;
    public Task3IntegerFields() {
        // Конструктор без аргументов
        field1 = 0;
        field2 = 0;
    }
    public Task3IntegerFields(int value) {
        // Конструктор с передачей одного аргумента
        field1 = value;
        field2 = value;
    }
    public Task3IntegerFields(int value1, int value2) {
        // Конструктор с передачей двух аргументов
        field1 = value1;
        field2 = value2;
    }
    public int getField1() {
        return field1;
    }
    public int getField2() {
        return field2;
    }
    public void setField1(int value) {
        field1 = value;
    }
    public void setField2(int value) {
        field2 = value;
    }
}

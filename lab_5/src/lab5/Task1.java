package lab5;

public class Task1 {
    private static char symbol;
    public static void main(String[] args) {
        setSymbol('b');
        printSymbolInfo();
    }

    public static void setSymbol(char value) {
        symbol = value;
    }

    public static char getSymbolCode() {
        return symbol;
    }

    public static void printSymbolInfo() {
        System.out.println("Символ: " + symbol);
        System.out.println("Код символа: " + (int) getSymbolCode());
    }

}

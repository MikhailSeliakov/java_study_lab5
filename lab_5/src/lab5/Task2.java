package lab5;

public class Task2 {
    private char startSymbol;
    private char endSymbol;
    public Task2(char start, char end) {
        this.startSymbol = start;
        this.endSymbol = end;
    }
    public static void main(String[] args) {
        Task2 task2 = new Task2('A', 'D');
        task2.printSymbolRange();
        task2.setSymbols('B', 'X');
        task2.printSymbolRange();
    }

    public void setSymbols(char start, char end) {
        this.startSymbol = start;
        this.endSymbol = end;
    }

    public void printSymbolRange() {
        for (char symbol = startSymbol; symbol <= endSymbol; symbol++) {
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
}

package lab5;

public class Task4CharacterIntegerFields {
    private char characterField;
    private int integerField;

    public Task4CharacterIntegerFields(int intValue, char charValue) {
        characterField = charValue;
        integerField = intValue;
    }

    public Task4CharacterIntegerFields(double doubleValue) {
        int intValue = (int) doubleValue;
        char charValue = (char) intValue;
        double decimalValue = doubleValue - intValue;

        if (decimalValue >= 0.1) {
            int decimalPart = (int) (decimalValue * 100);
            integerField = decimalPart;
        } else {
            integerField = 0;
        }

        characterField = charValue;
    }

    public static void main(String[] args) {
        int intValue = 65;
        char charValue = 'A';
        Task4CharacterIntegerFields object1 = new Task4CharacterIntegerFields(intValue, charValue);
        System.out.println("Character Field: " + object1.characterField);
        System.out.println("Integer Field: " + object1.integerField);

        double doubleValue = 65.1267;
        Task4CharacterIntegerFields object2 = new Task4CharacterIntegerFields(doubleValue);
        System.out.println("Character Field: " + object2.characterField);
        System.out.println("Integer Field: " + object2.integerField);
    }
}

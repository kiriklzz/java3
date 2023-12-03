package lab4;
enum MyEnum {
    VALUE1,
    VALUE2,
    VALUE3
}
public class lab4 {
    public static void main(String[] args){
        // Пример с использованием byte
        byte byteValue = 2;
        switch (byteValue) {
            case 1:
                System.out.println("Значение равно 1");
                break;
            case 2:
                System.out.println("Значение равно 2");
                break;
            default:
                System.out.println("Значение не равно 1 или 2");
        }

        // Пример с использованием short
        short shortValue = 100;
        switch (shortValue) {
            case 100:
                System.out.println("Значение равно 100");
                break;
            case 200:
                System.out.println("Значение равно 500");
                break;
            default:
                System.out.println("Значение не равно 100 или 500");
        }

        // Пример с использованием int
        int intValue = 3;
        switch (intValue) {
            case 1:
                System.out.println("Значение равно 1");
                break;
            case 3:
                System.out.println("Значение равно 3");
                break;
            default:
                System.out.println("Значение не равно 1 или 3");
        }

        // Пример с использованием char
        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("Значение равно 'A'");
                break;
            case 'B':
                System.out.println("Значение равно 'B'");
                break;
            default:
                System.out.println("Значение не равно 'A' или 'B'");
        }

        // Пример с использованием String
        String stringValue = "Hello";
        switch (stringValue) {
            case "Hello":
                System.out.println("Значение равно 'Hello'");
                break;
            case "World":
                System.out.println("Значение равно 'World'");
                break;
            default:
                System.out.println("Значение не равно 'Hello' или 'World'");
        }
        // Пример с использованием enum
        MyEnum myEnumValue = MyEnum.VALUE2;
        switch (myEnumValue) {
            case VALUE1:
                System.out.println("Значение равно VALUE1");
                break;
            case VALUE2:
                System.out.println("Значение равно VALUE2");
                break;
            case VALUE3:
                System.out.println("Значение равно VALUE3");
                break;
            default:
                System.out.println("Значение не равно VALUE1, VALUE2 или VALUE3");
        }
    }
}

package lab5;

public class lab5 {
    public static void main(String[] args) {
        // Проверка пустая ли командная строка
        if (args.length == 0) {
            System.out.println("clear");
        } else {
            System.out.println("args:");
            for (int i = 0; i < args.length; i++) {
                // Выводим аргументы
                System.out.println("arg " + i + ": " + args[i]);
            }
        }
    }
}

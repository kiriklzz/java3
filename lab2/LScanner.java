package lab2;
import java.util.Scanner;
public class LScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова (для завершения введите '!!'):");

        while (scanner.hasNext()) {
            String word = scanner.next();

            if (word.equalsIgnoreCase("stop")) {
                System.out.println("Программа завершена!");
                break;
            }
            System.out.println("Вы ввели: " + word);
        }

        scanner.close();
    }
}

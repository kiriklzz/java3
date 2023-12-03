package lab1;

public class lab1 {
    public static void main(String[] args) {
        // Использование конструктора строки:
        String str1 = new String("Hello, World!");

        // Прямое присвоение:
        String str2 = "Hello";

        // Метод isEmpty() проверяет, пуста ли строка:
        String emptystr= "";
        System.out.println("Для непустой строки " + str2.isEmpty() + "\nДля пустой строки " + emptystr.isEmpty());

        // Метод charAt() возвращает символ по указанному индексу:
        System.out.println("Первый символ " + str1.charAt(0));

        // Метод length() возвращает длину строки:
        System.out.println("Длина первой строки: " + str1.length());

        // Метод concat() объединяет указанную строку с концом другой строки:
        System.out.println("Обьединение двух строк: " + str1.concat(str2));

        // Метод valueOf() преобразует объект в строковый вид:
        int myNumber = 123;
        System.out.println("Значение от int: " + String.valueOf(myNumber));

        // Метод equals() сравнивает эту строку с другой строкой (true если содержимое одинаково, false если разное) :
        String str3 = "hello";
        String str4 = "Hello";
        System.out.println("Одинаково ли содержимое двух строк? " + str3.equals(str4));

        // Метод equalsIgnoreCase() сравнивает эту строку с другой строкой, игнорируя регистр:

        System.out.println("Игнорируя регистр получим: " + str3.equalsIgnoreCase(str4));

        // Метод indexOf() находит индекс первого вхождения подстроки в строку:
        System.out.println("индекс первого вхождения подстроки \"o\" в строку: " + str1.indexOf("o"));

        // Метод lastIndexOf() находит индекс последнего вхождения подстроки в строку:
        System.out.println("индекс последнего вхождения подстроки \"o\" в строку: " + str1.lastIndexOf("o"));

        // Метод startsWith() определяет, начинается ли строка с подстроки:
        System.out.println("Начинается ли строка с  \"Hello\"? " + str1.startsWith("Hello"));

        // Метод endsWith() определяет, заканчивается ли строка на определенную подстроку:
        System.out.println("Заканчивается ли строка с \"!\"? " + str2.endsWith("!"));

        // Метод replace() заменяет в строке одну подстроку на другую:
        System.out.println("Заменяет все 'l' символы на 'qwerty': " + str1.replace("l", "qwerty"));

        // Метод trim() удаляет начальные и конечные пробелы:
        String str5 = "     hi!    ";
        System.out.println("Убранные пробелы в строке: \"" + str3.trim() + "\"");

        // Метод substring() возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса:
        System.out.println("Строка начиная с 8 индекса: " + str1.substring(8));

        // Метод join() соединяет строки с учетом разделителя:
        System.out.println("Первая и вторая строка с разделителем '+': " + String.join("+", str1, str2));

        // Метод toLowerCase() переводит все символы строки в нижний регистр:
        System.out.println("Строка в нижнем регистре: " + str1.toLowerCase());

        // Метод toUpperCase() переводит все символы строки в верхний регистр:
        System.out.println("Строка в верхнем регистре: " + str1.toUpperCase());}
}

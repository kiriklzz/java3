package lab8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MetodData {
    public static void main(String[] args) {
        String string = "Hello world!";
        Data(string);
    }

    public static void Data(Object object) {
        Class<?> aClass = object.getClass();
        System.out.println("Название класса:\n" + aClass);

        System.out.println("\nПоля класса: ");
        for (Field filed : aClass.getDeclaredFields()) {
            System.out.println(filed);
        }

        System.out.println("\nРодительский класс:\n" + aClass.getSuperclass());

        System.out.println("\nМетоды класса: ");
        for (Method method : aClass.getDeclaredMethods()) {
            System.out.println(method);
        }

        System.out.println("\nКонструкторы класса: ");
        for (Constructor constructor : aClass.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
    }
}
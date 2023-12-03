package lab9;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class ReflectionClass {
    public static void main(String[] args) {
        performMethod(lab9.class.getName(), "print");
    }

    public static void performMethod(String name, String method) {
        try {
            Class<?> aClass = Class.forName(name);
            Object currentObject = (Object) aClass.newInstance();
            Method currentMethod = aClass.getDeclaredMethod(method);
            currentMethod.invoke(currentObject);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}

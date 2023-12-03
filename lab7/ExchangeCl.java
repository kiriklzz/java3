package lab7;

public class ExchangeCl<T> {
    private T value;

    public ExchangeCl(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static <T> void swap(ExchangeCl<Wrapper<T>> obj1, ExchangeCl<Wrapper<T>> obj2) {
        Wrapper<T> value1 = obj1.getValue();
        Wrapper<T> value2 = obj2.getValue();

        Wrapper<T> temp = new Wrapper<>(value1.get());
        value1.set(value2.get());
        value2.set(temp.get());
    }


    public static void main(String[] args) {
        ExchangeCl<Wrapper<Integer>> obj1 = new ExchangeCl<>(new Wrapper<>(7));
        ExchangeCl<Wrapper<Integer>> obj2 = new ExchangeCl<>(new Wrapper<>(66));

        System.out.println("Значения до обмена:");
        System.out.println("obj1: " + obj1.getValue().get());
        System.out.println("obj2: " + obj2.getValue().get());

        swap(obj1, obj2);

        System.out.println("\nЗначения после обмена:");
        System.out.println("obj1: " + obj1.getValue().get());
        System.out.println("obj2: " + obj2.getValue().get());
    }
}

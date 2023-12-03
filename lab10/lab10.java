package lab10;

public class lab10 {
    public static void print(Triple<?> instance)
    {
        try
        {
            System.out.println("Min: " + instance.min());
            System.out.println("Max: " + instance.max());
            System.out.println("Mean: " + instance.mean());
        }
        catch (RuntimeException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {

        Triple<Integer> intT = new Triple<>(6, 5, 5);
        print(intT);

    }
}

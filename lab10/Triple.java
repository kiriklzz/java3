package lab10;

public class Triple<T> {

    private T first;

    private T second;

    private T third;
    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setThird(T third) {
        this.third = third;
    }
    public T min() {
        if (first instanceof Comparable && second instanceof Comparable && third instanceof Comparable) {
            T min = first;
            if (((Comparable<T>) second).compareTo(min) < 0)
                min = second;
            if (((Comparable<T>) third).compareTo(min) < 0)
                min = third;
            return min;
        } else {
            throw new RuntimeException("Impossible to calculate min");
        }
    }

    public T max() {
        if (first instanceof Comparable && second instanceof Comparable && third instanceof Comparable) {
            T max = first;
            if (((Comparable<T>) second).compareTo(max) > 0)
                max = second;
            if (((Comparable<T>) third).compareTo(max) > 0)
                max = third;
            return max;
        } else {
            throw new RuntimeException("Impossible to calculate max");
        }
    }

    public double mean() {
        if (first instanceof Number && second instanceof Number && third instanceof Number) {
            return (((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue()) / 3;
        } else {
            throw new RuntimeException("Impossible to calculate mean");
        }
    }

    public void print() {
        System.out.println("Triple {" + "first = " + first + ", second = " + second + ", third = " + third + '}');
    }


}

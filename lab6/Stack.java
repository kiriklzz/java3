package lab6;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Stack<T> {
    private ArrayList<T> data;
    private int top;

    public Stack() {
        this.data = new ArrayList<>();
        this.top = 0;
    }

    public void push(T element) {
            data.add(element);
            top += 1;
    }

    public T pop() {
        if (top == 0) {
            System.err.println("Стек пуст");
            throw new NoSuchElementException("Стек пуст");
        } else {
            top -= 1;
            return data.remove(top);
        }
    }
    public T peek() {
        if (top == 0) {
            throw new NoSuchElementException("Стек пуст");
        } else {
            return data.get(top - 1);
        }
    }
    public void printStack() {
        if (top == 0) {
            System.out.println("Стек пустой");
        } else {
            System.out.print("Стек: ");
            for (int i = 0; i < top; i++) {
                System.out.print(data.get(i) + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();

        stack.pop();
        System.out.println("Верхний элемент стека после удаления элемента: " + stack.peek());
    }
}
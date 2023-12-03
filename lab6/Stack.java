package lab6;

import java.lang.reflect.Array;

public class Stack<T> {
    public Stack(int maxSize) {
        data = (T[]) new Object[maxSize];
        this.maxSize = maxSize;
        top = 0;
    }

    public void push(T element) {
        if (top == maxSize) {
        } else {
            data[top] = element;
            top += 1;
        }
    }

    public T pop() {
        if (top == 0) {
            return null;
        } else {
            top -= 1;
            return data[top];
        }
    }

    public T peek() {
        if (top == 0) {
            return null;
        } else {
            return data[top - 1];
        }
    }
    public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i < top; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> Stack = new Stack<>(7);

        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.printStack();

        Stack.pop();
        System.out.println("Верхний элемент стека после удаления элемента: " + Stack.peek());
    }

    private T[] data;
    private final int maxSize;
    private int top;
}
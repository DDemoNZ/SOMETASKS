package impl.stack;

public class StackOnGenerics<T> {

    private T[] stack;
    private int top;
    private int capacity;

    public StackOnGenerics(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity];
        this.top = -1;
    }

    public void push(T elem) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        stack[++top] = elem;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return stack[top--];
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity;
    }

}

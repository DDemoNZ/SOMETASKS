package impl.stack;

public class StackOnNode<T> {

    private Node<T> head;
    private int capacity;
    private int top;

    public StackOnNode(int capacity) {
        this.head = new Node<>();
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(T elem) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        Node<T> newNode = new Node<>(elem, head);
        head = newNode;
        top++;
    }

    public T pop() {
        if (!isEmpty()) {
            T elem = head.elem;
            head = head.next;
            top--;
            return elem;
        }
        return null;
    }

    public T peek() {
        if (!isEmpty()) {
            return head.elem;
        }
        return null;
    }

    public boolean isFull() {
        return top == capacity;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private static class Node<T> {
        private T elem;
        private Node<T> next;

        public Node() {
        }

        public Node(T elem, Node<T> next) {
            this.elem = elem;
            this.next = next;
        }
    }

}

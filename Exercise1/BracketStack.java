/**
 * BracketStack.java
 *
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        2026-10-26
 */
public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }

        char value = top.data;
        top = top.next;
        return value;
    }

    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

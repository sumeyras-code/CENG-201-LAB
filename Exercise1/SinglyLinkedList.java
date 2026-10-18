/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Name:        Sümeyra Şanlı
 * Student ID:  220446023
 * Date:        18.10.2026
 */
public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        int middleIndex = count / 2;
        current = head;
        for (int index = 0; index < middleIndex; index++) {
            current = current.next;
        }

        return current;
    }

    public Node getHead() {
        return head;
    }
}

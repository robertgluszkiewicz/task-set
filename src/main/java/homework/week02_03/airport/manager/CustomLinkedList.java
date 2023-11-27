package homework.week02_03.airport.manager;

public class CustomLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    boolean empty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    void clear() {
        head = null;
        size = 0;
    }

    @Override
    public String toString() {
        String s = "[";
        Node<T> currentNode = head;

        if (currentNode == null)
            return s + "]";

        while (currentNode.next != null) {
            s += currentNode.data + ", ";
            currentNode = currentNode.next;
        }
        s += currentNode.data;
        return s + "]";
    }
}

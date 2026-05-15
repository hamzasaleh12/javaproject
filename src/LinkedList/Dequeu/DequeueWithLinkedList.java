package LinkedList.Dequeu;

public class DequeueWithLinkedList {
    private DoubledNode first;
    private DoubledNode last;

    public DequeueWithLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        DoubledNode newNode = new DoubledNode(data);
        if (isEmpty()) {
            last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
        }
        first = newNode;
    }

    public void insertLast(int data) {
        DoubledNode newNode = new DoubledNode(data);
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.prev = last;
            last.next = newNode;
        }
        last = newNode;
    }

    public int deleteFirst() {
        if (isEmpty()) return -1;

        int temp = first.data;
        if (first.next == null) {
            last = null;
            first = null;
        } else {
            first = first.next;
            first.prev = null;
        }
        return temp;
    }

    public int deleteLast() {
        if (isEmpty()) return -1;

        int temp = last.data;
        if (last.prev == null) {
            first = null;
            last = null;
        } else {
            last = last.prev;
            last.next = null;
        }
        return temp;
    }

    public int peekFirst() {
        return (isEmpty()) ? -1 : first.data;
    }

    public int peekLast() {
        return (isEmpty()) ? -1 : last.data;
    }
}
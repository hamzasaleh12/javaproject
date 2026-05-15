package LinkedList.stack_and_queue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void offer(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) front = newNode;
        else rear.next = newNode;

        rear = newNode;
    }

    public int poll() {
        if (isEmpty()) return -1;

        int temp = front.data;
        front = front.next;

        if (front == null) rear = null;

        return temp;
    }

    public int peek() {
        if(isEmpty()) return -1;
        else return front.data;
    }
}
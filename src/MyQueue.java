public class MyQueue {
    private int[] queueArray;
    private int front = 0;
    private int rear = -1;
    private int nItems = 0;
    private int size;

    public MyQueue(int size) {
        this.size = size;
        this.queueArray = new int[size];
    }
    public MyQueue() {
        this.size = 10;
        this.queueArray = new int[size];
    }

    public void offer(int value) {
        if (rear == size - 1) rear = -1; // Circular Queue
        queueArray[++rear] = value;
        nItems++;
    }

    public int poll() {
        int temp = queueArray[front++];
        if (front == size) front = 0;
        nItems--;
        return temp;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for(int i = front; i <= nItems ; i++){
            str.append(queueArray[i]).append(" ");
        }
        return "{ " + str + "}";
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == size;
    }
}
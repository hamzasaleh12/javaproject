package Array.Deque;

public class QueueFromDeque {
    DequeueWithArray dq;
    public QueueFromDeque(int size){
        dq = new DequeueWithArray(size);
    }

    public void offer(String word){
        dq.insertLast(word);
    }

    public void poll(){
        dq.deleteFirst();
    }

    public String peek(){
        return dq.peek();
    }

}

package Array.Deque;

public class StackFromDeque {
    DequeueWithArray dq;
    public StackFromDeque(int size){
            dq = new DequeueWithArray(size);
    }

    public void push(String word){
        dq.insertLast(word);
    }

    public String pop(){
        String last = dq.deleteLast();
        return last;
    }

    public String peek(){
        String last = dq.peek();
        return last;
    }

    public void reverse(){
        while (!dq.isEmpty()){
            System.out.println(pop());
        }
    }
}

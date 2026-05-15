package Array.Deque;

public class DequeueWithArray {
    private String[] arr;
    private int size;
    private int nElements = 0;
    private int top = -1;
    private int tail = 0;

    public DequeueWithArray(int size){
        this.size = size;
        this.arr = new String[size];
    }

    public boolean isEmpty(){
        return nElements == 0;
    }
    public boolean isFull(){
        return nElements == size;
    }

    public void insertLast(String word){
        if(isFull()) return;
        arr[++top] = word;
        nElements++;
    }

    public String peek(){return arr[top];}

    public String deleteLast(){
        if(isEmpty()) return null;
        String temp = arr[top--];
        nElements--;
        return temp;
    }

    public String deleteFirst(){
        if(isEmpty()) return null;
        String temp = arr[tail++];

        nElements--;

        return temp;
    }
}

public class StackArray {
    private int[] arrayStack;
    private int top = -1;
    private int size;

    public StackArray(int size) {
        this.size = size;
        this.arrayStack = new int[size];
    }

    public StackArray() {
        this.size = 10;
        this.arrayStack = new int[size];
    }

    public void push(int val){
        if(isFull()) return;
        arrayStack[++top] = val;
    }

    public int pop(){
        if(isEmpty()) return -1;
        return arrayStack[top--];
    }

    public int peek(){
        if(isEmpty()) return -1;
        return arrayStack[top];
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <= top ; i++){
            sb.append(arrayStack[i]).append(" ");
        }
        return "{ " + sb + "}";
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size -1 ;
    }
}

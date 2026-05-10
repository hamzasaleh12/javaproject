public class Hashing {
    int size;
    int[] arr;

    public Hashing(int size){
        this.size = size;
        this.arr = new int[size];
    }

    public int hash(int val){
        return val % size;
    }

    public void insert(int val){
        int index = hash(val); // 0 , 2

        while(arr[index] != 0){
            index++;
            hash(index);
        }

        arr[index] = val;
    }

    public boolean isFound(int val){
        int index = hash(val);

        while(arr[index] != val){
            if(arr[index] == 0) return false;
            index++;
            hash(index);
        }

        return true;
    }

    static void main() {
        System.out.println("hellow");
    }
}

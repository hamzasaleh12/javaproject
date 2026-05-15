package Array.array_and_sorting;

public class Array {
    int[] arr;
    int size;
    int nElements = 0;

    public Array(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void insert(int num){
        if(nElements <= size - 1){
            arr[nElements++] = num;
        }
    }

    public int search1(int value){
        int low = 0;
        int high = nElements - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == value) return mid;
            else if (arr[mid] > value) high = mid - 1;
            else low = mid + 1;

        }
        return -1;
    }

    public int search2(int value){
        return recSearch(0,nElements,value);
    }
    // time = o(log(n))
    public int recSearch(int start , int end ,int value){
        if(start > end) return -1; // not found
        else{
            int mid = (start + end) / 2;

            if(arr[mid] == value) return mid;
            else if(arr[mid] > value) return recSearch(start , mid -1 , value);
            else return recSearch(mid + 1 , end , value);
        }
    }

    public int delete(int value){
        int target = search1(value);
        if(target != -1){
            for(int i = target; i < nElements - 1 ;i++){
                arr[i] = arr[i + 1];
            }
            nElements--;
        }
        return target;
    }
}

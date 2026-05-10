public class HighArray {
    private int[] array;
    private int size;
    private int nElements = 0;

    public HighArray(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void insert(int num){
        if(nElements <= size - 1){
            array[nElements++] = num;
        }
    }

    public int search(int value){
        int low = 0;
        int high = nElements - 1;
        insertionSort();

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == value) return mid;
            else if (array[mid] > value) high = mid - 1;
            else low = mid + 1;

        }
        return -1;
    }

    // time = o(log(n)) , space = o(log(n))
    public int recSearch(int start , int end ,int value){
        // assume array is sorted
        if(start > end) return -1; // not found
        else{
            int mid = (start + end) / 2;

            if(array[mid] == value) return mid;
            else if(array[mid] > value) return recSearch(start , mid -1 , value);
            else return recSearch(mid + 1 , end , value);
        }
    }

    public int delete(int value){
        int target = search(value);
        if(target != -1){
            for(int i = target; i < nElements - 1 ;i++){
                array[i] = array[i + 1];
            }
            nElements--;
        }
        return target;
    }

    public void display(){
        System.out.print("[");
        for(int i = 0 ; i< nElements ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public void bubbleSort() {
        for(int out = nElements - 1;out >= 1 ; out--){
            for (int in = 0;in < out ; in++){
                if(array[in] > array[in + 1]){
                    swap(in,in+1);
                }
            }
        }
    }

    public void selectionSort() {
        int min;
        for(int out = 0;out<nElements;out++){
            min = out;
            for(int in = out+1;in<nElements;in++){
                if(array[min] > array[in]){
                    min = in;
                }
            }
            swap(min,out);
        }
    }

    public void insertionSort() {
        int in;
        for (int out = 1 ; out < nElements ; out++){
            int temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp){
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
    }

    public void mergeSort(){
        recMergeSort(array);
    }

    private void recMergeSort(int[] array){
        if(array.length == 1) return;

        int mid = array.length / 2;

        int[] leftArr = new int[mid];
        int[] rightArr = new int[array.length - mid];

        for(int i = 0 ; i < array.length ; i++){
            if(i < mid){
                leftArr[i] = array[i];
            } else{
                rightArr[i - mid] = array[i];
            }
        }

        recMergeSort(leftArr);
        recMergeSort(rightArr);
        merge(array , leftArr , rightArr);
    }

    private void merge(int[] array, int[] leftArr, int[] rightArr) {
        int i = 0 , l = 0 , r = 0;
        while(l < leftArr.length && r < rightArr.length){
            if(leftArr[l] < rightArr[r]){
                array[i++] = leftArr[l++];
            } else{
                array[i++] = rightArr[r++];
            }
        }
        while(l < leftArr.length) array[i++] = leftArr[l++];
        while (r < rightArr.length) array[i++] = rightArr[r++];
    }

    private void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}

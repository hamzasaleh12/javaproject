package Final2025.Q1;

public class Array {
    private int[] arr;
    private int size;
    private int nElements;

    public Array(int size){
        this.size = size;
        this.arr = new int[size];
    }

    public void insert(int data) {
        arr[nElements++] = data;
    }

    public void recMergeSort(int[] arr){
        if(arr.length == 1) return;
        int mid = arr.length / 2;

        int[] leftArr = new int[mid];
        int[] rightArr = new int[arr.length - mid];

        for(int i = 0 ; i < arr.length ; i++){
            if(i < mid){
                leftArr[i] = arr[i];
            } else{
                rightArr[i - mid] = arr[i];
            }
        }

        recMergeSort(leftArr);
        recMergeSort(rightArr);

        merge(leftArr , rightArr , arr);
    }

    private void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int l = 0 , r = 0 , i = 0;
        while (l < leftArr.length && r < rightArr.length){
            if(leftArr[l] < rightArr[r]){
                arr[i] = leftArr[l];
                l++;
            } else{
                arr[i] = rightArr[r];
                r++;
            }
            i++;
        }

        while (l < leftArr.length) arr[i++] = leftArr[l++];
        while (r < rightArr.length) arr[i++] = rightArr[r++];
    }

    int idx;
    public int binarySearch(int[] arr , int tar){
        // assume array is sorted
        recBinarySearch(0 , arr.length, arr , tar);
        return idx;
    }
    public void recBinarySearch(int low , int high , int[] arr , int tar){
        int mid = (low + high) / 2;
        if(low > high) idx = -1;
        if(arr[mid] == tar) idx = mid;

        if(arr[mid] > tar){
            recBinarySearch(low , mid - 1 , arr , tar);
        } else{
            recBinarySearch(low , mid - 1 , arr , tar);
        }
    }
}

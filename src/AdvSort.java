public class AdvSort {
    public static void mergeSort(int[] arr){
        if(arr.length == 1) return; // Base case

        int mid = arr.length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[arr.length - mid];

        for (int i = 0; i < arr.length; i++) {
            if(i < mid) {
                leftArr[i] = arr[i];
            } else{
                rightArr[i - mid] = arr[i];
            }
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(arr, leftArr , rightArr);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int l = 0, r = 0 , i = 0;
        while(l < leftArr.length && r < rightArr.length){
            if(leftArr[l] < rightArr[r]){
                arr[i] = leftArr[l];
                i++;
                l++;
            } else{
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while (l < leftArr.length) arr[i++] = leftArr[l++];
        while (r < rightArr.length) arr[i++] = rightArr[r++];
    }


    public static void quickSort(int[] arr) {
        recQuickSort(arr,0,arr.length - 1);
    }
    private static void recQuickSort(int[] arr, int start, int end) {
        if(start >= end) return; // base case

        int pivot = partition(arr , start , end);
        recQuickSort(arr , start , pivot - 1); // left side
        recQuickSort(arr , pivot + 1 , end); // right side
    }

    private static int partition(int[] arr, int start, int end) {
        int i = start - 1;
        int pivot = arr[end];

        for(int j = start ; j < end ; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }

}

package Array.array_and_sorting;

public class SimpleSort extends Array {

    public SimpleSort(int size) {
        super(size);
    }

    public void bubbleSort() {
        for (int out = nElements - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    public void selectionSort() {
        for (int out = 0; out < nElements; out++) {
            int min = out;
            for (int in = out + 1; in < nElements; in++) {
                if (arr[min] > arr[in]) {
                    min = in;
                }
            }
            swap(min, out);
        }
    }

    public void insertionSort() {
        for (int out = 1; out < nElements; out++) {
            int temp = arr[out];
            int in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }
    }

    private void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}

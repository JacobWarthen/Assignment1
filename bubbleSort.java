public class bubbleSort {
    private void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public double[] bubblesort(double[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1])
                    swap(arr, i, i + 1);
            }
        }
        return arr;
    }
}

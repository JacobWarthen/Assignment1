public class selectionSort {
    private void swap(double[] arr, int i, int j){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int findSmallest(double[] arr, int start){
        int smallest = start;
        for (int i = start+1; i < arr.length; i++) {
            if(arr[i]<arr[smallest])
                smallest = i;
        }
        return smallest;
    }

    public double[] selectionsort(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, findSmallest(arr,i));
        }
        return arr;
    }
}

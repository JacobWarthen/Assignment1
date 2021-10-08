public class quickSort {
    private int partition(double[] arr, int left, int right) {
        double pivot = arr[right];
        int i = (left - 1);
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

        private void swap ( double[] arr, int i, int j){
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public double[] quicksort ( double[] arr, int bot, int top){
            if (bot < top) {
                int x = partition(arr, bot, top);
                quicksort(arr, bot, x - 1);
                return quicksort(arr, x + 1, top);
            } else
                return arr;
        }
}

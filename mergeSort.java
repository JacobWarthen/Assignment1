public class mergeSort {
    private double[] get_left(double[] arr){          //returns left side of given array
        int size = arr.length/2;
        double[] left = new double[size];
        for(int i = 0; i < size; i++) {
            left[i] = arr[i];
        }
        return left;
    }

    private double[] get_right(double[] arr) {       //returns right side of given array
        int size = (arr.length/2)+(arr.length%2);
        double[] right = new double[size];
        int j=0;
        for (int i = arr.length/2; i < arr.length&&j<right.length; i++) {
            right[j++] = arr[i];
        }
        return right;
    }
    public double[] mergesort(double[] arr){        //recursively sorts the given array
        if(arr.length>1) {
            double[] left = get_left(arr);
            double[] right = get_right(arr);
            mergesort(left);
            mergesort(right);
            return merge(arr, left, right);
        }else
            return null;
    }
    private double[] merge(double[] arrMain, double[] left, double[] right){         //merges and sorts the left and right arrays
        int im=0, li=0, ri=0;
        while(im<arrMain.length){
            if(li==left.length) {
                arrMain[im++] = right[ri++];
            }else if(ri==right.length){
                arrMain[im++] = left[li++];
            }else if(left[li]<right[ri]){
                arrMain[im++] = left[li++];
            }else
                arrMain[im++] = right[ri++];
        }
        return arrMain;
    }

    public static void main(String[] args) {
        mergeSort merges = new mergeSort();
        double[] x = {1,5,2,5,6};
        merges.mergesort(x);
    }
}

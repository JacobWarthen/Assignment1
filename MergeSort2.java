import java.util.Arrays;

public class MergeSort2 {

        public double[] mergesort2(double[] arr){
            double[][] regions = sortedRegions(arr);//recursively sorts the given array
            if(checkSort(arr)){
                return arr;
            }else if(regions.length>0){
                mergesort2(merge(arr, regions[0], regions[1]));
            }
            return arr;
        }
        private double[] merge(double[] arrMain, double[] left, double[] right){         //merges and sorts the left and right arrays
            int im=0, li=0, ri=0;
            while(im<arrMain.length){
                if(li==left.length&&ri==right.length){
                    return arrMain;
                }else if(li==left.length) {
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



        private double[][] sortedRegions(double[] arr){
            int counter = 1;
            for (int i=0;i<arr.length-1;i++) {
                if(arr[i+1]>=arr[i])
                    continue;
                else
                    counter++;
            }
            double[][] x = new double[counter][arr.length];
            int count=0;
            double[] sub = new double[10];
            int start = 0;
            for (int i=0;i<arr.length-1;i++) {
                if(i==arr.length-2){
                    sub = Arrays.copyOfRange(arr,start,i+2);
                    x[count++] = sub;
                }

                if(arr[i+1]>=arr[i])
                    continue;
                else
                    sub = Arrays.copyOfRange(arr,start,i+1);
                    x[count++] = sub;
                    start = i+1;
            }
            return x;
        }

    private boolean checkSort(double[] arr){
        boolean sorted=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
                sorted = false;
        }
        return sorted;
    }

        public static void main(String[] args) {
        //    MergeSort2 merge2 = new MergeSort2();
        //    double[] u = {7,8,9,4,5,6,1,2,3,1,2,3};
        //    double[] sorted = merge2.mergesort(u);
        //    for (int i = 0; i < sorted.length; i++) {
        //        System.out.print(sorted[i]+", ");
        //    }
           // double[][] regions = merge2.sortedRegions(u);
           // for (int i = 0; i < regions[i].length; i++) {
            //    for (int j = 0; j < regions[i].length; j++) {
            //        System.out.println(regions[i][j]);
            //    }
           // }
           // System.out.println(Arrays.deepToString(regions));
        }
    }



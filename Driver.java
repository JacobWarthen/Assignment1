import java.util.Random;
import java.lang.*;
public class Driver {
    public static void main(String[] args) {
        Driver driver = new Driver();
        int test = 13000;                                   //array size that was tested
        double[] g = driver.randArray(test);
        //bubbleSort bubble = new bubbleSort();             //commented in and out the algorithms I wanted to test
        //selectionSort selection = new selectionSort();
        //insertionSort insertion = new insertionSort();
        //quickSort quick = new quickSort();
        //mergeSort merge = new mergeSort();
        MergeSort2 merge2 = new MergeSort2();

        long startTime = System.currentTimeMillis();

        //double[] y = merge.mergesort(g);                   //commented in and out the algorithms I wanted to test
        //double[] y = bubble.bubblesort(g);
        //double[] y = selection.selectionsort(g);
        //double[] y = insertion.insertionsort(g);
        //double[] y = quick.quicksort(g,0,test-1);
        double[] y = merge2.mergesort2(g);

        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;

        //for (int i = 0; i < y.length; i++) {
        //    System.out.print(y[i] + ", ");
        //}

        System.out.println("Time elapsed: " + timeElapsed);
        if(driver.checkSort(y))
            System.out.println("Sorted");
        else
            System.out.println("Not sorted");
    }

    private double[] randArray (int length){                 //creates random array
        double[] arr = new double[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(length);
        }
        return arr;
    }

    private boolean checkSort(double[] arr){                 //checks if sorted
        boolean sorted=true;
        for (int i = 0; i < arr.length-1; i++) {
           if(arr[i]>arr[i+1])
               sorted = false;
        }
        return sorted;
    }



}


package recursion;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {2,6,1,7,9,4,8,0,5,1,4};

        quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {

        if(start >= end) {
            return;
        }

        int pIdx = partition(arr, start, end);

        quickSort(arr, start, pIdx - 1);
        quickSort(arr, pIdx + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[start];

        int smallIdx = start+1;

        for (int i=start + 1; i<= end; i++) {
            if(arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[smallIdx];
                arr[smallIdx] = temp;
                smallIdx++;
            }
        }

        int temp = arr[start];
        arr[start] = arr[smallIdx - 1];
        arr[smallIdx - 1] = temp;

        return smallIdx-1;
    }

}

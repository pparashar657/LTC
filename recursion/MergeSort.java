package recursion;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {2,6,1,7,9,4,8};

        mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start, j = mid + 1;
        int k = start;

        int[] ans = new int[arr.length];

        while(i<= mid && j <= end) {
            if(arr[i] < arr[j]) {
                ans[k++] = arr[i++];
            } else if(arr[j] < arr[i]){
                ans[k++] = arr[j++];
            } else {
                ans[k++] = arr[i++];
                ans[k++] = arr[j++];
            }
        }

        while(i<= mid) {
            ans[k++] = arr[i++];
        }

        while(j <= end) {
            ans[k++] = arr[j++];
        }

        for(i = start; i<= end; i++) {
            arr[i] = ans[i];
        }

    }

}

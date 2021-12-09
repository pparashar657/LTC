package arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = ArrayDemo.takeArrayInput();
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void selectionSort(int[] arr) {
		
		int n = arr.length;
		
		for (int i=0;i<n;i++) {
			
			int minIdx = i;
			
			for (int j = i + 1; j < n;j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
			
			System.out.println("Array after pass " + i);
			System.out.println(Arrays.toString(arr));
			
		}
		
	}

}

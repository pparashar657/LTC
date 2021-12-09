package arrays;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = ArrayDemo.takeArrayInput();
		
		insertionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void insertionSort(int[] arr) {
		
		int n = arr.length;
		
		for (int i = 1; i<n;i++) {
			int target = arr[i];
			
			int temp = i;
			
			while(temp > 0 && target < arr[temp-1]) {
				arr[temp] = arr[temp-1];
				temp--;
			}
			
			arr[temp] = target;
			
			System.out.println("Array after pass " + i);
			System.out.println(Arrays.toString(arr));
			
		}
		
	}

}

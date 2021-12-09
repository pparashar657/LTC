package arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = ArrayDemo.takeArrayInput();
		
		bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void bubbleSort(int[] arr) {
		
		int n = arr.length;
		boolean isSorted;
		
		for (int i=1;i<n;i++) {
			isSorted = true;
			for(int j=0; j< n-i ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					isSorted = false;
				}
			}
			System.out.println("Array after pass " + i);
			System.out.println(Arrays.toString(arr));
			if (isSorted) {
				break;
			}
		}
		
	}

}

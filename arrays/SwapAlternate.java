package arrays;

import java.util.Arrays;

public class SwapAlternate {

	public static void main(String[] args) {
		
		int[] arr = ArrayDemo.takeArrayInput();
		
		swapAlternate(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void swapAlternate(int[] arr) {
		for (int i =0; i<arr.length - 1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}

}

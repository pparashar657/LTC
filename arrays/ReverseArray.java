package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = ArrayDemo.takeArrayInput();
		
		//reverseArray1(arr);
		reverseArray2(arr);
		
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void reverseArray2(int[] arr) {
		for (int i=0,j=arr.length-1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	private static void reverseArray1(int[] a) {
		int[] temp = new int[a.length];
		
		for(int i = a.length - 1, j = 0; i > -1; i--,j++) {
			temp[j] = a[i];
		}
		//System.out.println(Arrays.toString(temp));
		for(int i = 0; i < a.length; i++) {
			a[i] = temp[i];
		}
	}

}

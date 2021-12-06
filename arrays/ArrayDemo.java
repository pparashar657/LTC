package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// Dynamic initialization
//		int[] arr = new int[5];
//		
//		System.out.println(arr);
//		
//		arr[0] = 1;
//		
//		System.out.println(arr[0]);
//		
//		arr[1] = 10;
//		
//		arr[2] = arr[0] + arr[1];
//		
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		
//		//char[] ch = new char[5];
//		
//		
//		// Print all elements of arr
//		
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println(arr.length);
//		
//		arr = new int[3];
//
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("My new arr ");
//		
//		int[] myArr = {2,5,1,6,7,9,3,4};
//		
//		System.out.println(myArr.length);
//		
//		for (int i=0;i<myArr.length;i++) {
//			System.out.println(myArr[i]);
//		}
		
		int[] arr = takeArrayInput();
		
//		System.out.println("The array elements are : ");
		
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//System.out.println(Arrays.toString(arr));
		
		// For Each loop
//		for (int ankit: arr) {
//			System.out.println(ankit);
//		}
		
		
		printDetails(arr);
		
	}

	private static void printDetails(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double sum = 0;
		double avg;
		
		for (int ele : arr) {
			min = Math.min(min, ele);
			
//			if (ele < min) min = ele;
//			
//			min = (ele < min) ? ele : min;
			
			max = Math.max(max, ele);
			
			sum += ele;	
		}
		avg = sum / arr.length;
		
		System.out.println("The max of array is : " + max);
		System.out.println("The min of array is : " + min);
		System.out.println("The sum of array is : " + sum);
		System.out.println("The avg of array is : " + avg);
	}

	public static int[] takeArrayInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements : ");
		
		for (int i=0;i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}

}

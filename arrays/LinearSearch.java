package arrays;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[] = ArrayDemo.takeArrayInput();
		int target = 41;
		
		boolean ans = linearSearch(arr, target);
		
		if (ans) {
			System.out.println("Element is present is array.");
		} else {
			System.out.println("Element is absent in array.");
		}
		
	}

	private static boolean linearSearch(int[] arr, int target) {
		for(int ele: arr) {
			if (ele == target) return true;
		}
		return false;
	}
	
	/*
	 
	 private static void linearSearch(int[] arr, int target) {
		boolean isFound = false;
		for(int ele: arr) {
			if (ele == target) {
				isFound = true;
				break;
			}
		}
		if(isFound) {
			System.out.println("Element is present is array.");
		} else {
			System.out.println("Element is absent in array.");
		}
	}
	 
	 */

}

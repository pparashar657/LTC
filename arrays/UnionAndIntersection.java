package arrays;

import java.util.Arrays;

public class UnionAndIntersection {

	public static void main(String[] args) {
		
		int[] arr1 = ArrayDemo.takeArrayInput();
		int[] arr2 = ArrayDemo.takeArrayInput();
		
		
		int[] union = findUnion(arr1, arr2);
		
		//System.out.println(Arrays.toString(union));
		System.out.println(Arrays.toString(findIntersection(arr1, arr2)));
	}
	
	private static int[] findIntersection(int[] arr1, int[] arr2) {
		int intersection[] = new int[Math.min(arr1.length, arr2.length)];
		
		int idx = 0;
		for(int i=0;i<arr2.length;i++) {
			boolean isFound = false;
			
			for(int j=0; j< arr1.length; j++) {
				if(arr1[j] == arr2[i]) {
					isFound = true;
				}
			}
			
			if(isFound) {
				intersection[idx++] = arr2[i];
			}
		}
		
		return intersection;
	}

	private static int[] findUnion(int[] arr1, int[] arr2) {
		int union[] = new int[arr1.length + arr2.length];
		
		for(int i = 0; i < arr1.length; i++) {
			union[i] = arr1[i];
		}
		int idx = arr1.length;
		for(int i=0;i<arr2.length;i++) {
			boolean isFound = false;
			
			for(int j=0; j< arr1.length; j++) {
				if(arr1[j] == arr2[i]) {
					isFound = true;
				}
			}
			
			if(!isFound) {
				union[idx++] = arr2[i];
			}
		}
		
		return union;
	}

}

package arrays;

import java.util.Arrays;

public class MoveNegative {

	public static void main(String[] args) {
		int[] arr = ArrayDemo.takeArrayInput();
		
		moveNegative(arr);
		
		System.out.println(Arrays.toString(arr));

	}

	private static void moveNegative(int[] arr) {
		
		int negIdx = 0;
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[negIdx];
				arr[negIdx] = temp;
				
				negIdx++;
			}
		}	
	}

}

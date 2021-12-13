package arrays;

import java.util.Arrays;
import java.util.Collections;

public class MergeArrays {

	public static void main(String[] args) {
		int[] arr1 = ArrayDemo.takeArrayInput();
		int[] arr2 = ArrayDemo.takeArrayInput();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr1));
		
		int[] union = merge(arr1, arr2);

		System.out.println(Arrays.toString(union));
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		
		int ans[] = new int[n + m];
		
		int i = 0;
		int j = 0;
		int idx = 0;
		
		while(i < n && j < m) {
			if(arr1[i] < arr2[j]) {
				ans[idx++] = arr1[i++];
			} else if (arr2[j] < arr1[i]) {
				ans[idx++] = arr2[j++];
			} else {
				ans[idx++] = arr1[i++];
				j++;
			}
		}
		
		while(i < n) {
			ans[idx++] = arr1[i++];
		}
		
		while(j < m) {
			ans[idx++] = arr2[j++];
		}
		
		return ans;
	}

}

package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = ArrayDemo.takeArrayInput();
		int target = 41;
		
		boolean ans = binarySearch(arr, target);
		System.out.println(ans);
		
	}

	private static boolean binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] == target) {
				return true;
			} else if(arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return false;
	}

}

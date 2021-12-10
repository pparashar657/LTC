package arrays;

public class PrintAllSubArray {

	public static void main(String[] args) {
		int[] arr = ArrayDemo.takeArrayInput();
		
		allSubArray(arr);
	}

	private static void allSubArray(int[] arr) {
		int n = arr.length;
		for (int start = 0; start < n; start++) {
			for (int end = start; end < n ; end++) {
				printArr(arr, start, end);
			}
		}
		
	}

	private static void printArr(int[] arr, int start, int end) {
		
		for(int i= start ; i<=end; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

}

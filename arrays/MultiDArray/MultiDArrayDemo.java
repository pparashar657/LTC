package arrays.MultiDArray;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDArrayDemo {
	
	public static void main(String[] args) {
		
//		int[] arr = new int[4];
//		
//		System.out.println(arr.length);
//		System.out.println(arr[0]);
//		arr[0] = 10;
//		arr[1] = 20;
		
//		int[][] arr = new int[4][];
		
//		System.out.println(arr);
//		System.out.println(arr.length);
//		
//		System.out.println(arr[0]);
//		
//		arr[0] = new int[5];
//		arr[1] = new int[3];
//		
//		
//		System.out.println(arr[0]);
//		
//		System.out.println(arr[0].length);
//		
//		System.out.println(arr[1].length);
//		
//		arr[1][1] = 15;
//		
//		System.out.println(Arrays.toString(arr));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		
		int row = sc.nextInt();
		
		int[][] mat = new int[row][];
		
		for(int i=0;i<row;i++) {
			System.out.println("Enter the number of columns in " + (i+1) +" row : ");
			int col = sc.nextInt();
			
			mat[i] = new int[col];
			
			System.out.println("Enter the values ");
			
			for(int j=0;j<col;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The matrix is");
		
		for(int[] arr: mat) {
			System.out.println(Arrays.toString(arr));
		}
		
//		for(int i=0;i<mat.length;i++) {
//			for(int j=0;j<mat[i].length;j++) {
//				System.out.print(mat[i][j] +" ");
//			}
//			System.out.println();
//		}
//		
		
	}

}

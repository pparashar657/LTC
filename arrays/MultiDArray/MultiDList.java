package arrays.MultiDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDList {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		
		int row = sc.nextInt();
		
		for(int i=0;i<row;i++) {
			System.out.println("Enter the number of columns in " + (i+1) +" row : ");
			int col = sc.nextInt();
			
			ArrayList<Integer> temp = new ArrayList<>();
			
			System.out.println("Enter the values ");
			
			for(int j=0;j<col;j++) {
				temp.add(sc.nextInt());
			}
			
			mat.add(temp);
		}
		
		mat.get(0).add(100);
		ArrayList<Integer> newRow = new ArrayList<>();
		newRow.add(101);
		newRow.add(102);
		newRow.add(103);
		
		mat.add(newRow);
		
		System.out.println("The matrix is");
		
		
		for(int i=0;i<mat.size();i++) {
			for(int j=0;j<mat.get(i).size();j++) {
				System.out.print(mat.get(i).get(j) +" ");
			}
			System.out.println();
		}
		
//		for(ArrayList<Integer> myList : mat) {
//			System.out.println(myList);
//		}
		
		
	}

}

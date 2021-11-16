package introduction;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Marks : ");
		int marks = sc.nextInt();
		char grade = '-';

		if (marks > 90) {
			grade = 'A';
		} else if (marks > 80) {
			grade = 'B';
		} else if (marks > 70) {
			grade = 'C';
		} else if (marks > 60) {
			grade = 'D';
		}
		
		System.out.println("With marks = " + marks + " grade = " + grade);
		
	}

}

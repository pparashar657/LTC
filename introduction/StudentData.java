package introduction;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter your class : ");
		String clas = sc.next();
		
		System.out.println("Enter your Roll No : ");
		String rollNo = sc.next();
		
		System.out.println("Enter your D.O.B : ");
		String dob = sc.next();
		
		System.out.println("Enter your physics marks : ");
		int phy = sc.nextInt();
		
		System.out.println("Enter your Chemistry marks : ");
		int chem = sc.nextInt();
		
		System.out.println("Enter your Maths marks : ");
		int math = sc.nextInt();
		
		int total = phy + chem + math;
		int avg = total / 3;
		
		System.out.println("Name = " + name);
		System.out.println("Class = " + clas);
		System.out.println("Roll No = " + rollNo);
		System.out.println("D.O.B = " + dob);
		System.out.println("Marks Obtained : ");
		System.out.println("Physics = " + phy);
		System.out.println("Chemistry = " + chem);
		System.out.println("Maths = " + math);
		System.out.println("Total marks = " + total);
		System.out.println("Average marks = " + avg);
	}

}

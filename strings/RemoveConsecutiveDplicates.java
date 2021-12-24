package strings;

import java.util.Scanner;

public class RemoveConsecutiveDplicates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string : ");
		String str = sc.next();
		
		String ans = removeDuplicates(str);
		
		System.out.println(ans);
		
	}

	private static String removeDuplicates(String str) {
		str = str + " ";
		String ans = "";
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				ans += str.charAt(i);
			}
		}
		return ans;
	}

}

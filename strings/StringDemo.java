package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {
		
//		String str = "Pawan";
//		
//		System.out.println(str);
//		
//		// Size
//		
//		System.out.println(str.length());
//		
//		
//		// Get char element
//		
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		
//		//System.out.println(str.charAt(-10));
//		
//		// Not allowed
//		//str[0] = 'A';
//		
//		
//		// Appending
//		
//		str = "Aman";
//		
//		str = str + " kumar";
//		
//		System.out.println(str);
//		
//		str = "I am " + str;
//		
//		System.out.println(str);
//		
//		
//		for (int i=0;i<str.length();i++) {
//			System.out.print(str.charAt(i)+":");
//		}
		
//		
//		String str1 = "Hello";
//		
//		String str2 = "Hello";
//		
//		System.out.println(str1 == str2);
		
//		int[] a = new int[2];
//		a[0] = 1;
//		a[1] = 2;
//		
//		int[] b = new int[2];
//		b[0] = 1;
//		b[1] = 2;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		System.out.println(a == b);	
		
//		String str3 = new String("Hello");
//		String str4 = new String("hello");
//		
//		System.out.println("str3 = "+str3);
//		
//		System.out.println(str1 == str3);
//		
//		System.out.println(str3 == str4);
//		
//		// Equality check
//		System.out.println(str1.equals(str3));
//		System.out.println(str4.equals(str3));
//		
//		
//		// Equality without case
//		
//		System.out.println(str4.equalsIgnoreCase(str3));
//		
//		
//		// Comparing
//		
//		System.out.println("Comparing functions");
//		
//		System.out.println("a".compareTo("Z"));
//		
//		System.out.println("a".compareToIgnoreCase("Z"));
//		
//		
//		
//		// Searching
//		
//		List<Integer> list = new ArrayList<>();
//		
//		list.add(1);
//		list.add(2);
//		list.add(13);
//		list.add(2);
//		
//		System.out.println(list.indexOf(21));
//		System.out.println(list.contains(12));
//		
//		
//		String str = "Pawan";
//		
////		System.out.println(str.indexOf("a"));
////		System.out.println(str.contains("a"));
//		
//		System.out.println(str.indexOf("awaa"));
//		System.out.println(str.contains("awaa"));
//		
//		// Starts and ends with
//		
//		str = "Happy Birthday";
//		
//		System.out.println(str.startsWith("Happy"));
//		System.out.println(str.endsWith("day"));
//		
//		
//		// Changing case
//		
//		str = "Pawan";
//		
//		System.out.println(str.toUpperCase());
//		System.out.println(str);
//		
//		System.out.println(str.toLowerCase());
//		System.out.println(str);
//		
//		
//		// Substrings
//		
//		System.out.println(str.substring(3));
//		
//		System.out.println(str.substring(1,5));
//		
//		
//		// Char Array
//		
//		char[] ch = str.toCharArray();
//		
//		System.out.println(Arrays.toString(ch));
//		
//		ch[0] = 'A';
//		
//		String newStr = String.valueOf(ch);
//		
//		System.out.println(newStr);
		
		// Replacing in string
		
//		String str = "Pawan is a good booy.";
//		
//		System.out.println(str.replace("oo","x"));
//		System.out.println(str.replaceAll("oo","x"));
//		
//		
//		System.out.println(str.replaceFirst("oo", "x"));
		
		
		// Check string is empty/ blank
		
//		String str = "     ";
//		
//		System.out.println(str.isEmpty());
//		System.out.println(str.isBlank());
		
		// Concatenation
		
//		String str = "Pawan";
//		String str2 = " Kumar";
//		String str3 = str.concat(str2);
		// Similiar to : str + str2
//	
//		System.out.println(str3);
		
		// Trimming
		
//		String str = "   Pawan   is     ";
//		
//		System.out.println(str.trim());
//		
//		System.out.println(str.strip());
		
		// Spliting
//		
//		String str = "Pawan is a good boy";
//		
//		String[] words = str.split(" ");
//		
//		System.out.println(Arrays.toString(words));
//		
		
		// Joining 
		
		//String ans = String.join("-", "Pawan", "is", "a", "good", "bacha.");
		
//		String ans = String.join("-", words);
//		
//		System.out.println(ans);
//		
	}

}

package introduction;

public class SwitchCase {

	public static void main(String[] args) {
//		int a = 3;
//		
//		switch (a) {
//			case 1: System.out.println("a is 1"); 
//						break;
//			case 2: System.out.println("a is 2");
//						break;
//			case 3: System.out.println("a is 3");
//						break;
//			case 4: System.out.println("a is 4"); 
//						break;
//			case 5: System.out.println("a is 5");
//						break;
//			default: System.out.println("A is default");
//		}
		
		char ch = 'z';
		
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("Character is vowel");
						break;
			default: System.out.println("Character is consonant");
		}
	}

}

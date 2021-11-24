package introduction;

public class BreakContinue {

	public static void main(String[] args) {
//		for (int i=1;i<10;i++) {
//			if (i %2 == 0) {
//				continue;
//			}
//			System.out.println(i);
//			
//		}
//		System.out.println("I am outside loop");

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if (j>3) {
					break;
				}
				System.out.println(i+" "+ j);
			}
		}
	}

}

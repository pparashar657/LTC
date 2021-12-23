package strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Pawan");
//		
//		// StringBuilder -> String
//		String str = sb.toString();
//		
//		System.out.println(sb);
//		System.out.println(str);
//		
//		
//		System.out.println(sb.charAt(0));
//		
//		System.out.println(sb.length());
//		
//		// Inserting value in string builder
//		
//		sb.insert(2, "o");
//		
//		System.out.println(sb);
//		
//		// finding index [Searching]
//		
//		System.out.println(sb.indexOf("z"));
//		
//		// Append
//
//		sb.append("Ok");
//		
//		System.out.println(sb);
//		
//		// Delete 
//		
//		sb.deleteCharAt(2);
//		
//		System.out.println(sb);
//		
//		// Comparison
//		
//		StringBuilder sb2 = sb;
//		
//		System.out.println(sb.equals(sb2));
//		
//		StringBuilder sb3 = new StringBuilder("PawanOk");
//		
//		System.out.println(sb.compareTo(sb3));
//		
//		
		sb.reverse();
		
		System.out.println(sb);
		
		// Efficiency
		
		String str = "";
		
		int count = 5000000;
		
//		long start = System.currentTimeMillis();
//		
//		for(int i=0;i<count;i++) {
//			str = str + " ";
//		}
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println("String time = " + (end - start));
		
//		StringBuilder sb = new StringBuilder();
//		
//		long start = System.currentTimeMillis();
//		
//		for(int i=0;i<count;i++) {
//			sb.append(" ");
//		}
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println("StringBuilder time = " + (end - start));
		
		
		
		
		
		
	}

}

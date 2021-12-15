package arrays;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// Add element
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		list.add(40);
		System.out.println(list);
		
		list.add(2, 50);
		list.add(4, 50);
		
		System.out.println(list);
		
		// Get data
		
		System.out.println(list.get(3));
		//System.out.println(list.get(10));
		
		// Delete data
		
		list.remove(3);
		System.out.println(list);
		
		list.remove(Integer.valueOf(50));
		System.out.println(list);
		
		// Size
		
		System.out.println(list.size());
		
		// Search
		
		System.out.println(list.contains(50));
		
		System.out.println(list.indexOf(50));
		
		// Sorting
		
		Collections.sort(list);
		System.out.println(list);
		
		// Utility
		
		Integer[] a = list.toArray(new Integer[0]);
		System.out.println(Arrays.toString(a));
		
		int a1 = 10;
		Integer b = Integer.valueOf(a1);
		
		Integer[] num = {1,2,3,4,5};
		
		List<Integer> myList = Arrays.asList(num);
		
		System.out.println(myList);
		
	}

}

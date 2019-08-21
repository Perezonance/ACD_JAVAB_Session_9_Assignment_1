package assignment_1;

import java.util.HashMap;

public class HashMapMain {
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(1, "Alex");
		hMap.put(2, "Ben");
		hMap.put(3, "Thomas");
		hMap.put(4, "Lisa");
		
		System.out.println(hMap.get(1));
		System.out.println(hMap.get(2));
		System.out.println(hMap.get(3));
		System.out.println(hMap.get(4));
		
	}
}

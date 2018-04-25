package java.collections.com;

import java.util.HashMap;
import java.util.Map;



public class Dictionaries {
	
	public static void main(String[] args ){
		//Dictionaries in Java are called HashMaps
		HashMap<String, Integer> stringnumbers = new HashMap<>();
		
		stringnumbers.put("One", 1);
		stringnumbers.put("Two", 2);
		stringnumbers.put("Three", 3);
		stringnumbers.put("Four", 4);
		
		for (Map.Entry<String, Integer> entry : stringnumbers.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("key:" + key + " has value :" + value);
			
		}
		
		
		
		
	}

}

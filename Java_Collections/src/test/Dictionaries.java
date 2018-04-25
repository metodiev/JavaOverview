package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Dictionaries {

	public static void main(String[] args) {
		// Dictionaries in Java are called HashMaps
		HashMap<String, Integer> stringnumbers = new HashMap<String, Integer>();

		stringnumbers.put("One", 1);
		stringnumbers.put("Two", 2);
		stringnumbers.put("Three", 3);
		stringnumbers.put("Four", 4);
		stringnumbers.put("Fourty", 40);

		for (Map.Entry<String, Integer> entry : stringnumbers.entrySet()) {
			String key = entry.getKey();

			int value = entry.getValue();
			/*entry.setValue(100);
			entry.setValue(100);
			entry.setValue(100);*/
			/*
			 * if(key == "One"){ entry.setValue(100); value = entry.getValue();
			 * }
			 */
			/***
			 * 
			 * Create bank account with HashMap and set get different bank
			 * accounts
			 */

			//System.out.println("key:" + key + " has value :" + value);

		}

		HashMap<String, HashMap<String, Integer>> nesteHashMap = new HashMap<>();

		nesteHashMap.put("account", stringnumbers);

		for (Map.Entry<String, HashMap<String, Integer>> entry : nesteHashMap.entrySet()) {

			String key = entry.getKey();
			HashMap<String, Integer> nestedHash = entry.getValue();
				System.out.println(key);
			for (Map.Entry<String, Integer> nestedEntry : nestedHash.entrySet()) {

				String nestedKey = nestedEntry.getKey();
				Integer nestedValue = nestedEntry.getValue();

				System.out.println("key:" + nestedKey + " has value :" + nestedValue);

			}

		}

	}

}

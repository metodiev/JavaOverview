package com.set.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSet {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		
		System.out.println(names.toArray().toString());
		
		names.add("Kiro");
		System.out.println(names.toArray().toString());
		System.out.println(names.toArray().toString());
		System.out.println(names.toArray().toString());
		System.out.println(names.toArray().toString());
		System.out.println(names.toArray().toString());
		System.out.println(names.toArray().toString());
		System.out.println(names.toArray().toString());
		System.out.println(names.toArray().toString());
		System.out.println(names.toArray().toString());
		names.add("Kiro");
		System.out.println(names.toArray().toString());
		names.add("Kiro");
		System.out.println(names.toArray().toString());
		names.add("Kiro");
		names.add("Kiro");
		names.add("Pesho");
		names.add("Pesho");
		
		System.out.println(names.toArray().toString());
		
		for (String string : names) {
			System.out.println(string);
		}
		
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		//the tree set order the elements by alphabet or numbers
		TreeSet<String> nodeTreeSet = new TreeSet<>();
		
		nodeTreeSet.add("Kiro");
		nodeTreeSet.add("Kiro");
		nodeTreeSet.add("Kiro");
		nodeTreeSet.add("Pesho");
		nodeTreeSet.add("Node");
		nodeTreeSet.add("сдф");
		
		for (String string : nodeTreeSet) {
			System.out.println(string);
		}
			
		TreeSet<Integer> nodeTreeNumbers = new TreeSet<>();
		
		nodeTreeNumbers.add(1123);
		nodeTreeNumbers.add(11);
		nodeTreeNumbers.add(1);
		
		for (Integer integer : nodeTreeNumbers) {
			System.out.println(integer);
		}
		
		int test = nodeTreeNumbers.ceiling(11);
		System.out.println(test);
		
		/***
		 * 
		 * Use ceiling to create change bureau, with double 
		 */
		
		
		
	}

}

package _1_intoduction;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {

		List<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("world!");

		String s = words.get(0) + words.get(1);
		assert s.equals("Hello world!");

		// without generics

		/***
		 * List words = new ArrayList(); words.add("Hello "); words.add("world!");
		 * String s = ((String)words.get(0))+((String)words.get(1)) assert
		 * s.equals("Hello world!");
		 */

	}

	public static int sum(List<Integer> ints) {
		int s = 0;
		for (int n : ints) {
			s += n;
		}
		return s;
	}

}

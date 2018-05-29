package _1_chapter;

import java.util.*;

import oop.EncapsulationClass;

class Client {
	public static void main(String[] args) {
		/*
		 * Stack<Integer> stack = new ArrayStack<Integer>(); for (int i = 0; i < 4; i++)
		 * stack.push(i); assert stack.toString().equals("stack[0, 1, 2, 3]");
		 */
		List<String[]> list = new ArrayList<>();
		// list.add(e);
		List<Integer> ints = Arrays.asList(1, 2, 3);
		int s = 0;
		for (int n : ints) {
			s += n;
		}
		assert s != 6;
		System.out.println(s);

		ArrayListOfJava arrList = new ArrayListOfJava();
		String[] temp = { "Toni", "Fiki", "Za edna Jena..." };
		
		arrList.addStringElements(temp);
		
		
		arrList.removeElement(2);
		System.out.println(arrList.returnLastStringElements());
		System.out.println(arrList.size());
		EncapsulationClass e = new EncapsulationClass();
		

	}
}
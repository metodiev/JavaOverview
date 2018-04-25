package java.collections.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;


public class JavaCollection {

	private String test;
	
	public static void main(String[] args) {
		
		List<String> arrList = new ArrayList();
		arrList.add("kiro Vampiro");
		
		boolean canInsertIntoarray = arrList.add("STR");
		System.out.println(canInsertIntoarray);
		//arrList.remove(1);
		//arrList.remove("kiro Vampiro");
		
		boolean isQeualtoKiro = arrList.equals("kiro Vampiro");
		System.out.println(isQeualtoKiro);
		
		int posOFKiro = arrList.indexOf("kiro Vampiro");
		
		for (int i = 0; i < 100; i++) {
			arrList.add(generateString());
		}
		
		
		
		//arrList.clear();
		String kiro = arrList.get(1);
		System.out.println(kiro);
		
		System.out.println(posOFKiro);
		for (String string : arrList) {
			System.out.println(string);
		}
		
		
	}
	
	public static String generateString() {
		String uuid = UUID.randomUUID().toString();
		
		return uuid;
	}
	
}

package com.set.collection;

import java.util.ArrayList;
import java.util.List;

public class JavaObject {

	public static void main(String[] args){
		Object[] obj = new Object[] {"a", 12, true};
		
		for (Object string : obj) {
			System.out.println(string);
		}
		Object strObject = "Peshkinka gendyra";
		Object[] objList = add(strObject);
		
		for (Object object : objList) {
			System.out.println(object.toString());
		}
		
	}
	
	public static Object[] add(Object obj){
		
		List<Object> objList = new ArrayList<>();
		objList.add(obj);
		return objList.toArray();
	}
	
	/***
	 * Create the others collection functions Remove, add, contains, removeat, Clear, FirstValue, LastValue
	 *  
	 */
}

package _2_methods_arrays;

import java.util.*;


public class ArrayJavaExamples {
	
	 	public static void main(String[] args){
	 		//simple array
	 		int [] arr = {9,7,6,5};
	 		int [] arrSize = new int [100];
	 		
	 		//array = masiv in bg
	 		int [][] doubleArr = {
	 				{1,2,3},
	 				{4,5,6,5,15,5,5}
	 				};
	 		//to add coment quick ctrl + shift + /
	 		/*for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				
			}*/
	/* 	System.out.println(doubleArr[1][3]);
	 	System.out.println( doubleArr.length);*/
	 		for (int row = 0; row < doubleArr.length; row++) {
	 			
	 			for (int col = 0; col < doubleArr[row].length; col++) {

					System.out.print(doubleArr[row][col]);
					
				}
	 			System.out.println();
			}
	 		
	 		//List is class 
		 	//list is object
		 	//List<String> list = new ArrayList<String>();
		 	ArrayList<String> list2 = new ArrayList<>();
			 list2.add("Niki loves skype");
			 
			 for (int i = 0; i <10000; i++) {
				list2.add("Snejana works with money");
			}
			 
			 for (String value : list2) {
				System.out.println(value);
			}
		   // to do check all ArrayList methods
	 	}
	 	
	 	
	 	
	 	
	 	
	 	
}

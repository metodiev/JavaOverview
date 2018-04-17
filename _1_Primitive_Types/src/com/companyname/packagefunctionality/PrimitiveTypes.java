package com.companyname.packagefunctionality;

public class PrimitiveTypes {
	
	//fields
	private int sum;
	private String name;
	private String surname;
	
	//this is constructor - when you create an object then the constructor is called
	//the name of the constructor always shoud be the same as the class name 
	public PrimitiveTypes(int sumOfConstructor, String nameOfConstructor, String surnameOfConstructor){
		this.name = nameOfConstructor;
		this.sum = sumOfConstructor;
		this.surname = surnameOfConstructor;
	}
	public static void main(String []args){
		
		
		
	//test
	/*	int getSum = sum(10, 10);
		System.out.println(getSum);*/
		
		//primitive data types
		int intPrimitiveMin = Integer.MIN_VALUE;
		int intPrimitiveMax = Integer.MAX_VALUE;
		
		//doublePrimitiveMin is primitive type, primitive type is in the stack
		//Double is class and it is in the heap memory
		double doublePrimitiveMin = Double.MIN_VALUE;
		double doublePrimitiveMax = Double.MAX_VALUE;
		
		DoubleExampleClass.max();
		
		
		Double doubleObject = 15151.151;
		double doublePrimitiveMinStack = 15151.151;
		
		
		
		System.out.println(intPrimitiveMax + "\n" + doublePrimitiveMax);
		
		/**
		 * 
		 * TO DO check others primitive types byte, float, double.NaN Normal_Min...
		 * short, long, boolean, String  		
		 */
		
		
		/***
		 * TO DO Create +-* / with different primitive types (int, float, double, short, long) 
		 * 
		 */
		
		int sumInLoop = 0;
		
		//Loops
		for (int i = 0; i < 100; i++) {
			sumInLoop += i;
		}
		
		for (int i = sumInLoop; i > 0; i--) {
			sumInLoop -= i;
		}
		
		int [] arr = {1,2,3,4};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//this foreach is equilent to the above for loop
		for (Integer primitiveInt : arr) {
			System.out.println(primitiveInt);
		}
		
		//do while cycle
		do {
			System.out.println("This will execute at least once");
			arr[0] = arr[0] - 1;
		} while (arr[0] > 0);
		
		arr[0] = 5;
		
		//here first will check the condition arr[0] > 0, before execution
		while(arr[0] > 0 ){
			System.out.println("This will execute at least once");
			/*arr[0] = arr[0]-1 ;*/
		}
		
	}
	
	public static int sum(int a, int b){
		return a+b;
	}

}

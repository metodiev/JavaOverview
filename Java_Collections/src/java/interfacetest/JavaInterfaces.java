package com.java.interfacetest;

public class JavaInterfaces implements IJumpable {
	
	
	public static int sum(int a, int b){
		
		return a + b;
	}
	
public static int sum(int a, int b, int c){
		
		return a + b + c;
	}


	@Override
	public String jumpNow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numberOfJumps() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean canJumpPerson() {
		// TODO Auto-generated method stub
		return false;
	}

	
	/***
	 * 
	 * Iswimabble
	 * IReadable
	 * IStopable
	 */
}

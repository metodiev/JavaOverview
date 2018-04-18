package _2_classes;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;


public class KeyListenerHomeWork {
	
	public static void main(String[]args){
		KeyListenerHomeWork keyList = new KeyListenerHomeWork();
		
		
		/*System.out.println(KeyEvent.VK_6);
		System.out.println(KeyEvent.VK_D); */
		String test =  "T";
		//String testVariableInHex = Integer.valueOf(test).toHexString(1);
		
		
		
		
		/*
		try {
			String testVariableInHex = "T";
			
			System.out.println(mainValue);
			toHexadecimal(testVariableInHex );
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*Scanner input =  new Scanner(System.in);
		
		String userInput = input.nextLine();
		System.out.println(userInput);
		if (condition) {
			
		}*/
		
		//key.setKeyChar('s');
		/****
		 * TODO  make keylistener like awt swing one to show inputs of user
		 */
	}

	public static void toHexadecimal(String text) throws UnsupportedEncodingException
	{
	    byte[] myBytes = text.getBytes("UTF-8");

	    System.out.println(DatatypeConverter.printHexBinary(myBytes)); 
	    
	    String printInHex = DatatypeConverter.printHexBinary(myBytes);
	    System.out.println(printInHex);
	    int hexTemp = Integer.parseInt(printInHex, 16);
	    
	    System.out.println(hexTemp);
	    
	}
	
	


}

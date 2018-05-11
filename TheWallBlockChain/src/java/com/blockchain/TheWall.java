package java.com.blockchain;

import java.util.Scanner;

public class TheWall {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//catch numbers
		String line = input.nextLine();
		
		String [] strFootinItialHeight = line.split(" ");
		int [] arrFootinItialHeight = new int [strFootinItialHeight.length];
		
		for (int i = 0; i < strFootinItialHeight.length; i++) {
			arrFootinItialHeight[i] = Integer.valueOf(strFootinItialHeight[i]);
			System.out.println(arrFootinItialHeight);
		}
	}

}

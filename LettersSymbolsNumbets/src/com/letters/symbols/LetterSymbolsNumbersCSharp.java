package com.letters.symbols;

import java.util.Scanner;

public class LetterSymbolsNumbersCSharp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		long lettersSum = 0;
		long symbolsSum = 0;
		long numbersSum = 0;
		input.nextLine();
		for (int i = 0; i < n; i++) {
			String inputLine = input.nextLine();

			// Convert the input to upper-case
			inputLine = inputLine.toUpperCase();

			// Remove the whitespace from the input

			inputLine = inputLine.replace(" ", "");
			char[] inputLineCharArray = inputLine.toCharArray();
			for (int k = 0; k < inputLine.length(); k++) {
				char currentChar = inputLineCharArray[k];
				if (currentChar >= 'A' && currentChar <= 'Z') {
					// Letters [a-zA-z]
					lettersSum += (currentChar - 'A' + 1) * 10;
				} else if (currentChar >= '0' && currentChar <= '9') {
					// Numbers [0-9]
					numbersSum += (currentChar - '0') * 20;
				} else {
					// Symbols
					symbolsSum += 200;
				}
			}
		}

		System.out.println(lettersSum);
		System.out.println(numbersSum);
		System.out.println(symbolsSum);
	}

}

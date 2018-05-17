package com.letters.symbols;

import java.util.Scanner;

public class LettersSymbolsNumbers {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

		int linerNumbers = input.nextInt();
		 input.nextLine();
		String[] lines = new String[linerNumbers];

		for (int i = 0; i < linerNumbers; i++) {
			lines[i] = input.nextLine();
		}

		String[] separateLine = separateDifferentLines(lines);

		for (int i = 0; i < separateLine.length; i++) {
			String currentLine = separateLine[i];
			boolean isString = currentLine.matches(".*[a-zA-Z]+.*");
			boolean isNumbers = currentLine.matches("[0-9]+");
			boolean isCharacters = (!(currentLine.contains(("[a-zA-Z]+")) && (currentLine.matches("[0-9]+"))));
			// System.out.println("This is current line " + currentLine);
			if (isString || i == 0) {
				int sumStr = sumStingsLine(currentLine);
				System.out.println(sumStr);
			}
			if (isNumbers || i == 1) {
				int sumNumbers = sumNumbersLine(currentLine);
				System.out.println(sumNumbers);
			}
			if (isCharacters && i == 2) {
				int sumOfCharacters = sumCharactersLine(currentLine);
				System.out.println(sumOfCharacters);
			}
		}

		String str = "Pesho";

		boolean isString = str.matches(".*[a-zA-Z]+.*");
		// System.out.println(isString);
		boolean isNumbers = str.matches("[0-9]+");
		// System.out.println(isNumbers);

		boolean isCharacters = (!(str.contains(("[a-zA-Z]+")) && (str.matches("[0-9]+"))));
		// System.out.println(isCharacters);

	}

	private static String[] separateDifferentLines(String[] lines) {

		String strings = "";
		String numbers = "";
		String chars = "";

		boolean stringFlag = true;
		boolean numberFlag = true;

		String[] newStringArray = new String[3];

		for (int i = 0; i < lines.length; i++) {
			String currentLine = lines[i];
			char[] charsTemp = currentLine.toUpperCase().toCharArray();
			for (int j = 0; j < charsTemp.length; j++) {
				// Check for strings
				for (int p = 65; p <= 90; p++) {

					if ((char) p == charsTemp[j]) {
						// System.out.println((char) p);
						stringFlag = false;
						strings += String.valueOf(charsTemp[j]);

					}

				}
				// Check for int
				for (int p = 48; p <= 57; p++) {

					if ((char) p == charsTemp[j]) {
						// System.out.println((char) p);
						numberFlag = false;
						numbers += String.valueOf(charsTemp[j]);
					}

				}

				if (stringFlag && numberFlag) {
					chars += String.valueOf(charsTemp[j]);
					chars = chars.replaceAll("\\s+","");
				} else {
					stringFlag = true;
					numberFlag = true;

				}

			}

		}
		
		newStringArray[0] = strings;
		newStringArray[1] = numbers;
		newStringArray[2] = chars;
		
		 //System.out.println("This is string array: \n" + newStringArray[0]);
		 //System.out.println("This is number array: \n" + newStringArray[1]);
		 //System.out.println("This is character array: \n" +newStringArray[2]);

		return newStringArray;
	}

	private static int sumCharactersLine(String currentLine) {
		char[] chars = currentLine.toCharArray();
		int sum = 0;

		for (int i = 0; i < chars.length; i++) {
			sum += 200;
		}

		return sum;
	}

	private static int sumNumbersLine(String currentLine) {

		char[] chars = currentLine.toCharArray();
		int[] y = new int[currentLine.length()];
		int sum = 0;

		for (int i = 0; i < chars.length; i++) {
			y[i] = Integer.parseInt(String.valueOf(chars[i]));
			// System.out.println(y[i]);
			sum += y[i] * 20;
		}
		return sum;
	}

	private static int sumStingsLine(String currentLine) {
		char[] lineLetters = currentLine.toUpperCase().toCharArray();
		int sum = 0;
		int counter = 0;
		for (int i = 0; i < lineLetters.length; i++) {
			for (int j = 65; j <= 90; j++) {

				counter++;

				if ((char) j == lineLetters[i]) {
					// System.out.println((char) j);

					sum += counter * 10;
				}

			}
			counter = 0;
		}
		return sum;
	}

}
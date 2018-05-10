package _1_jessie.sequnce.numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BlockChainTaskOne {

	/*
	 * startInterval - an integer within the range of [1…999]  – an integer within
	 * the range of [bigger than startInterval …1000]  magicNumber - an integer
	 * within the range of [1…10000
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		short startInterval = input.nextShort();
		short endInterval = input.nextShort();
		short magicNumber = input.nextShort();

		int numberOfTheCombination = 0;
		int pairFirstNumber = 0;
		int pairSecondNumber = 0;

		// Solve problem with HashMap
		HashMap<ArrayList<Boolean>, Integer[][]> sequnceMap = new HashMap<>();

		// "{the total amount of combinations} combinations - neither equals {magic
		// number}"
		boolean isTrueMagicNumber = false;
		ArrayList<Boolean> tempIsTrueMagicNumber = new ArrayList<>();
		//Integer[][] arr = { { i, j } };
		Integer[][] arr = new Integer [2*(endInterval - startInterval)]
				[2*(endInterval - startInterval)];
		
		for (int i = startInterval; i <= endInterval; i++) {

			for (int j = startInterval; j <= endInterval; j++) {

				// count number of combinations
				numberOfTheCombination++;
				isTrueMagicNumber = (i + j == magicNumber);
				
				tempIsTrueMagicNumber.add(isTrueMagicNumber);
				 
			

				if (isTrueMagicNumber) {
					pairSecondNumber = j;
					 break;
				}

			}
			if (isTrueMagicNumber) {
				pairFirstNumber = i;

				System.out.format("Combination N :%d (%d + %d = %d)", numberOfTheCombination, pairFirstNumber,
						pairSecondNumber, magicNumber);
				 break;
			}

		}

		if (!isTrueMagicNumber) {
			System.out.format("%d combinations - neither equals %d", numberOfTheCombination, magicNumber);
		}

	/*	sequnceMap.put(new ArrayList<>().valueOf(isTrueMagicNumber), arr);
		for (Map.Entry<String, Integer[][]> m : sequnceMap.entrySet()) {
			int keys = sequnceMap.size();
			System.out.println(m.getKey() + " " + m.getValue()[0][0] + keys);
		}*/

	}

}

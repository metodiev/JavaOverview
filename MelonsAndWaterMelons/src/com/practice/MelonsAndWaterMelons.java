package com.practice;

import java.util.Scanner;

public class MelonsAndWaterMelons {

	/*
	 * Monday 1 Watermelon Tuesday 2 Melons Wednesday 1 Watermelon and 1 Melon
	 * Thursday 2 Watermelons Friday 2 Watermelons and 2 Melons Saturday 1
	 * Watermelon and 2 Melons
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int day = input.nextInt();

		int amountOfEating = input.nextInt();
		int watermelons = 0;
		int melons = 0;

		int counterDays = amountOfEating;

		while (counterDays > 0) {
			switch (day) {

			case 1:
				if (counterDays > 0) {
					watermelons += 1;
					counterDays--;
				}

			case 2:
				if (counterDays > 0) {
					melons += 2;
					counterDays--;
				}
			case 3:
				if (counterDays > 0) {
					watermelons += 1;
					melons += 1;
					counterDays--;
				}

			case 4:
				if (counterDays > 0) {
					watermelons += 2;
					counterDays--;
				}

			case 5:
				if (counterDays > 0) {
					watermelons += 2;
					melons += 2;
					counterDays--;
				}
			case 6:
				if (counterDays > 0) {
					watermelons += 1;
					melons += 2;
					counterDays--;
				}
				
			case 7:
				if (counterDays > 0) {
					watermelons += 0;
					melons += 0;
					day = 1;
					counterDays--;
				}
			}
		}
		if (melons < watermelons) {
			System.out.println(watermelons - melons + " more watermelons");
		}/*else if(amountOfEating > watermelons) {
			System.out.println(amountOfEating - watermelons  + " more watermelons");
		}*/

		if ((watermelons == melons)) {
			System.out.println("Equal amount: " + watermelons);
		}

		if (melons > watermelons) {
			System.out.println((melons - watermelons) + " more melons");
		}/*else if(amountOfEating > melons) {
			System.out.println(amountOfEating - melons  + " more melons");
		}*/
	}

}

package com.test.hanball;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HanballStatistics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = "";
		String[] inputLines = new String[50];

		int lineCounter = 0;

		do {
			line = input.nextLine();
			inputLines[lineCounter] = line;
			lineCounter++;

		} while (!line.equals("stop"));

		TreeMap<String, Integer> teams = new TreeMap<String, Integer>();
		HashMap<String, String> teamsOponents = new HashMap<>();

		for (int i = 0; i < lineCounter - 1; i++) {

			String[] currentLine = splitStringCurrentLine(inputLines[i]);

			teamsOponents.put(inputLines[0], inputLines[1]);
			int winner = winnerTeam(currentLine[2], currentLine[2]);
			if (winner == 1) {
				teams.put(currentLine[0], winner);
			}
			if (winner == 2) {
				teams.put(currentLine[1], winner);
			}

		}

		for (Map.Entry m : teams.entrySet()) {
			System.out.println(m.getKey() + " ---" + m.getValue());
		}

	}

	private static int winnerTeam(String matchOne, String matchTwo) {

		int fMatch = isWinnerFirstMatch(matchOne);
		int sMatch = isWinnerSecondMatch(matchTwo);

		/*if (fMatch == sMatch) {
			return 1;
		} else*/ if (fMatch == 1 && sMatch == 2) {
			return 1;
		} else if (sMatch == 2 && fMatch == 2) {
			return 2;
		}

		return 0;
	}

	private static int isWinnerFirstMatch(String team1) {
		String[] currentMachOne = team1.split(":");

		int team1Score = Integer.valueOf(currentMachOne[0]);
		int team2Score = Integer.valueOf(currentMachOne[1]);

		if (team1Score == team2Score) {
			return 2;
		} else if (team1Score > team2Score) {
			return 1;
		} else if (team2Score > team1Score) {
			return 2;
		}
		return 1;
	}

	private static int isWinnerSecondMatch(String team1) {
		String[] currentMachOne = team1.split(":");

		int team1Score = Integer.valueOf(currentMachOne[1]);
		int team2Score = Integer.valueOf(currentMachOne[0]);

		if (team1Score == team2Score) {
			return 2;
		} else if (team1Score > team2Score) {
			return 1;
		} else if (team2Score > team1Score) {
			return 2;
		}
		return 2;
	}

	private static String[] splitStringCurrentLine(String getCurrentLine) {
		getCurrentLine = getCurrentLine.replaceAll("\\|", "");
		String[] currentLine = getCurrentLine.split("  ");
		/*
		 * System.out.println(getCurrentLine);
		 * 
		 * for (int i = 0; i < currentLine.length; i++) {
		 * System.out.println(currentLine[i]);
		 * 
		 * }
		 */
		return currentLine;
	}

}

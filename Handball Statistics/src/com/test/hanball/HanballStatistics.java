package com.test.hanball;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

		// Map<String, Integer> teams = new HashMap<String, Integer>();
		TreeMap<String, Integer> teams = new TreeMap<String, Integer>();
		HashMap<String, ArrayList<String>> teamsOponents = getTeamsOponents(inputLines, lineCounter);
		int countWinnersTeam1 = 0;
		int countWinnersTeam2 = 0;
		for (int i = 0; i < lineCounter - 1; i++) {

			String[] currentLine = splitStringCurrentLine(inputLines[i]);
			if (teams.containsKey(currentLine[0])) {
				int[] winner2 = winnerScore(inputLines, lineCounter, currentLine[1]);

				if (winner2[0] == 2 && winner2[1] > 0) {
					countWinnersTeam2 = winner2[1];

				}

				teams.put(currentLine[1], countWinnersTeam2);
				countWinnersTeam2 = 0;
				continue;
			}

			if (teams.containsKey(currentLine[1])) {
				int[] winner1 = winnerScore(inputLines, lineCounter, currentLine[0]);
				// int winner = winnerTeam(currentLine[2], currentLine[3]);

				if (winner1[0] == 1 && winner1[1] > 0) {
					countWinnersTeam1 = winner1[1];

				}

				teams.put(currentLine[0], countWinnersTeam1);
				countWinnersTeam1 = 0;
				continue;
			}
			int[] winner1 = winnerScore(inputLines, lineCounter, currentLine[0]);
			int[] winner2 = winnerScore(inputLines, lineCounter, currentLine[1]);
			// int winner = winnerTeam(currentLine[2], currentLine[3]);
			if (winner1[0] == 1 && winner1[1] > 0) {
				countWinnersTeam1 = winner1[1];

			}
			if (winner2[0] == 2 && winner2[1] > 0) {
				countWinnersTeam2 = winner2[1];

			}

			teams.put(currentLine[0], countWinnersTeam1);
			teams.put(currentLine[1], countWinnersTeam2);
			countWinnersTeam1 = 0;
			countWinnersTeam2 = 0;

		}

		int[] winnerArrayOrder = new int[teams.size()];
		int arrCounter = 0;

		for (Map.Entry m : teams.entrySet()) {

			winnerArrayOrder[arrCounter] = (int) m.getValue();
			arrCounter++;
		}

		Arrays.sort(winnerArrayOrder);
		boolean breakCondition = false;
		int winnerPlayerScore = 0 ;
		for (int i = teams.size() - 1; i >= 0; i--) {
			if(i == teams.size() - 2 && winnerArrayOrder[i] == 0) {
				winnerPlayerScore = 0;
			}
			for (Map.Entry m : teams.entrySet()) {
				int comparableValue = (int) m.getValue();
				if (comparableValue == winnerArrayOrder[i] - winnerPlayerScore) {
					System.out.println(m.getKey());
					System.out.println("- Wins: " + m.getValue());
					
					for (Map.Entry mOp : teamsOponents.entrySet()) {

						if (m.getKey().equals(mOp.getKey())) {
							String str = mOp.getValue().toString();
							str = str.replace("]", "");
							str = str.replace("[", "");
							System.out.println("- Opponents: " + str);
						}
					}
					
				}
				
				

			}
			winnerPlayerScore++;
		}

	}

	private static HashMap<String, ArrayList<String>> getTeamsOponents(String[] inputLines, int lineCounter) {
		HashMap<String, ArrayList<String>> teamsOponents = new HashMap<>();

		String key = "";
		for (int i = 0; i < lineCounter - 1; i++) {
			String[] currentLine = splitStringCurrentLine(inputLines[i]);
			String team1 = new String(currentLine[0].toString());
			String team2 = new String(currentLine[1].toString());

			key = team1;
			ArrayList<String> opponents1 = new ArrayList<>();
			for (int j = 0; j < lineCounter - 1; j++) {

				String[] currentLineTemp = splitStringCurrentLine(inputLines[j]);
				String team1Temp = new String(currentLineTemp[0].toString());
				String team2Temp = new String(currentLineTemp[1].toString());

				if (team1.equals(team2Temp)) {
					opponents1.add(team1Temp);
				} else if (team1.equals(team1Temp)) {
					opponents1.add(team2Temp);
				}

				Collections.sort(opponents1);
				teamsOponents.put(key, opponents1);
			}

			key = team2;
			ArrayList<String> opponents2 = new ArrayList<>();
			for (int j = 0; j < lineCounter - 1; j++) {

				String[] currentLineTemp = splitStringCurrentLine(inputLines[j]);
				String team1Temp = new String(currentLineTemp[0].toString());
				String team2Temp = new String(currentLineTemp[1].toString());

				if (team2.equals(team1Temp)) {
					opponents2.add(team2Temp);
				} else if (team2.equals(team2Temp)) {
					opponents2.add(team1Temp);
				}

				Collections.sort(opponents2);
				teamsOponents.put(key, opponents2);
			}
		}

		return teamsOponents;

	}

	private static int[] winnerScore(String[] inputLines, int lineCounter, String CurrentTeam) {

		int[] winnerScore = new int[2];
		int countWinnersTeam1 = 0;
		// int countWinnersTeam2 = 0;
		int winner = 0;
		boolean firstPlayer = false;
		boolean secondPlayer = false;

		for (int i = 0; i < lineCounter - 1; i++) {
			String[] currentLine = splitStringCurrentLine(inputLines[i]);

			winner = winnerTeam(currentLine[2], currentLine[3]);
			if (currentLine[0].equals(CurrentTeam) && winner == 1) {
				countWinnersTeam1++;
			}

			if (currentLine[1].equals(CurrentTeam) && winner == 2) {
				countWinnersTeam1++;
			}

			if (currentLine[0].equals(CurrentTeam)) {
				firstPlayer = true;
			}
			if (currentLine[1].equals(CurrentTeam)) {
				secondPlayer = true;
			}

		}
		if (firstPlayer) {
			winnerScore[0] = 1;
			winnerScore[1] = countWinnersTeam1;
		}

		if (secondPlayer) {
			winnerScore[0] = 2;
			winnerScore[1] = countWinnersTeam1;
		}

		return winnerScore;

	}

	private static int winnerTeam(String matchOne, String matchTwo) {

		int fMatch = isWinnerFirstMatch(matchOne);
		int sMatch = isWinnerSecondMatch(matchTwo);

		if (fMatch == 1 && sMatch == 1) {
			return 1;
		} else if (sMatch == 2 && fMatch == 2) {
			return 2;
		}

		if (fMatch == 2 && sMatch == 1) {

			return sumPlayersScore(matchOne, matchTwo);
		} else if (sMatch == 2 && fMatch == 1) {
			return sumPlayersScore(matchOne, matchTwo);
		}

		return 0;
	}

	private static int sumPlayersScore(String matchOne, String matchTwo) {
		String[] currentMachOne = matchOne.split(":");
		String[] currentMachTwo = matchTwo.split(":");

		int team1ScoreFirstMatch = Integer.valueOf(currentMachOne[0]);
		int team1ScoreSecondMatch = Integer.valueOf(currentMachTwo[1]);

		int team2ScoreFirstMatch = Integer.valueOf(currentMachOne[1]);
		int team2ScoreSecondMatch = Integer.valueOf(currentMachTwo[0]);

		int firstPlayerSum = team1ScoreFirstMatch + team1ScoreSecondMatch;
		int secondPlayerSum = team2ScoreFirstMatch + team2ScoreSecondMatch;

		if (firstPlayerSum > secondPlayerSum) {
			return 1;
		} else if (secondPlayerSum > firstPlayerSum) {
			return 2;
		} else if (firstPlayerSum == secondPlayerSum) {
			if (team1ScoreSecondMatch > team2ScoreFirstMatch) {
				return 1;
			} else if (team1ScoreSecondMatch < team2ScoreFirstMatch) {
				return 2;
			}
		}
		return 0;
	}

	private static int isWinnerFirstMatch(String matchOne) {
		String[] currentMachOne = matchOne.split(":");

		int team1Score = Integer.valueOf(currentMachOne[0]);
		int team2Score = Integer.valueOf(currentMachOne[1]);

		if (team1Score > team2Score) {
			return 1;
		} else if (team2Score > team1Score) {
			return 2;
		}
		return 1;
	}

	private static int isWinnerSecondMatch(String matchTwo) {
		String[] currentMachOne = matchTwo.split(":");

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

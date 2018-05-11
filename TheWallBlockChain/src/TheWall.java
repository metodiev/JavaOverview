
import java.util.Scanner;

public class TheWall {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// catch numbers
		String line = input.nextLine();

		String[] strFootinItialHeight = line.split(" ");
		int[] arrFootinItialHeight = new int[strFootinItialHeight.length];

		for (int i = 0; i < strFootinItialHeight.length; i++) {
			arrFootinItialHeight[i] = Integer.valueOf(strFootinItialHeight[i]);
			//System.out.println(arrFootinItialHeight[i]);
		}

		int crewForAddingFoots = 0;
		long coinsNumber = 0;
		
		for (; checkArrForComletedFoots(arrFootinItialHeight);) {

			for (int j = 0; j < arrFootinItialHeight.length; j++) {
				if (arrFootinItialHeight[j] < 30) {
					arrFootinItialHeight[j] = ++arrFootinItialHeight[j];
					crewForAddingFoots++;

				}

			}
			coinsNumber += crewForAddingFoots * 195;
			System.out.print(crewForAddingFoots * 195);
			if (checkArrForComletedFoots(arrFootinItialHeight)) {
				System.out.print(", ");
			}
			crewForAddingFoots = 0;
		}
		
		System.out.println("\n"+coinsNumber *1900 + " coins");

	}

	private static Boolean checkArrForComletedFoots(int[] arrFootinItialHeight) {
		int isArrCompletedFoot = 0;
		for (int i = 0; i < arrFootinItialHeight.length; i++) {
			if (arrFootinItialHeight[i] == 30) {
				isArrCompletedFoot++;
			}
		}
		return (!(isArrCompletedFoot == arrFootinItialHeight.length));
	}

}

package express.softuni.courier;

import java.util.Scanner;

public class November5_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double weight = input.nextDouble();
		String typeOfOrder = input.next();
		input.nextLine();
		double distance = input.nextDouble();

		double price = 0;

		if (weight < 1) {
			price = 0.03 * distance;
			if (typeOfOrder.equals("express")) {
				price += 0.8 * 0.03 * weight * distance;
			}
		} else if (weight < 5) {
			price = 0.05 * distance;
			if (typeOfOrder.equals("express")) {
				price += 0.4 * 0.05 * weight * distance;
			}
		} else if (weight < 40) {
			price = 0.1 * distance;
			if (typeOfOrder.equals("express")) {
				price += 0.05 * 0.1 * weight * distance;
			}
		} else if (weight < 90) {
			price = 0.15 * distance;
			if (typeOfOrder.equals("express")) {
				price += 0.02 * 0.15 * weight * distance;
			}
		} else if (weight < 150) {
			price = 0.2 * distance;
			if (typeOfOrder.equals("express")) {
				price += 0.01 * 0.2 * weight * distance;
			}
		}

		System.out.println("The delivery of your shipment with weight of " + String.format("%.3f", weight)
				+ " kg. would" + " cost " + String.format("%.2f", price) + " lv.");

	}

}
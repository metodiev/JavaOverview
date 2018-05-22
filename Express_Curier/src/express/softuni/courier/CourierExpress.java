package express.softuni.courier;

import java.util.Scanner;

public class CourierExpress {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double wieght = in.nextDouble();
		String service = in.next();
		in.nextLine();
		int distance = in.nextInt();

		double priceOfService = 0.0;
		if (service.equals("standard")) {
			priceOfService = stanardService(wieght, distance);
		} else {

			priceOfService = expressService(wieght, distance);
		}

		System.out.println(String.format("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",
				wieght, priceOfService));

	}

	private static double expressService(double wieght, int distance) {
		double priceOfExpressService = 0.0;
		priceOfExpressService += stanardService(wieght, distance);

		if (wieght < 1.0) {
			priceOfExpressService += (80 * 0.03 / 100) * (wieght) * (distance);
		}
		if (wieght > 1.0 && wieght <= 10.0) {
			priceOfExpressService += (40 * 0.05 / 100) * (wieght) * (distance);
		} else if (wieght > 10.0 && wieght <= 40.0) {
			priceOfExpressService += (5 * 0.10 / 100) * (wieght) * (distance);
		} else if (wieght > 40.0 && wieght <= 90.0) {
			priceOfExpressService += (2 * 0.15 / 100) * (wieght) * (distance);
		} else if (wieght > 90.0 && wieght <= 150.0) {
			priceOfExpressService += (1 * 0.20 / 100) * (wieght) * (distance);
		}

		return priceOfExpressService;

	}

	private static double stanardService(double wieght, int distance) {
		double priceOfService = 0.0;

		if (wieght < 1.0) {
			priceOfService = 0.03 * distance;
		}
		if (wieght > 1.0 && wieght < 10.0) {
			priceOfService = 0.05 * distance;
		} else if (wieght > 10.0 && wieght <= 40.0) {
			priceOfService = 0.10 * distance;
		} else if (wieght > 40.0 && wieght <= 90.0) {
			priceOfService = 0.15 * distance;
		} else if (wieght > 90.0 && wieght <= 150.0) {
			priceOfService = 0.20 * distance;
		}

		return priceOfService;
	}

}

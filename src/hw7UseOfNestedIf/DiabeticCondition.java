package hw7UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {

	public static void main(String[] args) {
		System.out.println("Please enter your Hemoglobin A1C value below --> ");
		Scanner scanner = new Scanner(System.in);
		double hbga1c = scanner.nextDouble();

		if (hbga1c > 6.4) {
			System.out.println("I am diabetic patient");
		} else if (hbga1c < 6.4) {
			System.out.println("Congratulations! You are not diabetic");
			if (hbga1c > 5.7) {
				System.out.println("I am a pre-diabetic patient");
			} else if (hbga1c < 5.7) {
				System.out.println("I am a healthy person");
			}
		} else {
			System.out.println("Please enter a valid number.");
		}

	}

}

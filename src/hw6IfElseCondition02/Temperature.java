package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Please Enter Today's Temperature: ");
		Scanner scanner = new Scanner(System.in);
		int todaysTemperature = scanner.nextInt();

		if (todaysTemperature < 32) {
			System.out.println("The Temperature " + todaysTemperature + " Degrees is Freezing");
		} else if (todaysTemperature > 32 && todaysTemperature < 55) {
			System.out.println("The Temperature " + todaysTemperature + " Degrees Farenheit is Pleasant");
		} else if (todaysTemperature > 55 && todaysTemperature < 73) {
			System.out.println("The Temperature " + todaysTemperature + " Degrees Farenheit is Getting Warmer");
		} else if (todaysTemperature > 73 && todaysTemperature < 101) {
			System.out.println("The Temperature " + todaysTemperature + " Degrees Farenheit is Hot");
		} else {
			System.out.println("Please put ice on my  Head!");
		}

		scanner.close();
	}

}

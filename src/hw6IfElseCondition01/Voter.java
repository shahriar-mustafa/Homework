package hw6IfElseCondition01;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		System.out.println("Please enter your age: ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		if (age == 18) {
			System.out.println("I am a voter");
		} else if (age < 18) {
			System.out.println("I am not a voter");
		} else if (age > 18) {
			System.out.println("I am a voter");
		} else {
			System.out.println("Please enter a valid age!");
		}

		scanner.close();

	}

}

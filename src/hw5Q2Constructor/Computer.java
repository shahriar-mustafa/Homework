package hw5Q2Constructor;

public class Computer {

	// Declare variables
	public String brand;
	public String model;
	public String operatingSystem;
	public float price;
	public char grade;
	public boolean madeInUSA;

	// Declare default Constructor
	public Computer() {
		System.out.println("This is from the default constructor of Computer Class");
	}

	public Computer(String operatingSystem, float price, char grade, boolean madeInUSA) {
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Operating System is " + operatingSystem + ", The price: $" + price + ", Grade: " + grade
				+ "\nIs it made in USA? Ans: " + madeInUSA);
	}

	// Declare parameterized constructor
	public Computer(String brand, String model) {
		this.brand = brand;
		this.model = model;
		System.out.println("My Brand: " + brand + ", Model: " + model);

	}

}

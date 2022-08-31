package hw4JavaVariables;

public class AboutMe {

	public String name; // Variable are declared
	public byte age;
	public String streetAddress;
	public String state;
	public short zipCode;
	public char gender;
	public long phoneNumber;
	public float myHeight;
	public double valueOfPie;
	public boolean student;

	// Constructor Declare
	public AboutMe() {
		System.out.println("This is all about us: ");
	}

	// Method implemented
	public void aboutMe() {
		System.out.println("My name is: " + name + "\nMy age is " + age + "\n" + "My address is: " + streetAddress
				+ " ," + state + " " + zipCode + "\nMy gender: " + gender + "\nMy Phone Number: " + phoneNumber
				+ "\nMy height: " + myHeight + "\nThe value of Pie: " + valueOfPie + "\nAre you a student?: "
				+ student);
	}
}

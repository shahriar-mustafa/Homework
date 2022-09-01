package hw5Q3Constructor;

;

public class Student {

	// Declare Variables
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	// Declare default constructor
	public Student() {
		System.out.println("This is from the Default Constructor of Student Class.");
	}

	// Declare parameterized constructor
	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stName + ", ID: " + stID + ", Sex: " + sex + ", Grade: " + grade
				+ ", Java Programmer? Ans: " + isProgrammer);
	}

}

package hw3JavaVariables;


public class AboutMe {
	public byte age; // A variable is declared here
	public String name  = "Shahriar Mustafa"; // Variable is initialized 
    public String streetAddress = "3 Drury CT";
    public String state = "NY";
    public short zipCode = 11742;
    public char gender= 'M';
    public long phoneNumber = 6316525298l;
    public float myHeight = 5.6f;
    public double valueOfPie = 3.14568953;
    public boolean student = true;
    
	public static void main(String[] args) {
     
		AboutMe aboutMe = new AboutMe(); // Instantiated 
				System.out.println("My name is " + aboutMe.name + "\nMy address is,\n" + 
		aboutMe.streetAddress + ", " + aboutMe.state + " " + aboutMe.zipCode);
				System.out.println("I am a student =  " + aboutMe.student );
				System.out.print("My age is = ");
				System.out.print(aboutMe.age= 30);
	

	}

}

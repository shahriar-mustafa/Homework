package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // Instantiated

		// Variables initiated
		aboutMe.name = "Shahriar Mustafa";
		aboutMe.age = 25;
		aboutMe.streetAddress = "3 Drury CT";
		aboutMe.state = "NY";
		aboutMe.zipCode = 11742;
		aboutMe.gender = 'M';
		aboutMe.phoneNumber = 6316525298l;
		aboutMe.myHeight = 5.645f;
		aboutMe.valueOfPie = 3.1456735;
		aboutMe.student = true;

		// method initiated
		aboutMe.aboutMe();

		System.out.println("\n-----------------------------------------\n");
		// Info for second person

		AboutMe aboutAlex = new AboutMe(); // Instantiated
		aboutAlex.name = "Alex"; // Variables initiated
		aboutAlex.age = 20;
		aboutAlex.streetAddress = "83 Hettys Path";
		aboutAlex.state = "NY";
		aboutAlex.zipCode = 11738;
		aboutAlex.gender = 'F';
		aboutAlex.phoneNumber = 6465206709l;
		aboutAlex.myHeight = 5.145f;
		aboutAlex.valueOfPie = 3.1456735;
		aboutAlex.student = true;

		aboutAlex.aboutMe();// Method initiated

	}

}

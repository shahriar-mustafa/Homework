package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Computer computer2 = new Computer("Apple", "Macbook");
		Computer computer3 = new Computer("MacOS", 1299.99f, 'A', false);

		// Second outcome
		System.out.println("------------------------------------------");

		Computer computer5 = new Computer("Razer", "Blade 15");
		Computer computer6 = new Computer("Windows 11", 2099.99f, 'A', true);

	}

}

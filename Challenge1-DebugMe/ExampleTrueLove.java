//MP1. File: ExampleTrueLove.java, CS125 Project: Challenge1-DebugMe, Version: 2022-09-10T09:30:04-0500.678307242
public class ExampleTrueLove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean love = true;

		// # petals = A random integer between 0 and 99 inclusive
		int n = (int) (100 * Math.random());

		while (n > 0) {

			// Could also write n--;
			n = n - 1;
			// if was was true it will now be false and vice versa
			love = !love;

			if (love)
				System.out.println("She loves me!");

			if (!love)
				System.out.println("She loves me NOT!");
		} // pick another petal
	}

}

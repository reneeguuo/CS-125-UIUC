//UIUC CS125 FALL 2013 MP. File: Winner.java, CS125 Project: Challenge1-DebugMe, Version: 2013-09-10T09:30:04-0500.678307242

/**
 * This program prints "a","b","c" depending on who has the highest score. The
 * given code may not be correct. Fix it and additional code to pass the unit
 * tests.
 * 
 * @see Winner-ReadMe.txt for details on how to complete this program.
 * @author insert-your-bfu3-here
 * 
 */
public class Winner {
	public static void main(String[] args) {
		System.out.println("Enter three unique integer scores.");

		int a = TextIO.getlnInt();
		int b = TextIO.getlnInt();
		int c = TextIO.getlnInt();
		
		while (a==c || a==b || b==c)
		{
			System.out.println("Enter three unique integer scores.");

			a = TextIO.getlnInt();
			b = TextIO.getlnInt();
			c = TextIO.getlnInt();
		}
		
		if (a > b && a > c)
			TextIO.putln("1st Place:a");
		if (b>a && b>c)
			TextIO.putln("1st Place:b");
		if (c>a && c>b)
			TextIO.putln("1st Place:c");


		
		// the logic and text output need further work...
	}
}

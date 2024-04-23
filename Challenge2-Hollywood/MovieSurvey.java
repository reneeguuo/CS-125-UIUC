//UIUC CS125 FALL 2022 MP. File: MovieSurvey.java, CS125 Project: Challenge2-Hollywood, Version: 2022-09-17T08:41:18-0500.919487497
/**
 * A program to run a simple survey and report the results. See MovieSurvey.txt
 * for more information. TODO: add your netid to the line below
 * 
 * @author Lei
 */
public class MovieSurvey {
	public static void main(String[] arg) {
		// TODO: Write your program here
		// Hints :
		// Formatted output
		// http://math.hws.edu/javanotes/c2/s4.html#basics.4.4
		
		// Don't just copy paste the expected output
		// For grading purposes your code may be tested
		// with other input values.
		System.out.println("Welcome. We're interested in how people are watching movies this year.");
		System.out.println("Thanks for your time. - The WRITERS GUILD OF AMERICA.");
		System.out.println("Please tell us about how you've watched movies in the last month.");
		System.out.println("How many movies have you seen at the cinema?");
		int atCinema = TextIO.getlnInt();
		System.out.println("How many movies have you seen using a DVD or VHS player?");
		int usingDVD = TextIO.getlnInt();
		System.out.println("How many movies have you seen using a Computer?");
		int usingComputer = TextIO.getlnInt();
		System.out.printf("Summary: %d Cinema movies, %d DVD/VHS movies, %d Computer movies\n", atCinema, usingDVD, usingComputer);
		int total = atCinema+usingDVD+usingComputer;
		System.out.printf("Total: %d movies\n", total);
		System.out.printf("Fraction of movies seen at a cinema: %.2f%%\n", ((float)atCinema/(float)total)*100);
		System.out.printf("Fraction of movies seen outside of a cinema: %.2f%%\n", (1-((float)atCinema/(float)total))*100);
	}
}

//UIUC CS125 FALL 2022 MP. File: FindScriptLine.java, CS125 Project: Challenge2-Hollywood, Version: 2022-09-17T08:41:18-0500.919487497
/**
 * A program to search for specific lines and print their line number.
 * See FindScriptLine.txt for more details
 * TODO: add your netid to the line below
 * @author Lei
 */
public class FindScriptLine {

	public static void main(String[] args) {
// TODO: Implement the functionality described in FindScriptLine.txt
// TODO: Test your code manually and using the automated unit tests in FindScriptLineTest
		System.out.println("Please enter the word(s) to search for");
		String stringToSearch = TextIO.getln();
		System.out.printf("Searching for '%s'\n", stringToSearch);

		TextIO.readFile("thematrix.txt");

		int lineCount = 0;
		while (false == TextIO.eof()) {
			String line = TextIO.getln();
			lineCount++;

			if (line.toLowerCase().indexOf(stringToSearch.toLowerCase()) >= 0) {
				line = line.trim();
				System.out.printf("%d - %s\n", lineCount, line);
			}
		}
		System.out.printf("Done Searching for '%s'\n", stringToSearch);
	}
}

//UIUC CS125 FALL 2022 MP. File: CallAStaticMethod.java, CS125 Project: Challenge5-DataStructures, Version: 2022-10-14T13:54:31-0500.608726435
/**
 * Prints out only lines that contain an email address Each printed line is
 * justified to right by prepending the text with '.' characters The minimum
 * width of the line including padding is 40 characters. See the test case for
 * example input and expected output.
 * TODO: add your netid to the line below
 * @author Lei
 */
class CallAStaticMethod {

	public static void main(String[] args) {

		while (!TextIO.eof()) {
			String line = TextIO.getln();
			// Use ExampleClassMethods
			// 'isEmailAddress' and 'createPadding' to complete this method
			
			if (ExampleClassMethods.isEmailAddress(line)) {
				int a = 40 - line.length();
				String pending = ExampleClassMethods.createPadding('.', a);
				line = pending + line;
				TextIO.putln(line);
			}
			
		}

	}
}

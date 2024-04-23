//UIUC CS125 FALL 2022 MP. File: ExampleCharacters.java, CS125 Project: Challenge3-TopSecret, Version: 2022-09-21T10:50:52-0500.946838668
public class ExampleCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int offset = -300;
		offset = offset % 26; // -25 to +25
		String mesg = "CHOOSE THE PATH TO WISDOM OR LET IT CHOOSE YOU";

		char c = mesg.charAt(0);
		int letter = c - 'A';
		int encryptedDelta = (26 + letter + offset) % 26;
		char encyptedAsLetter = (char) (encryptedDelta + 'A');

		System.out.println("Encrypted First char is " + encyptedAsLetter);
}	}

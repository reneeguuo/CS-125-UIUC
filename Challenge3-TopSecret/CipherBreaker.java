//UIUC CS125 FALL 2022 MP. File: CipherBreaker.java, CS125 Project: Challenge3-TopSecret, Version: 2022-09-21T10:50:52-0500.946838668
/**
 * See CipherBreaker.txt for instructions.
 * TODO: add your netid to the line below
 * 
 * @author Lei
 */
public class CipherBreaker {

	public static void main(String[] args) {
		TextIO.putln("Text?");
		String line = TextIO.getln();
		// char a = line.charAt(0);
		//System.out.println((int)a);
		TextIO.putln(line);
		line = line.toUpperCase();


		int digits = 0;
		int spaces = 0;
		int punctuation = 0;
		int[] alfa = new int[26];

		for (int i=0; i<line.length(); i++) {
			char a = line.charAt(i);
			
			if (a==32)
				spaces++;
			if (a==39 || a==34 || a==45 || a==44 || a==46 || a==33)
                punctuation++;
            if (a<91 && a>64)
            	alfa[a-65]++;
            if (a<58 && a>47)
            	digits++;
		}

		for (int i=0; i<26; i++) {
			if (alfa[i]>0)
				System.out.printf("%c:%d\n", (char)(i+65), alfa[i]);
		}
		if (digits>0)
			System.out.printf("DIGITS:%d\n", digits);
		if (spaces>0)
			System.out.printf("SPACES:%d\n", spaces);
		if (punctuation>0)
			System.out.printf("PUNCTUATION:%d\n", punctuation);







		//System.out.printf();


		/*
		Text?
A-C E'? 099A "
A:2
C:1
E:1
DIGITS:3
SPACES:3
PUNCTUATION:3

		*/
      }	
}

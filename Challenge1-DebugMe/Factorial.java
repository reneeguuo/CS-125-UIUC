//MP1. File: Factorial.java, CS125 Project: Challenge1-DebugMe, Version: 2022-09-10T09:30:04-0500.678307242

/**
 * A program to calculate a factorial. The given code may contain errors. Fix the
 * given code and add additional code to calculate a factorial and pass the unit
 * tests. Hint sometimes an 'int' just 'aint big enough.
 * 
 * @see Factorial-ReadMe.txt for details on how to complete this program.
 * @author insert-your-bfu3-here
 */
public class Factorial {
	public static void main(String[] args) {
		
		
//		System.out.println("Enter a number between 1 and 20 inclusive.");
//		long max = TextIO.getlnLong();
//		
//		while (max<1 || max>=21)
//		{
//			System.out.println("Enter a number between 1 and 20 inclusive.");
//			max = TextIO.getlnLong();
//		}
//		
//		long result = 1;
//		for (int i=1; i<=max; i++)
//		{
//			result = result*i;
//		}
//		TextIO.putln(max + "! = " + result);
		String a = TextIO.getln();
		if (a.length()==0){
		System.out.println("hahah");
		}
		else {
		System.out.println(a.length());
		char kkk = a.charAt(0);
		System.out.println(kkk);
		}
		for (int i=0; i<10; i++)
		{
			System.out.print(a);
		}
	}
}

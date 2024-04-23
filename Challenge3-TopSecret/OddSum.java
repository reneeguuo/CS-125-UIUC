//UIUC CS125 FALL 2022 MP. File: OddSum.java, CS125 Project: Challenge3-TopSecret, Version: 2022-09-21T10:50:52-0500.946838668
/**
 * Prints sum of odd numbers in a specific format.
 * TODO: add your netid to the line below
 * @author Lei
 */
public class OddSum { 
/**
Example output if user enters 10:
Max?
1 + 3 + 5 + 7 + 9 = 25
25 = 9 + 7 + 5 + 3 + 1

Example output if user enters 11:
Max?
1 + 3 + 5 + 7 + 9 + 11 = 36
36 = 11 + 9 + 7 + 5 + 3 + 1

 **/
 public static void main(String[] args) {

 	System.out.println("Max?");
 	int input = TextIO.getlnInt();
 	int sum = 0;

 	if (input%2 == 0)
 		input--;

 	for (int i=1; i<=input; i=i+2) {
 		System.out.printf("%d", i);
 		sum = sum + i;
 		if (i+2<=input)
 			System.out.printf(" + ");
 		else
 			System.out.printf(" = %d\n", sum);
 	}

 	for (int i=input; i>0; i=i-2) {
 		//if (i%2 == 0)
 		//	i--;
 		
 		if (i==input) {
 			System.out.printf("%d = ", sum);
 		}

 		System.out.printf("%d", i);
 		if (i-2>0)
 			System.out.printf(" + ");
 	}
  }
}

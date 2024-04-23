//UIUC CS125 FALL 2022 MP. File: InsecureCombinationLockBreaker.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2022-11-12T09:11:45-0600.037093451
public class InsecureCombinationLockBreaker {

	public static int breakLock(InsecureCombinationLock lock) {
		// Write your code here to break the combination lock
		// Read the combination lock source code to determine
		// the weakness in the lock
		
		// You do not need to use recursion.

		// - An inside programmer has written some extra
		// code that gives you a tiny hint about how close you
		// are to opening the lock.
		// Using this single bit of information, your job
		// is to find the integer value that opens the lock
		
		// This method is only for honors students and the curious to complete
		// Honor students: Be prepared to demonstrate how you completed
		// this problem!

		// **** This method is not graded as part of the MP ****
		
		// (but for your own local testing just remove 
		// the 'xxx's in the test  method in InsecureTest.java)
		
		// Beginner: This problem is not for beginners
		
		// Intermediate: It took me 90 minutes to create a robust solution 
		// (including 15 minutes debugging it with several million tests).
		
		// Advanced: 'Don't be wasteful' -
		// Assume there is a 1s time penalty for every unlocking attempt,
		// make sure your code uses the fewest number of unlocking attempts
		// ie. It will open the lock as quickly as possible.
		// (My solution was little wasteful but was simpler to implement).

		int guess = 11111111;
		int digitLength = 9;
		int[] key = new int[digitLength];

		for (int currentDigit=0; currentDigit<digitLength; currentDigit++) {
			int situation_1 = 0;
			int situation_2 = 0;
			int situ1_Guess = 0;
			int situ2_Guess = 0;
			for (int i=0; i<=9; i++) {
				guess = changeDigitAtIndexToDigite(guess, currentDigit, i);
				String result = lock.open(guess);
				if (result.contains("*-*-*")){
					situation_1++;
					situ1_Guess = i;
					if(situation_1>2 && situation_2!=0) break;
				}
				if (result.contains("-*-*-")){
					situation_2++;
					situ2_Guess = i;
					if(situation_2>2 && situation_1!=0) break;
				}
			}
			if (situation_2>2)
				key[currentDigit] = situ1_Guess;
			if (situation_1>2)
				key[currentDigit] = situ2_Guess;
		}

		int finalResult = 0;
		for (int i=0; i<digitLength; i++) {
			finalResult = finalResult+key[i]*(int)Math.pow(10,i);
		}
		lock.open(finalResult);
		return finalResult;
	}

	public static int changeDigitAtIndexToDigite(int a, int index, int b) {
		int zeros = (int)Math.pow(10,index);
		int toAdd = b*zeros;
		int toMin = ((a/zeros)%10)*zeros;
		return a - toMin + toAdd;
	}


	public static void main(String[] args) {
		InsecureCombinationLock lock = new InsecureCombinationLock();
		int code = breakLock(lock);

		System.out.println("Unlock code:"+code);
		System.out.println(lock.isUnlocked() ? "Unlocked :-)" : "Still Locked :-(");
	 }
}

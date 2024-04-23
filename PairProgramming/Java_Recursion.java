public class Java_Recursion {
	public static void main(String[] args) {
		System.out.println(calculateFactorial(5));
		System.out.println(calculateFibonacci(5));
		
		Zen.create(640, 960, null);
		//drawPicture(640, 960);

				Zen.drawImage("Mario.png", 0, 0, 640, 960);
	}

	static long calculateFactorial (int a) {
		if (a==1) return 1;
		return calculateFactorial(a-1)*a;
	}

	static int calculateFibonacci (int a) {
		if (a==1) return 1;
		if (a==2) return 1;
		return calculateFibonacci(a-1) + calculateFibonacci(a-2);
	}

	static int drawPicture (int width, int height) {
		if (width<100) return 1;
		Zen.drawImage("1.png", 0, 0, width, height);
		return drawPicture(width/2, height/2);
	}
}
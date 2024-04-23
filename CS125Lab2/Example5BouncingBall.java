public class Example5BouncingBall {
	/**
	 * Simulates bouncing a ball.
	 */
	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		double velocityX = 0.4;
		double velocityY = 0;

		while (Zen.isRunning()) {
			Zen.fillOval((int) x, (int) y, 3, 3);
			Zen.sleep(2);
			velocityY = velocityY + 0.01;
			if (y + velocityY > 400)
				velocityY = -Math.abs(0.9 * velocityY);
			x = x + velocityX;
			y = y + velocityY;
		}
	}

}

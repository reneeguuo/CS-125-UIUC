//UIUC CS125 FALL 2013 MP. File: MazeRunner.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2013-11-12T09:11:45-0600.037093451
//@author bfu3
public class MazeRunner {

	private int x, y;

	/** Initializes the MazeRunner with the x,y values */
	public MazeRunner(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static void main(String[] args) {
		boolean maze[][] = { 
				toTF("*****"),//x0
				toTF("*   *"),//x1	     WEST
				toTF("*** *"),//x2  SOUTH<<    >> NORTH ('y' direction)
				toTF("* * *"),//x3		 EAST
				toTF("*   *"),//x4
				toTF("*****") };
		String result1 = MazeRunner.shortestPath( 1,2,  3,1, maze);
		System.out.println(result1);


		// String[] path = {"E"+null,"WWW"+null,"WWW"};
		// int result = findShortestString(path, 0, 2);
		// System.out.println(result);
	}
	private static boolean[] toTF(String s) {
		boolean[] result = new boolean[s.length()];
		for (int i = 0; i < s.length(); i++)
			result[i] = s.charAt(i) != ' ';
		return result;

	}

	/** Moves the runner one unit. No error checking is performed.
	 * 'N':go North (increment y), S:decrement y, E(increment x), W(decrement x)
	 * character values other than N,S,E or W are ignored.
	 */
	void moveOne(char dir) {
		if (dir=='N') y++;
		if (dir=='E') x++;
		if (dir=='W') x--;
		if (dir=='S') y--;
	}
	/** Returns true if this maze runner is on the same (x,y) square
	 * as the parameter. Assumes that the parameter is non-null.
	 */
	public boolean caught(MazeRunner other) {
		if (other.x == this.x && other.y == this.y) return true;
		else return false;
	}

	/**
	 * Uses recursion to find index of the shortest string.
	 * Null strings are treated as infinitely long.
	 * Implementation notes:
	 * The base case if lo == hi.
	 * Use safeStringLength(paths[xxx]) to determine the string length.
	 * Invoke recursion to test the remaining paths (lo +1)
	 */
	static int findShortestString(String[] paths, int lo, int hi) {	
		if (lo==hi) return lo;
		int result = findShortestString(paths, lo+1, hi);
		return safeStringLength(paths[lo])>safeStringLength(paths[result]) ? result:lo;
	}

	/** Returns the length of the string or Integer.MAX_VALUE
	 * if the string is null.
	 * @param s
	 * @return
	 */
	static int safeStringLength(String s) {
		if (s==null) return Integer.MAX_VALUE;
		return s.length();
	}


	/* Returns a string representation of the shortest path between
	 * (x,y) and (tx,ty). e.g. a result of "NNEE"
	 * means to travel from (x,y) -> (tx,ty) go North twice, then East twice.
	 * blocked is a square boolean grid of points that cannot be used.
	 * If(x,y) are invalid coords (outside of the grid array) this method returns null.
	 * If(x,y) is on a blocked square, this method returns null. Otherwise,
	 * If(x,y) are already the same as the target position, returns an empty string.
	 * If there is no path between (x,y) and (tx,ty) the method returns null.
	 * 
	 * Implementation notes:
	 * Use the statements above for the base cases.
	 * For the recursion part:
	 * 1. Set the current position to blocked (so that the recursive method does not
	 * attempt to re-use this square again)
	 * 2. Collect all paths from the NSEW neighbors
	 * 3. Reset the current blocked position to false.
	 * 4. Use findShortestString to determine the shortest path
	 * 5. If its non-null then PREPEND the compass direction of that neighbor's path.
	 * e.g. if the Northern neighbor returned "EWWS" 
	 * the East neighbor returned "NWWWWWWWSEEEESS" and W and S Neighbor return null
	 * then return "N" + "EWWS"
	 * Otherwise, just return null as none of the neighbors found a path.
	 */
	public static String shortestPath(int x, int y, int tX, int tY, boolean blocked[][]) {
		//BASE CASES
		int wallx = blocked.length;
		int wally = blocked[0].length;
		if (x>=wallx || y>=wally || x<0 || y<0) return null;		//StartPoint on wall No path
		if (tX>=wallx || tY>=wally) return null;		//EndPoint on wall No path
		if (blocked[x][y] || blocked[tX][tY]) return null;
		if (x==tX && y==tY) return "";


		blocked[x][y] = true;
		String[] paths = {
			shortestPath(x, y+1, tX, tY, blocked),
			shortestPath(x, y-1, tX, tY, blocked),
			shortestPath(x+1, y, tX, tY, blocked),
			shortestPath(x-1, y, tX, tY, blocked),
		};
		blocked[x][y] = false;

		// TODO: Use findShortestString on paths
		// TODO: Return correct string with Compass direction prepended (or null)
		int i = findShortestString(paths, 0, paths.length-1);
		String[] chars = { "N", "S", "E", "W" };
		if (paths[i] != null) {
			paths[i] = chars[i] + paths[i];
			return paths[i];
		}
		return null;
	}

	/** Moves the runner towards the target position, if the
	 * shortest path can be found between the current and target position.
	 * Implementation notes: calls shortestPath, 
	 * if result is not null then send the first char to moveOne()
	 * Hint: watch out for the empty string when target = current position...
	 */
	public void chase(boolean maze[][], int targetX, int targetY) {
		// TODO: Implement chase
		// Use shortestPath, string.charAt,  moveOne
		String moves = shortestPath(getX(), getY(), targetX, targetY, maze);
                if (moves != null && moves.length() > 0)
                        moveOne(moves.charAt(0));
	}

}

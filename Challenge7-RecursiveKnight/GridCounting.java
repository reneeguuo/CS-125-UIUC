//UIUC CS125 FALL 2022 MP. File: GridCounting.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2022-11-12T09:11:45-0600.037093451
//@author angrave

public class GridCounting {
	/** Returns the total number of possible routes (paths) from
	 * (x,y) to (tx,ty).
	 * There are only three valid kinds of moves:
	 *  Increment x by one.
	 *  Increment x by two.
	 *  Increment y by one.
	 *  
	 *  Hint: You'll need to test two base cases.
	 */
	public static int count(int x,int y, int tx, int ty) {
		if(x>tx || y>ty) return 0;
		if (x==tx && y==ty) return 1;
		return count(x+1, y, tx, ty) + count(x+2, y, tx, ty) + count(x, y+1, tx, ty);
	}
}

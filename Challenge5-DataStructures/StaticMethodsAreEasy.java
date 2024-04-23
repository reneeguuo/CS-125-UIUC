//UIUC CS125 FALL 2022 MP. File: StaticMethodsAreEasy.java, CS125 Project: Challenge5-DataStructures, Version: 2022-10-14T13:54:31-0500.608726435
//@author angrave
public class StaticMethodsAreEasy {
// Oh no... Someone removed  the methods but left the comments!!
// Hint: Get the Geocache class working and passing its tests first.

	/**
	 * Returns an array of num geocaches. Each geocache is initialized to a random
	 * (x,y) location.
	 * if num is less than zero, just return an empty array of length 0.
	 * 
	 * @param num
	 *            number of geocaches to create
	 * @return array of newly minted Points
	 */
	public static Geocache[] createGeocaches(int num) {
		if (num<0)
			return new Geocache[0];
		else {
			Geocache[] array = new Geocache[num];
			for (int i=0; i<num; i++) {
				array[i] = new Geocache((int)(Math.random()*100), (int)(Math.random()*100));
			}
			return array;
		}
	}
	
	/**
	 * Modifies geocaches if the geocache's X value is less than the allowable minimum
	 * value.
	 * 
	 * @param p
	 *            array of geocaches
	 * @param minX
	 *            minimum X value.
	 * @return number of modified geocaches (i.e. x values were too small).
	 */
	public static int ensureMinimumXValue (Geocache[] p, double minX) {
		int count = 0;
		for (int i=0; i<p.length; i++) {
			if (p[i].getX() < minX) {
				p[i].setX(minX);
				count++;
			}
		}
		return count;
	}

	/**
	 * Counts the number of geocaches that are equal to the given geocache
	 * Hint: Use geocache.equals() method 
	 * @param p -
	 *            geocache array
	 * @param test -
	 *            test geocache (compared using .equal)
	 * @return number of matching geocaches
	 */
	public static int countEqual (Geocache[] p, Geocache test) {
		int count = 0;
		for (int i=0; i<p.length; i++) {
			if (p[i].equals(test))
				count++;
		}
		return count;
	}

}

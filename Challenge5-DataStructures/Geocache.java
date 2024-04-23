//UIUC CS125 FALL 2022 MP. File: Geocache.java, CS125 Project: Challenge5-DataStructures, Version: 2022-10-14T13:54:31-0500.608726435
/*
 * Create a class 'Geocache' with two private instance variables 'x' 'y' of type double and a private integer 'id'
 * .
 * A class variable 'count' will also be required to count the number of times a Geocache object has been created (instantiated).
 * Create two constructors - one which takes two double parameters (the initial values of x,y). The
 * second constructor will take another Geocache and initialize itself based on that geocache.
 * 
 * For both constructors set the Geocache's id to the current value of count (thus the first geocache will have the value zero)
 * when the Geocache is created, then increment the count value. 
 * 
 * Also create 'resetCount()' and getNumGeocachesCreated() which returns an int - the number of geocaches created since 
 * resetCount() method was called.
 * 
 * Create an equals method that takes an object reference and returns true if the given object equals this object.
 * Hint: You'll need 'instanceof' and cast to a (Geocache)
 * 
 * Create a toString() method that returns a string representation of this object in the form '(x,y)' where 'x' and 'y'
 * are the current values of x,y.
 * 
 * Create the four getX/getY/setX/setY methods for x,y.
 * However the setX() method will only change the Geocache's x value if the given value is between -1000 and 1000 exclusive (i.e. -1000<x<1000).
 * If the value is outside of this range, the new value is ignored and the Geocache's x value remains unchanged.
 *   
 * Create a get method for id.
* TODO: add your netid to the line below
 * @author Lei
 */
class Geocache {
	private static int count = 0;
	private double x;
	private double y;
	private int id;

	public Geocache(double x, double y) {
		this.x = x;
		this.y = y;
		this.id = count;
		count++;
	}

	public Geocache(Geocache geo) {
		this.x = geo.getX();
		this.y = geo.getY();
		this.id = count;
		count++;
	}

	public static void resetCount() {
		count = 0;
	}

	public static int getNumGeocachesCreated() {
		return count;
	}

	public String toString() {
		String description = "(" + x + "," + y + ")";
		return description;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public int getId() {
		return this.id;
	}

	public void setX(double x) {
		if (-1000<x && x<1000)
			this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	//Create an equals method that takes an object reference and returns true if the given object equals this object.
    //* Hint: You'll need 'instanceof' and cast to a (Geocache)
    public boolean equals(Geocache geo) {
    	if (geo instanceof Geocache) {
    		if (geo.getX() == this.x && geo.getY() == this.y)
    			return true;
    		else
    			return false;
    	}
    	return false;
    }
}
//UIUC CS125 FALL 2013 MP. File: Queue.java, CS125 Project: Challenge5-DataStructures, Version: 2013-10-14T13:54:31-0500.608726435
/*
 * 
 * TODO: add your netid to the line below
 * @author bfu3
 */
public class Queue {
	/** Adds the value to the front of the queue.
	 * Note the queue automatically resizes as more items are added. */

	private double[] value = new double[0];

	public void add(double value) {
		double[] oldValue = this.value;
		this.value = new double[oldValue.length+1];
		this.value[0] = value;
		for (int i=1; i<this.value.length; i++) {
			this.value[i] = oldValue[i-1];
		}
	}

	/** Removes the value from the end of the queue. If the queue is empty, returns 0 */
	public double remove() {
		if (isEmpty())
			return 0;

		double[] oldValue = this.value;
		this.value = new double[oldValue.length-1];
		for (int i=0; i<length(); i++) {
			this.value[i] = oldValue[i];
		}
		return oldValue[oldValue.length-1];
	}
	
	/** Returns the number of items in the queue. */
	public int length() {
		return this.value.length;
	}
	
	/** Returns true iff the queue is empty */
	public boolean isEmpty() {
		if (length()==0)
			return true;
		else
			return false;
	}
	
	/** Returns a comma separated string representation of the queue. */
	public String toString() {
		String description = "";
		for (int i=length()-1; i>=0; i--) {
			if(i==0)
				description = description + this.value[i];
			else
				description = description + this.value[i] + ",";

		}
		return description;
	}
}

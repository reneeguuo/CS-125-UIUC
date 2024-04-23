//UIUC CS125 FALL 2022 MP. File: GeocacheList.java, CS125 Project: Challenge5-DataStructures, Version: 2022-10-14T13:54:31-0500.608726435
/**
 * Complete the following GeocacheList, to ensure all unit tests pass.
 * There are several errors in the code below
 *
 * Hint: Get the Geocache class working and passing its tests first.
 * TODO: add your netid to the line below
 * @author Lei
 */
public class GeocacheList {
	private Geocache[] data = new Geocache[0];
	private int size = 0;

	public Geocache getGeocache(int i) {
		if (i<this.data.length && i>=0)
			return data[i];
		else
			return null;
	}

	public int getSize() {
		return this.data.length;
	}

	public GeocacheList() {
		this.data = new Geocache[0];
	}

	public GeocacheList(GeocacheList other, boolean deepCopy) {
		if (deepCopy) {
			Geocache[] otherData = other.getData();
			this.data = new Geocache[otherData.length];
			for (int i=0; i<this.data.length; i++) {
				this.data[i] = new Geocache(otherData[i].getX(), otherData[i].getY());
			}
		}
		else {
			this.data = other.getData();
		}
	}

	public void add(Geocache p) {

		Geocache[] old = this.data;
		this.data = new Geocache[old.length+1];
		for (int i = 0; i < this.data.length-1; i++) {
			this.data[i] = old[i];
		}
		this.data[this.data.length-1] = p;

	}

	public Geocache removeFromTop() {
		Geocache[] old = data;
		data = new Geocache[old.length-1];
		for (int i = 0; i < this.data.length; i++) {
			data[i] = old[i];
		}
		return old[old.length-1];
	}

	public String toString() {
		StringBuffer s = new StringBuffer("GeocacheList:");
		for (int i = 0; i < this.data.length; i++) {
			if (i==this.data.length-1)
				s.append(data[i]);
			else
				s.append(data[i]+",");


		}
		System.out.println(s.toString());
		return s.toString();
	}

	public Geocache[] getData() {
		return this.data;
	}
}

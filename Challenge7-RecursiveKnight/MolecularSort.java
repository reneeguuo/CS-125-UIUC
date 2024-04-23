//UIUC CS125 FALL 2022 MP. File: MolecularSort.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2022-11-12T09:11:45-0600.037093451
//@author angrave
public class MolecularSort {

	/** Sorts each xyz coordinate using it's Z value (coord[i][2] <= coord[j][2] for i<j). */
	static void sortCoordsByZ(double[][] coords) {
		// TODO: Implement this wrapper method.
		//All the work is performed by recursiveSort
		recursiveSort(coords, 0, coords.length-1);
	}

	/**
	 * recursively sorts coordinates entries by their z value. Entries between
	 * lo and hi inclusive are considered.
	 */
	static void recursiveSort(double[][] coords, int lo, int hi) {
		// TODO: write the four lines of a recursive selection sort here.
		if(lo==hi) return;
		int result = findIndexOfZMinimum(coords, lo, hi);
		swap(coords, lo, result);
		recursiveSort(coords, lo+1, hi);
	}

	/**
	 * returns the index of the entry with the lowest Z value. Entries between
	 * lo and hi inclusive are considered.
	 */
	static int findIndexOfZMinimum(double[][] coords, int lo, int hi) {
		if (lo==hi) return lo;
		if (lo+1==hi) return coords[lo][2]>coords[hi][2] ? hi:lo;
		int result = findIndexOfZMinimum(coords, lo+1, hi);
		return  coords[lo][2]>coords[result][2] ? result:lo;
		// TODO: Replace this with your three lines of recursive code
	}
	

	/* Swaps the (x,y and z) values of the i-th and j-th coordinates.*/
	static void swap(double[][] coords, int i, int j) {
		double[] tmp = coords[i];
		coords[i] = coords[j];
		coords[j] = tmp;
	}
}

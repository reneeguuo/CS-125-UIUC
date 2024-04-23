//UIUC CS125 FALL 2022 MP. File: SelectionSort.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2022-11-12T09:11:45-0600.037093451
//@author angrave
public class SelectionSort {
	/**
	 * Sorts the entire array using selection sort
	 * This is just a wrapper method that calls the 
	 * recursive method with the correct parameter lo,hi values.
	 * @param data
	 */
	public static void sort(double[] data) {
		sort(data, 0, data.length-1);
	}

	/** Recursively sorts the sub array lo...hi using selection sort algorithm.*/
	public static void sort(double[] data, int lo, int hi) {
		int minIndex = findMin(data, lo, hi);
		swap(data, minIndex, lo);
		
		if (lo<hi)
			sort(data, lo+1, hi);
		return;
	}

	/** Helper method for selection sort: Swaps values at indices i and j*/
	public static void swap(double[] data, int i, int j) {
		double tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

	/**
	 * Recursively finds the position of the smallest value of the values lo...hi (inclusive). 
	 * @param data
	 * @param lo
	 * @param hi
	 * @return
	 */
	public static int findMin(double[] data, int lo, int hi) {
		double min = data[lo];
		int index = lo;
		for (int i=lo+1; i<=hi; i++) {
			if (data[i]<min) {
				min = data[i];
				index = i;
			}
		}
		return index;
	}
}








//UIUC CS125 FALL 2022 MP. File: BinarySearch.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2022-11-12T09:11:45-0600.037093451
//@author angrave
public class BinarySearch {
	/** Wrapper method. Just runs the recursive search method below for the entire array*/
	public static boolean search(int[] array, int key) {
		return search(array, key, 0, array.length - 1);
	}

	/**
	 * Recursive search using Divide and Conquer approach:
	 * The given array is already sorted so we can very quickly discover if the key is in the array or not.
	 * Hint: For the recursive case check the value at (lo+hi)/2
	 * and proceed accordingly.
	 */
	static boolean search(int[] array, int key, int lo, int hi) {
		if (lo>hi)
			return false;
		
		int mi = (lo+hi)/2;
		if (array[mi]==key)
			return true;
		else if (array[mi]>key)
		    return search(array, key, lo, mi-1);
		else if (array[mi]<key)
		    return search(array, key, mi+1, hi);
		else
			return false;
	}
}

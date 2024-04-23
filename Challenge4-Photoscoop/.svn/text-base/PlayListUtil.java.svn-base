//UIUC CS125 FALL 2013 MP. File: PlayListUtil.java, CS125 Project: Challenge4-Photoscoop, Version: 2013-10-05T03:23:21-0500.804813457
/**
 * Add you netid here..
 * @author angrave
 *
 */
public class PlayListUtil {

	/**
	 * Debug ME! Use the unit tests to reverse engineer how this method should work.
	 * Hint: Fix the formatting (shift-cmd-F) to help debug the following code
	 * @param list
	 * @param maximum
	 */
	public static void list(String[] list, int maximum) {
		if (maximum == -1) {
			maximum = list.length;
		}

		for (int i=0; i<maximum; i++) {
			System.out.printf("%d. %s\n", i+1, list[i]);
		}
	}

	/**
	 * Appends or prepends the title
	 * @param list
	 * @param title
	 * @param prepend if true, prepend the title otherwise append the title
	 * @return a new list with the title prepended or appended to the original list
	 */
	public static String[] add(String[] list, String title, boolean prepend) {
		String[] newList = new String[list.length+1];

		if (prepend) {
			newList[0] = title;
			for (int i=0; i<list.length; i++) {
				newList[i+1] = list[i];
			}
		}
		if (!prepend) {
			for (int i=0; i<list.length; i++) {
				newList[i] = list[i];
			}
			newList[newList.length-1] = title;
		}
		return newList;
	}
	/**
	 * Returns a new list with the element at index removed.
	 * @param list the original list
	 * @param index the array index to remove.
	 * @return a new list with the String at position 'index', absent.
	 */
	public static String[] discard(String[] list, int index) {
		String[] newList = new String[list.length-1];
		int a = 0;
		for (int i=0; i<list.length-1; i++) {
			if (i==index)
				a++;
			newList[i] = list[a+i];
		}
		return newList;
	}

}

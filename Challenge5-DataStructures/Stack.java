//UIUC CS125 FALL 2022 MP. File: Stack.java, CS125 Project: Challenge5-DataStructures, Version: 2022-10-14T13:54:31-0500.608726435
/*
 * @author angrave
 */
public class Stack {
	private String[] stackValue = new String[0];

	/** Adds a value to the top of the stack.*/
	public void push(String value){
		String[] oldStackValue = this.stackValue;
		this.stackValue = new String[oldStackValue.length+1];
		this.stackValue[this.stackValue.length-1] = value;
		for (int i=0; i<oldStackValue.length; i++) {
			this.stackValue[i] = oldStackValue[i];
		}
	}
	
	/** Removes the topmost string. If the stack is empty, returns null. */
	public String pop() {
		if (isEmpty())
			return null;

		String[] oldStackValue = this.stackValue;
		this.stackValue = new String[oldStackValue.length-1];
		for (int i=0; i<this.stackValue.length; i++) {
			this.stackValue[i] = oldStackValue[i];
		}
		return oldStackValue[oldStackValue.length-1];
	}
	
	/** Returns the topmost string but does not remove it. If the stack is empty, returns null. */
	public String peek() {
		if (isEmpty())
			return null;
		return this.stackValue[this.stackValue.length-1];
	}
	
	/** Returns true iff the stack is empty */
	public boolean isEmpty() {
		if (this.stackValue.length==0)
			return true;
		else
			return false;
	}

	/** Returns the number of items in the stack. */
	public int length() {
		return this.stackValue.length;
	}
	
	/** Returns a string representation of the stack. Each string is separated by a newline. Returns an empty string if the stack is empty. */
	public String toString() {
		if (isEmpty())
			return "";

		String description = "";
		for (int i=0; i<this.stackValue.length; i++) {
			description = description + this.stackValue[i] + "\n";
		}
		return description;
	}
}

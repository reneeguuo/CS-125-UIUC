//UIUC CS125 FALL 2013 MP. File: KeyValueMap.java, CS125 Project: Challenge5-DataStructures, Version: 2013-10-14T13:54:31-0500.608726435
//@author bfu3
import java.awt.Color;

public class KeyValueMap { // aka Dictionary or Map

	/**
	 * Adds a key and value. If the key already exists, it replaces the original
	 * entry.
	 */
	private Color[] value = new Color[0];
    private String[] key = new String[0];

	public void add(String key, Color value) {
		if (exists(key))
			remove(key);

		Color[] oldValue = this.value;
		String[] oldKey = this.key;

		this.value = new Color[this.value.length+1];
		this.key = new String[this.key.length+1];

		for (int i=0; i<oldKey.length; i++) {
			this.value[i] = oldValue[i];
			this.key[i] = oldKey[i];
		}
		this.key[this.key.length-1] = key;
		this.value[this.value.length-1] = value;
	}

	/**
	 * Returns particular Color object previously added to this map.
	 */
	public Color find(String key) {
		for (int i=0; i<this.key.length; i++) {
			if (this.key[i].equals(key)) {
				return this.value[i];
			}
		}
		return null;
	}

	/**
	 * Returns true if the key exists in this map.
	 */
	public boolean exists(String key) {
		for (int i=0; i<this.key.length; i++) {
			if (this.key[i].equals(key))
				return true;
		}
		return false;
	}

	/**
	 * Removes the key (and the color) from this map.
	 */
	public void remove(String key) {
		if (!exists(key))
			return;

		int removeIndex = 0;
		for (int i=0; i<this.key.length; i++) {
			if (this.key[i].equals(key))
				removeIndex = i;
		}

		Color[] oldValue = this.value;
		String[] oldKey = this.key;

		this.value = new Color[this.value.length-1];
		this.key = new String[this.key.length-1];
		
		int j=0;
		for (int i=0; i<oldKey.length; i++) {
			if (i==removeIndex)
				continue;
			this.key[j] = oldKey[i];
			this.value[j] = oldValue[i];
			j++;
		} 
	}
}

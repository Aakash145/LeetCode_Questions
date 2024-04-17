package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LC242_ValidAnagram {

	// Basic Solution:
	public boolean isAnagramFirst(String s, String t) {

		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();
		Arrays.sort(sc);
		Arrays.sort(tc);
		if (new String(sc).equals(new String(tc)))
			return true;
		return false;

	}

	// Using Hashing Solution:
	public boolean isAnagramSecond(String s, String t) {
		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();

		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Integer> hashMapS = new HashMap<>();
		HashMap<Character, Integer> hashMapT = new HashMap<>();

		for (int i = 0; i < sc.length; i++) {
			if (hashMapS.containsKey(sc[i])) {
				hashMapS.put(sc[i], hashMapS.get(sc[i]) + 1);
			} else {
				hashMapS.put(sc[i], 1);
			}
		}

		for (int i = 0; i < tc.length; i++) {
			if (hashMapT.containsKey(tc[i])) {
				hashMapT.put(tc[i], hashMapT.get(tc[i]) + 1);
			} else {
				hashMapT.put(tc[i], 1);
			}
		}

		if (hashMapS.equals(hashMapT)) {
			return true;
		}
		return false;

	}

}

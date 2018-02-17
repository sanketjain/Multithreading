package mlt.waitNotify;

public class GFG {
	static final int no_of_chars = 256;

	// Function to find smallest window containing
	// all characters of 'char'
	static String findSubString(char[] ch_array, String str) {
		int length1 = str.length();
		int length2 = ch_array.length;

		// check if string's length is less than chartern's
		// length. If yes then no such window can exist
		if (length1 < length2) {
			System.out.println("No such window exists");
			return "";
		}

		int hash_char[] = new int[no_of_chars];
		int hash_str[] = new int[no_of_chars];

		// store occurrence of characters
		for (int index = 0; index < length2; index++) {
			hash_char[ch_array[index]]++;
		}

		int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;

		// start traversing the string
		int count = 0; // count of characters
		for (int countCharacter = 0; countCharacter < length1; countCharacter++) {
			// count occurrence of characters of string
			hash_str[str.charAt(countCharacter)]++;

			// If string's char matches with chartern's char
			// then increment count
			if (hash_char[str.charAt(countCharacter)] != 0
					&& hash_str[str.charAt(countCharacter)] <= hash_char[str.charAt(countCharacter)]) {
				count++;
			}

			// if all the characters are matched
			if (count == length2) {
				// Try to minimize the window i.e., check if
				// any character is occurring more no. of times
				// than its occurrence in chartern, if yes
				// then remove it from starting and also remove
				// the useless characters.
				while (hash_str[str.charAt(start)] > hash_char[str.charAt(start)]
						|| hash_char[str.charAt(start)] == 0) {

					if (hash_str[str.charAt(start)] > hash_char[str.charAt(start)])
						hash_str[str.charAt(start)]--;
					start++;
				}

				// update window size
				int len_window = countCharacter - start + 1;
				if (min_len > len_window) {
					min_len = len_window;
					start_index = start;
				}
			}
		}

		// If no window found
		if (start_index == -1) {
			System.out.println("No such window exists");
			return "";
		}

		// Return substring starting from start_index
		// and length min_len
		return str.substring(start_index, start_index + min_len);
	}

	// Driver Method
	public static void main(String[] args) {
		String str = "this is a test string";
		char[] ch = new char[] { 't', 'i', 's', 't' };

		System.out.print("Smallest window is :  n" + findSubString(ch, str));
	}
}
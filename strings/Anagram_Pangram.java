package strings;

public class Anagram_Pangram {

	//Pangram is a sentence containing all letters of the alphabet.
	public static String isPangram(String str) {
		int[] arr = new int[256];
		str = str.toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);
			arr[ascii]++;
		}

		for (int i = 65; i <= 90; i++) {
			if (arr[i] < 1) {
				return "not pangram";
			}
		}
		return "pangram";
	}
	// Strings like cinema and iceman are anagrams. In the same fashion, we can check if two strings are permutations.
	// NOTE: Every anagram is a permutation, but not every permutation is an anagram.
	public static boolean isAnagram(String str, String str2) {

		// If Iceman and cinema were anagrams we add this little snippet here :)
		str = str.toLowerCase();
		str2 = str2.toLowerCase();

		if (str.length() != str2.length()) {
			return false;
		}

		int[] arr = new int[256];
		for (int i = 0; i < str.length(); i++) {
			int asciiPosition = str.charAt(i);
			arr[asciiPosition]++;
		}

		for (int i = 0; i < str2.length(); i++) {
			int asciiPosition = str2.charAt(i);
			if (arr[asciiPosition] > 0) { // check if there is anything in arr at asciiPosition corresponding to a character in str2.
				arr[asciiPosition]--; // if there are two t's, checking if a t exists is not enough, so we decrement
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); //is pangram
		System.out.println(isPangram("The quick brown fox jumps over the lazy do"));  //not a pangram
		System.out.println(isAnagram("Iceman", "Cinema"));  //true
		System.out.println(isAnagram("iceman", "Cinema")); //true

	}

}

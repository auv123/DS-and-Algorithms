package strings;

import java.util.HashSet;
import java.util.Set;

public class Palindromes {

	// This method takes a String and checks if it is a palindrome.
	public static boolean isStringPalindrome(String str) {
		int middle = str.length() / 2;
		for (int i = 0; i < middle; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	// This method takes a string as a parameter and returns all palindromes
	// contained within the string.
	public static Set<String> findAllPalindromes(String str){
		Set<String> set = new HashSet<String>();
		StringBuilder builder = new StringBuilder();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if(count<=2){
					count++;
					builder.append(str.charAt(j));
				}
				else{
					if(isStringPalindrome(builder.toString())){
						set.add(builder.toString());
					}
					builder.append(str.charAt(j));
				}
			}
			builder = new StringBuilder();
			count = 0;
		}	
	  return set;
	}
	public static void main(String[] args) {
		String str = "malam";
		String str3 = "maalaamsisadda";
		String str2 = "abcdcbabc";
		String str4 = "aaaaaa";

		System.out.println(Palindromes.findAllPalindromes(str));
		System.out.println(Palindromes.findAllPalindromes(str2));
		System.out.println(Palindromes.findAllPalindromes(str3));
		System.out.println(Palindromes.findAllPalindromes(str4));

	}

}
package strings;

public class Encode_Decode_Strings {

	// If the input string is aaattcccc, the output string should be 3a2t4c.
	public static String encodeString(String str) {
		if (str == null) return str;
		StringBuilder builder = new StringBuilder();
		if (str.length() == 1) return builder.append("1").append(str.charAt(0)).toString();
		int count = 1;
		char prev = str.charAt(0);
		char curr;
		for (int i = 1; i < str.length(); i++) {
			curr = str.charAt(i);
			if (prev == curr) {
				count++;
			} else {
				builder.append(count).append(prev);
				count = 1;
				prev = curr;
			}
		}
		builder.append(count).append(prev);
		return builder.toString();
	}

	// If the input string is 3a2t14c, the output string should be 3 a's 2 t's
	// and 14 c's .
	public static String decodeString(String str) {
		if (str == null) return str;
		StringBuilder builder = new StringBuilder();
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				builder.append(str.charAt(i));
			} else {
				int count = Integer.parseInt(builder.toString());
				for (int j = 0; j < count; j++) {
					output.append(str.charAt(i));
				}
				builder = new StringBuilder();
			}
		}
		return output.toString();
	}

	public static void main(String[] args) {
		
		System.out.println(encodeString("aaattcccc"));
		System.out.println(encodeString("aaa"));
		System.out.println(encodeString("a"));
		
		System.out.println(decodeString("3a2t14c"));
		System.out.println(decodeString("12e10b1i"));
		System.out.println(decodeString("5a"));

	}

}

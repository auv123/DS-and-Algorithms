package strings;

public class Reverse {
	
	public static String reverseStringIteratively(String str){
		StringBuilder builder = new StringBuilder();		
		for (int i = str.length()-1; i >= 0; i--) {
			builder.append(str.charAt(i));
		}		
		return builder.toString();		
	}
	
	public static String reverseStringRecursively(String str){
		if(str.length() == 0){
			return str;
		}
		return reverseStringRecursively(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println(reverseStringIteratively("Hello"));
		System.out.println(reverseStringRecursively("Hello"));

	}

}

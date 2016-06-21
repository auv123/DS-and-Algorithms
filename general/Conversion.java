package general;

public class Conversion {
	
	public static String convertDecimalToBinary(int n){
		String result = "";
	    while(n > 0){
	        int mod = n % 2;
	        result = mod + result;
	        n /= 2;
	    }
	    return result;
	}
	
	public static String convertBinaryToDecimal(int n){
		String str = String.valueOf(n);
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum = (int) (sum + Math.pow(2, str.length()-1-i));
		}
		return String.valueOf(sum);
	}
	
	public static void main(String[] args) throws Exception {

		System.out.println(Conversion.convertDecimalToBinary(7));
		System.out.println(Conversion.convertBinaryToDecimal(111));

	}
}

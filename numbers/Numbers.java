package numbers;

public class Numbers {
	
	public static int reverseInt(int num){
		int lastNum;
		int b = 0;
		while(num/10 != 0){
			lastNum = num % 10;
			b = (b*10) + lastNum;
			num = num/10;
		}
		b = b*10 + num;
		return b;	
	}
	
	public static int addDigits(int num){
		int sum = 0;
		
		while((num/10) != 0){
			int mod = num % 10;
			sum = sum + mod;
			int div = num/10;
			num = div;
		}
		
		sum = sum + num;
		return sum;
	}
	
	public static boolean isBinaryNum(int num){
		
		String str = String.valueOf(num);
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if((arr[i] != '0') && (arr[i] != '1')){
				return false;
			}
		}		
		return true;
	}
	
	public static void swapWithoutAdditionalVariable(int x, int y){
		System.out.println(x + " is x, " + y + " is y");
		x = x + y;
		y = x - y;
		x = x - y;	
		System.out.println(x + " is now x, " + y + " is now y");
	}	

	public static void main(String[] args) {
		Numbers.swapWithoutAdditionalVariable(2, 5);
	}

}

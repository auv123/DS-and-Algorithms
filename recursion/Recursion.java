package recursion;

public class Recursion {
	
	public static int findGcd(int x, int y){
		if(y % x == 0){
			return x;
		}
		return findGcd(y%x,x);
	}
	
	public static int euclidGcd(int x, int y){
		if(x > y){
			return -1;
		}
		else if(y % x != 0){
			return euclidGcd((y%x), x);
		}
		else{
			return x;
		}
	}
	
	//recursive way
	public static int factorial(int x){
		if(x<=2){
			return x; 
		}
		else{
			return x*factorial(x-1);
		}
	}
	
	//iterative way
	public static int factorial2(int x){
		int result = 1;
		for (int i = 1; i <= x; i++) {
			result = result * i;
		}
		return result;			
	}
	
	public static int add(int a, int b){
		if(a==0){return b;}
		if(b==0){return a;}
		
		return add(--a, ++b);//NOTE: a++, b-- does NOT work...must be pre incremented!
	}
	
	public static int sumOfSq(int x){
		if(x<=1){
			return x*x; //doing x*x and not x because of negative numbers
		}
		else{
			return (x*x)+sumOfSq(x-1);
		}
	}

	public static void main(String args[]){

		System.out.println(Recursion.sumOfSq(3));
		System.out.println(Recursion.findGcd(20, 55));
		System.out.println(Recursion.euclidGcd(20, 55));
		System.out.println(Recursion.factorial(5));
		System.out.println(Recursion.factorial2(4));
		System.out.println(Recursion.add(2,3));
	}
}

package recursion;

public class Recursion {
    
    //Find the fibonacci number at the nth place. Ex: n=6, value=13
    public static int findFibonacciNumberAtNthPlace(int n){
        if((n==0) || (n==1)){
            return 1;
        }
        else{
            return (findFibonacciNumberAtNthPlace(n-1) + findFibonacciNumberAtNthPlace(n-2));
        }
    }
    
    //Print all the fibonacci numbers until num. Ex: num=6, output = 1 1 2 3 5 8 13
    public static void printAllFibonacciNumberUntilNum(int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(findFibonacciNumberAtNthPlace(i) + " ");
        }
        System.out.println();
    }
	
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
	
	//Recursive way
	public static int factorial(int x){
		if(x<=2){
			return x; 
		}
		else{
			return x*factorial(x-1);
		}
	}
	
	//Iterative way
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
        
        System.out.println(findFibonacciNumberAtNthPlace(6));
        printAllFibonacciNumberUntilNum(6);
		System.out.println(Recursion.sumOfSq(3));
		System.out.println(Recursion.findGcd(20, 55));
		System.out.println(Recursion.euclidGcd(20, 55));
		System.out.println(Recursion.factorial(5));
		System.out.println(Recursion.factorial2(4));
		System.out.println(Recursion.add(2,3));
	}
}

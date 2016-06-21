package recursion;

public class TowerOfHanoi {
	
	private static int hanoiStepCount = 1;

	public static void move(int n, char A, char C, char B){ //Tower of Hanoi question...move(n, A, C, B) = move(n-1, A, B, C) +print +move(n-1,B,C,A)		
		if(n==1){
			System.out.println("step " + hanoiStepCount + ": moving "+ n +" from "+ A + " to "+ C);
			hanoiStepCount++;
		}
		else{
			move(n-1, A, B, C);
			System.out.println("step " + hanoiStepCount + " :moving " + n + " from "+ A + " to "+ C );
			hanoiStepCount++;
			move(n-1, B, C, A);
		}				
	}
	
	public static void main(String[] args) {
		TowerOfHanoi.move(4,'A','C','B');
		TowerOfHanoi.move(2,'A','C','B');
		TowerOfHanoi.move(3,'A','C','B');
	}

}

package search;

public class BinarySearch {
	
	public static int binarySearchIterative(int[] arr, int num){
		if(arr == null) return 0;
		int start= 0;
		int end = arr.length - 1;
		
		while(start <= end){
			int m = (int) Math.floor((start + end)/2);
			if(arr[m] == num) return m;
			if(num < arr[m]){
				end = m - 1;
			}
			else{
				start = m + 1;				
			}
		}		
		return -1;		
	}
	
	public static int binarySearchRecursive(int[] arr, int num){
		return binarySearchRecursive(arr, num, 0, arr.length - 1);
	}

	public static int binarySearchRecursive(int[] arr, int num, int start, int end) {
		if(start > end) return -1;		
		int m = (int) Math.floor((start + end)/2);
		if(arr[m] == num) return m;
		
		if(num < arr[m]){
			return binarySearchRecursive(arr, num, start, m -1 );
		}
		else{
			return binarySearchRecursive(arr, num, m + 1, end);	
		}
	}
	
	public static void main(String[] args){
		int[] arr = {2,4,5,8,9,11,12,17,20,22};
		
		System.out.println(binarySearchIterative(arr, 20));
		System.out.println(binarySearchIterative(arr, 2));
		System.out.println(binarySearchIterative(arr, 17));
		System.out.println(binarySearchIterative(arr, 5));
		System.out.println(binarySearchIterative(arr, 23));
		
		System.out.println(binarySearchRecursive(arr, 20));
		System.out.println(binarySearchRecursive(arr, 2));
		System.out.println(binarySearchRecursive(arr, 17));
		System.out.println(binarySearchRecursive(arr, 5));
		System.out.println(binarySearchRecursive(arr, 23));
	}

}

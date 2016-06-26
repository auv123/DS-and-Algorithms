

/**
 * Bubble Sort is the simplest sorting algorithm and has a time complexity of O(n^2).
 */
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		boolean flag = true;
		int last = arr.length - 1;
		// Continue loop only if swapping of arr has occurred
		while (flag) {
			flag = false;
			for (int i = 0; i < last; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					flag = true; // Set flag to true indicating swapping occurred
				}
			}
			// After each pass the largest element is moved to the end of array
			last--;
		}

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[9];
		arr[0] = 4;
		arr[1] = 2;
		arr[2] = 8;
		arr[3] = 45;
		arr[4] = 12;
		arr[5] = 1;
		arr[6] = 5;
		arr[7] = 3;
		arr[8] = 15;

		print(arr);
		System.out.println();
		BubbleSort.bubbleSort(arr);
		print(arr);
	}

}

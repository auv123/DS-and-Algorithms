package merge;

public class MergeTwoSortedArrays {
	
	public static int[] merge2Arrays(int[] a1, int[] a2){
		
		if(a1 == null) return a2;
		if(a2 == null) return a1;
		int[] a3 = new int[a1.length+a2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(a1.length > i && a2.length > j){
			if(a1[i] < a2[j]){
				a3[k++] = a1[i++];
			}
			else if(a1[i] >= a2[j]){
				a3[k++] = a2[j++];
			}
		}
		while(a1.length > i){
			a3[k++] = a1[i++];
		}
		while(a2.length > j){
			a3[k++] = a2[j++];
		}		
		return a3;
	}

	public static void main(String[] args) {
		//test mergeArr
		int a1[] = {1,3,5,6,10,15};			
		int a2[] = {4,7,8,11};			
		int a3[] = MergeTwoSortedArrays.merge2Arrays(a1, a2);				
		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i]+ " ");			
		}		
	}

}

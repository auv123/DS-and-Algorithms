package merge;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrayLists {
	
	public static List<Integer> merge2ArrayLists(List<Integer> l1, List<Integer> l2){
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		List<Integer> l3 = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		
		while(l1.size() > i && l2.size() > j){
			if(l1.get(i) < l2.get(j)){
				l3.add(l1.get(i));
				i++;
			}
			else if(l1.get(i) >= l2.get(j)){
				l3.add(l2.get(j));
				j++;
			}
		}
		while(l1.size() > i){
			l3.add(l1.get(i));
			i++;
		}
		while(l2.size() > j){
			l3.add(l2.get(j));
			j++;
		}
		return l3;
	}

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(5);
		l1.add(6);
		l1.add(10);
		l1.add(15);
		l1.add(17);
				
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(4);
		l2.add(7);				
		l2.add(8);
		l2.add(11);
		l2.add(16);
		l2.add(20);
		
		List<Integer> list = MergeTwoSortedArrayLists.merge2ArrayLists(l1, l2);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}		
	}

}


//Note: We have assumed that the Node class contains data(of type int) and a pointer to the next node;
public class MergeTwoSortedLinkedLists {
	
	public Node mergeTwoSortedLinkedLists(Node n1, Node n2){
		Node head;		
		if(n1.data <= n2.data){
			head = n1;
		}
		//Ensure that n1 will always be the head(and the smaller node)
		else{
			head = n2;
			n2 = n1;
			n1 = head;
		}
		
		while(n1.next != null){
			if(n1.next.data > n2.data){
				Node temp = n1.next;
				n1.next = n2;
				n2 = temp;
			}
		  n1 = n1.next;
		}
		n1.next = n2;
		return head;		
	}

}

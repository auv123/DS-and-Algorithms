package trees;

public class BinarySearchTree {
	
	public void inOrder(Node root){
		if(root == null) return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	public void preOrder(Node root){
		if(root == null) return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void postOrder(Node root){
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
    
    public Node findSmallestNode(Node root){
        if(root == null) return null;
        Node curr = root;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
    
    public Node findLargestNode(Node root){
        if(root == null) return null;
        Node curr = root;
        while(curr.right != null){
            curr = curr.right;
        }
        return curr;
    }
    
    public int findHeightOfTree(Node node){
		if(node == null) return 0;
		return Math.max(findHeightOfTree(node.left), findHeightOfTree(node.right)) + 1;
	}
    
    public boolean areEqual(Node n1, Node n2){
		if(n1 == n2) return true;
		if(n1 == null || n2 == null) return false;
		return n1.data == n2.data && areEqual(n1.left, n2.left) && areEqual(n1.right, n2.right);
	}

}

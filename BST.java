import java.util.*;
class BSTStructure{
	private Node root;
    private class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
    private void insert(Node n){
          if(root == null){
          	root = n;
          	return;
          }
          else{
            Node curr = root;
            Node par = root;
            while(curr!=null){
            	par = curr;
            	if(curr.data < n.data)
            		curr = curr.right;
            	else
            		curr = curr.left;
            }
            if(n.data < par.data)
            	par.left = n;
            else
            	par.right = n;
          }
    }
	public void insert(int data){
        Node n = new Node(data);
        insert(n);
	}
	private void display(Node root){
		if(root == null)
			return;
		display(root.left);
				System.out.print(root.data+"-->");

		display(root.right);
	}
	public void display(){
         display(root);
	}
	private boolean searchKey(Node root,int data){
		if(root==null)
			return false;
		if(root.data == data)
			return true;

		return searchKey(root.left,data) || searchKey(root.right,data);
	}
	public boolean searchKey(int data){
		return searchKey(root,data);
	}

}


class BST{
	public static void main(String[] args) {
		BSTStructure bst =new BSTStructure();
		bst.insert(10);
		bst.insert(9);
		bst.insert(11);
		bst.insert(15);
		bst.insert(7);
		bst.insert(12);
		System.out.println(bst.searchKey(7));
		System.out.println(bst.searchKey(4));
		bst.display();
	}
}

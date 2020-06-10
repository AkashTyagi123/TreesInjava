import java.util.*;
class TreeStructure{
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
    private void insert(Node n,char pos){
          if(root == null){
          	root = n;
          	return;
          }
          else{
          	
          }
    }
	public void insert(int data,char pos){
        Node n = new Node(data);
        insert(n,pos);
	}
	public void display(){

	}

}

}

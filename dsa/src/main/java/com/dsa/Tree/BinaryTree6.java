package com.dsa.Tree;

/*
 * 
convert binary tree to DLL or flatten the binary tree
you can say In order traversal of tree is linked list.

*/
public class BinaryTree6 {
	
	int idx = -1;
	Node root;
	
	static class Node{
		
		Node left;
		Node right;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	 Node createTree(Integer [] arr) {
		 idx++;
		 Node root = null;
		 if(arr[idx] == null) {
			 return null;
		 }
		 root = new Node(arr[idx]);
		 root.left = createTree(arr);
		 root.right = createTree(arr);
		 return root;
		
		
	}
	 
	 void inOrder(Node root) {
		 
		 if(root == null) {
			 return;
		 }
		 
		 inOrder(root.left);
		 System.out.print(root.data + " ");
		 inOrder(root.right);
	 }
	 
	 Node head = null;
	 Node prev = null;
	 void convertToDLL(Node root) {
		 
		 if(root == null){
			 return;
		 }
		 
		 convertToDLL(root.left);
		 if(head == null) {
			 head = root;
		 }else {
			prev.right = root;
			root.left = prev;
			 
		 }
		 
		 prev = root;
		 
		 convertToDLL(root.right);
	 }
	
	

	public static void main(String[] args) {
		BinaryTree6 bt = new BinaryTree6();
		Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
				null };
		Node root = bt.createTree(arr);
		bt.inOrder(root);
		bt.convertToDLL(root);
		System.out.println("---printing DLL");
		
		while(bt.head != null) {
			System.out.print(bt.head.data + " ");
			bt.head = bt.head.right;
			
		}
		
	}

}

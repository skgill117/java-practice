package com.dsa.Tree.BST;

/*
 * here we are inserting data using iterative approch
time complexity - O(logn)
space complexty - O(1)

*/

public class BinarySearchTree1 {

	private Node root;

	public BinarySearchTree1() {
		root = null;
	}

	class Node {

		Node left;
		Node right;
		int data;

		public Node(int data) {
			this.data = data;
		}

	}

	public void insert(int data) {
		Node node = new Node(data);

		if (root == null) {
			root = node;
			return;
		}

		Node curr = root;
		Node parent = null;

		while (curr != null) {
			parent = curr;
			if (data < curr.data) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}

		if (data < parent.data) {
			parent.left = node;
		} else {
			parent.right = node;
		}

	}

	public Node search(Node root, int data) {

		if (null == root || data == root.data)
			return root;

		if (data < root.data)
			return search(root.left, data);
		else
			return search(root.right, data);

	}

	public Node deleteNode(Node root, int data) {
		if (root == null)
			return root;

		if (data < root.data) {
			root.left = deleteNode(root.left, data);
		} else if (data > root.data) {
			root.right = deleteNode(root.right, data);
		} else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			root.data = minValFromRight(root.right);

			root.right = deleteNode(root.right, root.data);
		}

		return root;

	}

	private int minValFromRight(Node root) {

		while (root.left != null) {
			root = root.left;
		}
		return root.data;
	}

	public void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);

		System.out.print(root.data + "  ");

		inOrder(root.right);
	}

	public static void main(String[] args) {

		BinarySearchTree1 bst = new BinarySearchTree1();
		bst.insert(30);
		bst.insert(45);
		bst.insert(25);
		bst.insert(50);
		bst.insert(47);
		bst.insert(55);
		bst.insert(12);
		bst.insert(6);
		bst.insert(20);
		bst.insert(40);

		bst.inOrder(bst.root);

		System.out.println("\r\n" + "search data in binary search tree --- ");

		Node searchedNode = bst.search(bst.root, 12);

		if (null != searchedNode) {
			System.out.println("searched data ->  " + searchedNode.data);
		}
		
		System.out.println("\r\n" + "deleting node - 45");
		bst.deleteNode(bst.root, 45);
		bst.inOrder(bst.root);

	}

}

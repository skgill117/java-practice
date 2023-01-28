package com.dsa.Tree.BST;

/*
 * here we are inserting data using recursion
time complexity - O(logn)
space complexty - O(n)
*/

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
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

		root = insertRecursively(root, data);

	}

	private Node insertRecursively(Node root, int data) {

		if (root == null) {
			return new Node(data);
		}

		if (data < root.data) {
			root.left = insertRecursively(root.left, data);
		} else {
			root.right = insertRecursively(root.right, data);
		}

		return root;
	}

	public Node search(Node root, int data) {

		if (null == root || data == root.data)
			return root;

		if (data < root.data)
			return search(root.left, data);
		else
			return search(root.right, data);

	}

	public void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);

		System.out.print(root.data + "  ");

		inOrder(root.right);
	}

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(30);
		bst.insert(25);
		bst.insert(88);
		bst.insert(12);
		bst.insert(65);
		bst.insert(67);
		bst.insert(45);
		bst.insert(21);

		bst.inOrder(bst.root);

		System.out.println("\r\n" + "search data in binary search tree --- ");

		Node searchedNode = bst.search(bst.root, 12);

		if (null != searchedNode) {
			System.out.println("searched data ->  " + searchedNode.data);
		}

	}

}

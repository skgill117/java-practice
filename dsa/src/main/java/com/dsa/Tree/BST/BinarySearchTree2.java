package com.dsa.Tree.BST;

/*
 * here we will validate BST
is it a valid BST or not
there are two ways:-
1. using range for each node
2. by inOrder traversal because it gives sorted array, next always greater than previous.
*/

public class BinarySearchTree2 {

	Node root;

	public BinarySearchTree2() {
		this.root = null;
	}

	class Node {
		Node left;
		Node right;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	private boolean validateBST(Node root) {

		return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isValidBST(Node root, int min, int max) {
		if (root == null)
			return true;

		if (root.data < min || root.data > max) {
			return false;
		}

		return (isValidBST(root.left, min, root.data - 1) && isValidBST(root.right, root.data + 1, max));

	}

	Node prev = null;

	private boolean isBST(Node root) {

		if (root != null) {

			if (!isBST(root.left)) {
				return false;
			}

			if (prev != null && root.data <= prev.data)
				return false;
			prev = root;

			return isBST(root.right);
		}
		return true;
	}

	public static void main(String[] args) {

		BinarySearchTree2 bst = new BinarySearchTree2();
		bst.root = bst.new Node(10);
		bst.root.left = bst.new Node(5);
		bst.root.left.left = bst.new Node(2);
		bst.root.right = bst.new Node(45);
		bst.root.right.left = bst.new Node(12);

		boolean valid = bst.validateBST(bst.root);

		System.out.println("is it valid BST -> " + valid);

		System.out.println("\r\n" + "2nd way to find valid BST is InOrder Trvaersal that gives sorted array.");

		boolean isBST = bst.isBST(bst.root);

		System.out.println("\r\nis it valid BST -> " + isBST);

	}

}

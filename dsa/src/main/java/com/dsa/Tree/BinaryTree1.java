package com.dsa.Tree;

public class BinaryTree1 {

	private Node root;
	int idx = -1;

	static class Node {

		Node left;
		Node right;
		int data;

		public Node(int data) {
			this.data = data;
		}

	}

	public Node createTree(Integer[] arr) {
		idx++;
		Node root = null;
		if (arr[idx] == null) {
			return null;
		}

		root = new Node(arr[idx]);

		root.left = createTree(arr);
		root.right = createTree(arr);

		return root;

	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);

		System.out.print(root.data + " ");

		inOrder(root.right);
	}

	public static void main(String[] args) {

		BinaryTree1 bt = new BinaryTree1();
		Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
				null };
		Node root = bt.createTree(arr);
		bt.inOrder(root);

	}

}

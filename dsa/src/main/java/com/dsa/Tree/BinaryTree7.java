package com.dsa.Tree;

/*
 * here we find lowest common ancester (lca) of two given nodes
and distance between two nodes.

 */

public class BinaryTree7 {

	Node root;

	public BinaryTree7() {
		root = null;
	}

	class Node {
		Node left;
		Node right;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	private Node findLCA(Node root, int n1, int n2) {

		if (root == null)
			return null;

		if (root.data == n1 || root.data == n2)
			return root;

		Node left = findLCA(root.left, n1, n2);
		Node right = findLCA(root.right, n1, n2);

		if (left == null) {
			return right;
		}

		if (right == null) {
			return left;
		}

		return root;

	}

	private int findDistance(Node root, int num1, int num2) {
		Node lca = findLCA(root, num1, num2);

		int maxHeightNum1 = maxHeight(lca, num1);
		int maxHeightNum2 = maxHeight(lca, num2);

		return maxHeightNum1 + maxHeightNum2;
	}

	private int maxHeight(Node root, int num) {

		if (root == null)
			return 0;
		
		if (root.data == num)
			return 0;

		int left = maxHeight(root.left, num);
		int right = maxHeight(root.right, num);

		return Math.min(left, right) + 1;

	}

	public static void main(String[] args) {

		BinaryTree7 bt = new BinaryTree7();

		bt.root = bt.new Node(1);
		bt.root.left = bt.new Node(2);
		bt.root.right = bt.new Node(3);
		bt.root.left.left = bt.new Node(4);
		bt.root.left.right = bt.new Node(5);
		bt.root.right.left = bt.new Node(6);
		bt.root.right.right = bt.new Node(7);
		bt.root.right.left.right = bt.new Node(8);

		Node lcaNode = bt.findLCA(bt.root, 8, 5);

		System.out.println("LCA -> " + lcaNode.data);

		int distance = bt.findDistance(bt.root, 5, 6);

		System.out.println("\r\ndistance between nodes -> " + distance);

	}

}

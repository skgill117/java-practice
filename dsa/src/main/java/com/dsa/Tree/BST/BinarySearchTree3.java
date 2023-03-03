package com.dsa.Tree.BST;

/*
 * here we find lowest common ancestor (lca) of two given nodes
and distance between two nodes.
But it is easier than Binary Tree, because by the key we 
are able to find location is left or right. 

 */

public class BinarySearchTree3 {

	Node root;

	public BinarySearchTree3() {
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

	private static int findDistance(Node root, int num1, int num2) {

		if (num1 > num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}

		return calculateDistance(root, num1, num2);
	}

	private static int calculateDistance(Node root, int num1, int num2) {

		if (root == null)
			return 0;

		// Both keys lie in left
		if (num1 < root.data && num2 < root.data) {

			return calculateDistance(root.left, num1, num2);

		}

		// Both keys lie in right
		if (num1 > root.data && num2 > root.data) {

			return calculateDistance(root.right, num1, num2);
		}

		// Lie in opposite directions (Root is
		// LCA of two nodes)
		if (root.data >= num1 && root.data <= num2)
			return distanceFromRoot(root, num1) + distanceFromRoot(root, num2);

		return 0;
	}

	private static int distanceFromRoot(Node root, int num) {

		if (root.data == num)
			return 0;
		
		else if (root.data > num)
			return 1 + distanceFromRoot(root.left, num);
		
		else
			return 1 + distanceFromRoot(root.right, num);
	}

	public static void main(String[] args) {

		BinarySearchTree3 bt = new BinarySearchTree3();

		bt.insert(20);
		bt.insert(10);
		bt.insert(5);
		bt.insert(15);
		bt.insert(30);
		bt.insert(25);
		bt.insert(35);

		int distance = findDistance(bt.root, 5, 35);

		System.out.println("distance between nodes -> " + distance);
	}

}

package com.dsa.Tree;

import java.util.ArrayList;
import java.util.List;

/*left and right view of binary
tree.*/
public class BinaryTree4 {

	Node root;
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

	private void leftRightView(Node root) {
		System.out.println("Left view Of tree: ");
		List<Node> list = new ArrayList<Node>();
		printLeftView(root, list, 0);
		list.forEach(n -> System.out.print(n.data + " "));
		
		System.out.println();
		System.out.println("Right view Of tree: ");
		List<Node> listR = new ArrayList<Node>();
		printRightView(root, listR, 0);
		listR.forEach(n -> System.out.print(n.data + " "));
	}

	private void printLeftView(Node root, List<Node> list, int level) {

		if (root == null)
			return;
		if (list.size() <= level) {
              list.add(level, root);
		}
		
		printLeftView(root.left, list, level+1);
		printLeftView(root.right, list, level+1);

	}
	
	private void printRightView(Node root, List<Node> list, int level) {

		if (root == null)
			return;
		if (list.size() <= level) {
              list.add(level, root);
		}else {
			list.set(level, root);
		}
		
		printRightView(root.left, list, level+1);
		printRightView(root.right, list, level+1);

	}

	
	public static void main(String[] args) {

		BinaryTree4 tree = new BinaryTree4();
		Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
				null };
		Node root = tree.createTree(arr);
		tree.leftRightView(root);
		

	}

}

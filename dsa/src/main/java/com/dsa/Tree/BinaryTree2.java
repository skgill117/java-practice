package com.dsa.Tree;

/*In this we will find size, sum, max 
 * and height of tree
   and traverse in level order
   */
public class BinaryTree2 {

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
	
	private int size(Node root) {
		if(root == null)
			return 0;
		int ls = size(root.left);
		int rs = size(root.right);
		int ts = ls + rs + 1;
		return ts;
	}
	
	private int sum(Node root) {
		if(root == null)
			return 0;
		int lsm = sum(root.left);
		int rsm = sum(root.right);
		int tsm = lsm + rsm + root.data;
		return tsm;
	}

	private int findMax(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;
		
		int leftMax = findMax(root.left);
		int rightMax = findMax(root.right);
		int max = Math.max(root.data, Math.max(leftMax, rightMax));
 		return max;
	}

	private int getHeight(Node root) {
		if (root == null)
			return 0;
		int lh = getHeight(root.left);
		int rh = getHeight(root.right);
		int th = Math.max(lh, rh) + 1;
		return th;
		
	}

	private void printLevelOrder(Node root) {
		int h = getHeight(root);
		for (int i = 1; i <= h; i++) {
			printCurrentLevel(root, i);
		}

	}

	private void printCurrentLevel(Node root, int level) {

		if (root == null)
			return;
		if (level == 1) {
			System.out.print(root.data + " ");
		} else if (level > 1) {
			printCurrentLevel(root.left, level - 1);
			printCurrentLevel(root.right, level - 1);
		}

	}

	public static void main(String[] args) {

		BinaryTree2 tree = new BinaryTree2();
		Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
				null };
		Node root = tree.createTree(arr);
		
		System.out.println("size of tree:  " + tree.size(root));
		System.out.println();
		
		System.out.println("sum of tree:  " + tree.sum(root));
		System.out.println();
		
		System.out.println("Max value in tree is: " + tree.findMax(root));
		System.out.println();

		int h = tree.getHeight(root);

		System.out.println("Height of tree is: " + h);
		System.out.println();
		
		System.out.println("Max edges of tree is: " + (h-1));
		System.out.println();

		int max = tree.findMax(root);

		System.out.println("Max value in tree is: " + max);
		System.out.println();

		System.out.println("Level order traversal of binary tree is ");
		tree.printLevelOrder(root);

	}

}

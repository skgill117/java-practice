package com.dsa.Tree;

/*Sum Root to Leaf Numbers*/
public class BinaryTree8 {

	private Node root;
	int idx = -1;
	static int ans = 0;

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

	static int sum(Node root) {
       int sum = 0;
       calculateSum(root, sum);
       return ans;
	}

	static void calculateSum(Node root, int sum) {
		
		if(root == null)
			return;
		
		sum *= 10;
		sum += root.data;
		
		if(null == root.left && null == root.right) {
			ans += sum;
		}
		calculateSum(root.left, sum);
		calculateSum(root.right, sum);
		
	}

	public static void main(String[] args) {

		BinaryTree8 bt = new BinaryTree8();
		Integer[] arr = { 4, 9, 5, null, null, 1, null, null, 0, null, null };
		Node root = bt.createTree(arr);
		bt.inOrder(root);
		int sum = sum(root);
		System.out.println("\nsum is :-" + sum);
	}
}

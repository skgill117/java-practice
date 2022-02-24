package com.dsa.Tree;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import com.dsa.Tree.BinaryTree5.Node;

/*top and bottom view of
binary tree*/
public class BinaryTree5 {

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

	private void topView(Node root) {
		Queue<Pair> queue = new ArrayDeque<Pair>();
		queue.add(new Pair(root, 0));
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		while (queue.size() > 0) {
			Pair curr = queue.poll();
			if (!map.containsKey(curr.hd)) {
				map.put(curr.hd, curr.node.data);
			}

			if (curr.node.left != null) {
				queue.add(new Pair(curr.node.left, curr.hd - 1));
			}
			if (curr.node.right != null) {
				queue.add(new Pair(curr.node.right, curr.hd + 1));
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}

	}
	
	private void bottomView(Node root) {
		Queue<Pair> queue = new ArrayDeque<Pair>();
		queue.add(new Pair(root, 0));
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		while (queue.size() > 0) {
			Pair curr = queue.poll();
			
				map.put(curr.hd, curr.node.data);

			if (curr.node.left != null) {
				queue.add(new Pair(curr.node.left, curr.hd - 1));
			}
			if (curr.node.right != null) {
				queue.add(new Pair(curr.node.right, curr.hd + 1));
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}

	}

	public static void main(String[] args) {
		BinaryTree5 tree = new BinaryTree5();
		Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
				null };
		Node root = tree.createTree(arr);
		System.out.println("Top view of binary tree: ");
		tree.topView(root);
		System.out.println();
		System.out.println("Bottom view of binary tree: ");
		tree.bottomView(root);

	}

}

class Pair {
	Node node;
	int hd;

	public Pair(Node node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}

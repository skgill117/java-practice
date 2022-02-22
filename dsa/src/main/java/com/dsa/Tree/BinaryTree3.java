package com.dsa.Tree;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

import com.dsa.Tree.BinaryTree3.Node;

/*Level order traversal using queue
in O(N) time complexity*/
public class BinaryTree3 {

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
	
	public void levelOrderTraversal(Node root) {
		Queue<Node> queue = new ArrayDeque<Node>();
		if(root != null) {
			queue.add(root);
			
			while(queue.size() > 0) {
				Node curr = queue.poll();
				System.out.print(curr.data + "  ");
				if(curr.left != null) {
					queue.add(curr.left);
				}
				if(curr.right != null) {
					queue.add(curr.right);
				}
			}
		}
	}

	public static void main(String[] args) {

		BinaryTree3 tree = new BinaryTree3();
		Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
				null };
		Node root = tree.createTree(arr);
		System.out.println("Level order traversal of binary tree is ");
		tree.levelOrderTraversal(root);

	}

}

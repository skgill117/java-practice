package com.dsa.Tree;

import java.util.Scanner;

public class Tree {

	static Scanner sc;

	public static Node createTree() {
		System.out.println("enter data : ");
		int data = sc.nextInt();
		if (data == -1)
			return null;

		Node root = new Node(data);

		System.out.println("enter left for : " + data);
		root.left = createTree();

		System.out.println("enter right for : " + data);
		root.right = createTree();

		return root;

	}

	static void inOrder(Node root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);

		System.out.print(root.data + " ");

		inOrder(root.right);
	}

	static void preOrder(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");

		preOrder(root.left);

		preOrder(root.right);
	}

	static void postOrder(Node root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);

		postOrder(root.right);

		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Node root = createTree();

		System.out.println("Root node data : " + root.data);

		System.out.println("InOrder traversal");

		inOrder(root);
		
		System.out.println();
        
		System.out.println("PreOrder traversal");

		preOrder(root);
		
		
		System.out.println();

		System.out.println("PostOrder traversal");

		postOrder(root);

	}

}

package com.dsa.LinkedList;

public class LinkedList2 {

	private Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/*
	 * Method to insert a node at the end of the linked list
	 * time-complexity O(n)
	 */
	public void addToTheLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = node;
		}
	}

	/*
	 * insert node at first place
	 *  time complexity O(1)
	 */
	private Node addAtFirst(Node node) {
		/* 1. Make next of new Node as head */
		node.next = head;

		/* 2. Move the head to point to new Node */
		head = node;

		return head;
	}
	
	/*
	 * Inserts a new node after the given prevNode.
	 *  time complexity O(1).
	 */
	public void insertAfter(Node prevNode, Node newNode) {
		
		Node temp = prevNode.next;
		prevNode.next = newNode;
		newNode.next = temp;
		
	}
	

	/* Method to print linked list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Driver Code
	public static void main(String args[]) {
		/*
		 * Let us create two sorted linked lists to test the methods Created lists:
		 * llist1: 5->10->15, llist2: 2->3->20
		 */
		LinkedList2 llist1 = new LinkedList2();
		LinkedList2 llist2 = new LinkedList2();

		llist1.addToTheLast(new Node(5));
		llist1.addToTheLast(new Node(10));
		llist1.addToTheLast(new Node(15));
		llist1.insertAfter(llist1.head.next, new Node(12));
		System.out.println("first list :");
		llist1.printList();

		llist2.addToTheLast(new Node(2));
		llist2.addToTheLast(new Node(3));
		llist2.addToTheLast(new Node(20));
		llist2.addToTheLast(new Node(27));
		llist2.addToTheLast(new Node(32));
		System.out.println("second list :");
		llist2.printList();

		llist1.head = sortedMerge(llist1.head, llist2.head);
		System.out.println("sorted merged list :");
		llist1.printList();

	}

	private static Node sortedMerge(Node head1, Node head2) {
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;

		if (head1.data < head2.data) {
			head1.next = sortedMerge(head1.next, head2);
			return head1;
		}

		else {
			head2.next = sortedMerge(head1, head2.next);
			return head2;
		}

	}

}

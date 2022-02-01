package com.dsa.LinkedList;

public class CircularLinkedList {

	private Node head;

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private void insertAtLast(Node node) {
		if (head == null) {
			head = node;
			head.next = node;
		} else {
			Node curr = head.next;
			while (curr.next != head) {
				curr = curr.next;
			}

			curr.next = node;
			node.next = head;

		}
	}
	
	private void insertAtFirst(Node node) {
		if (head == null) {
			head = node;
			head.next = node;
		} else {
			
			Node curr = head.next;
			while (curr.next != head) {
				curr = curr.next;
			}
			
			node.next = head;
			head = node;
			curr.next = head;
			

		}
	}

	private void printList(Node node) {
		do {
			System.out.print(node.data + " ");
			node = node.next;
		} while (node != head);

	}

	public static void main(String[] args) {
		CircularLinkedList cl = new CircularLinkedList();
		cl.insertAtLast(new Node(3));
		cl.insertAtLast(new Node(8));
		cl.insertAtLast(new Node(7));
		cl.insertAtLast(new Node(5));

		cl.printList(cl.head);
		System.out.println("inserting at first");
		System.out.println();
		cl.insertAtFirst(new Node(2));
		cl.insertAtFirst(new Node(1));
		cl.printList(cl.head);
	}

}

package com.dsa.LinkedList;

public class DoublyLinkedList {

	private Node head;

	public class Node {

		private Node next;
		private Node prev;
		private int data;

		public Node(int data) {
			this.data = data;
		}
	}

	public void insertAtFirst(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}

		node.next = head;
		head.prev = node;
		head = node;
		head.prev = null;
	}

	public void insertAtLast(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			prev = curr;
			curr = curr.next;
		}

		prev.next = node;
		node.prev = prev;
	}

	public void display() {
		if (head != null) {
			Node curr = head;
			while (curr != null) {
				System.out.print(curr.data + " ");
				curr = curr.next;
			}
			System.out.println();
		}
	}

	public void removeFirst() {
		
		if(head != null) {
			head = head.next;
			head.prev = null;
		}

	}

	public void removeLast() {
		
		if(head != null) {
			Node curr = head;
			Node prev = null;
			while(curr.next != null) {
				prev = curr;
				curr = curr.next;
				
			}
			
			prev.next = null;
		}

	}

	public static void main(String[] args) {

		DoublyLinkedList dll = new DoublyLinkedList();
		System.out.println("insertint at first");
		dll.insertAtFirst(10);
		dll.insertAtFirst(9);
		dll.insertAtFirst(8);
		dll.insertAtFirst(7);
		dll.display();
		System.out.println("inserting at last");
		dll.insertAtLast(11);
		dll.insertAtLast(12);
		dll.insertAtLast(13);
		dll.display();
		System.out.println("removing first");
		dll.removeFirst();
		dll.display();
		System.out.println("removing last");
		dll.removeLast();
		dll.display();
		

	}

}

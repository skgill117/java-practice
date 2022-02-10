package com.dsa.LinkedList;

public class CircularLinkedList {
	
	private Node head;
	private Node tail;
	
	public class Node{
		
		private Node next;
		private int data;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void insertAtFirst(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		head = node;
	}
	
	public void insertAtLast(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}
	
	public void delete(int data) {
		if(head == null) {
			return;
		}
		if(head.data == data) {
			head = head.next;
			tail.next = head;
			return;
		}else {
			Node curr = head;
			do {
				if(curr.next.data == data) {
					curr.next = curr.next.next; 
					break;
				}
				curr = curr.next;
			}while(curr != head);
		}
	}
	
	public void display() {
		if(head != null) {
			Node curr = head;
			do {
				System.out.print(curr.data + " ");
				curr = curr.next;
			}while(curr != head);
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		System.out.println("inserting At front");
		CircularLinkedList cll = new CircularLinkedList();
		cll.insertAtFirst(7);
		cll.insertAtFirst(8);
		cll.insertAtFirst(9);
		cll.insertAtFirst(10);
		cll.display();
		System.out.println("inserting at last");
		cll.insertAtLast(6);
		cll.insertAtLast(5);
		cll.display();
		System.out.println("deleting 7");
		cll.delete(7);
		cll.display();
		System.out.println("displaying head and tail");
		System.out.println("head -> " + cll.head.data + ",  tail -> " + cll.tail.data + ",  tail's next -> " + cll.tail.next.data);
		
		

	}

}

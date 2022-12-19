package com.practice;

public class ReverseLinkedList {

	private Node head;

	class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}
	
	
	public void insert(int data){
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = node;
		}
	}
	
	public void reverse() {
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;
	}
	
	public void display() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ReverseLinkedList ll = new ReverseLinkedList();
		ll.insert(78);
		ll.insert(55);
		ll.insert(65);
		ll.insert(45);
		ll.display();
		System.out.println("reversed list");
		ll.reverse();
		ll.display();
	}

}

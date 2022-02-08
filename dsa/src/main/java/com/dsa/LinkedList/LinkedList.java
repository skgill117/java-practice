package com.dsa.LinkedList;

public class LinkedList {
	
	private Node head;
	
	 class Node{
		
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	 
	 public void insertAtFirst(int data) {
			Node node = new Node(data);
			if(head == null) {
				head = node;
			}else {
				node.next = head;
				head = node;
			}
		}
	 
	 public void insertAtLast(int data) {
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
	 
	 public void insertAfter(Node prevNode, int data) {
		 
		 Node node  = new Node(data);
		 Node temp = prevNode.next;
		 prevNode.next = node;
		 node.next = temp;
	 }
	 
	 public void removeFirst() {
		 head = head.next;
	 }
	 
	 public void removeLast() {
		 Node curr = head;
		 Node prev = null;
		 while(curr.next != null) {
			 prev = curr;
			 curr = curr.next;
					 
		 }
		 prev.next = null;
	 }
	 
	 private void removeNode(int position) {
			if(position == 0) {
				Node temp = head.next;
				head = temp;
			}else {
				Node curr = head;
				for(int i = 1; i < position; i++) {
						curr = curr.next;
					 
				}
				
				curr.next = curr.next.next;
			}
			
		}
	 
	 public void display() {
		 Node curr = head;
		 while(curr != null) {
			 System.out.print(curr.data + "  ");
			 curr = curr.next;
		 }
	 }
	

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.insertAtFirst(4);
		ll.insertAtFirst(5);
		ll.insertAtFirst(37);
		ll.display();
		System.out.println();
		ll.insertAtLast(37);
		ll.insertAtLast(48);
		ll.display();
		System.out.println();
		ll.insertAfter(ll.head.next.next, 55);
		ll.display();
		System.out.println();
		ll.removeFirst();
		ll.display();
		System.out.println();
		ll.removeLast();
		ll.display();
		System.out.println();
		ll.removeNode(2);
		ll.display();

	}

	

}

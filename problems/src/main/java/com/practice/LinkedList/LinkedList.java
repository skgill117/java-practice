package com.practice.LinkedList;

import java.util.HashSet;
import java.util.Set;

// rverse linkedlist, loop detection




public class LinkedList {
	
	private Node head;
	
	
	static class Node{
		
		int data;
		Node next;
		
		public Node(int i) {
			data = i;
			next = null;
		}
	}
	
	public void insertAtLast(Node node) {
		if(head == null) {
			head = node;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void insertAtFirst(Node node) {
		if(head == null) {
			head = node;
		}else {
			Node temp = head;
			head = node;
			head.next = temp;
			
		}
	}
	
	public void insertAfterNode(Node prevNode, Node newNode) {
		Node temp = prevNode.next;
		prevNode.next = newNode;
		newNode.next = temp;
	}
	
	private void reverseTheList(Node node) {
		Node curr = node;
		Node prev = null;
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
			
		}
		
		this.head = prev;
	}
	
	private void pairWiseSwap(Node node) {
		if(node == null || node.next == null)
			return;
		Node curr = node.next.next;
		
		Node prev = node;
		node = node.next;
		node.next = prev;
		
		this.head = node;
		
		
		
		while(curr != null && curr.next != null) {
			
			prev.next = curr.next;
			prev = curr;
			Node next = curr.next.next;
			curr.next.next = curr;
			curr = next;
		}
		
		prev.next = curr;
		
	}
	
	private boolean checkCircularList(Node node) {
		Set<Node> nodes = new HashSet<>();
		while(node != null) {
			
			if(nodes.contains(node))
				return true;
			else
				nodes.add(node);
			
			node = node.next;
		}
		
		
		
		return false;
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
		LinkedList lList = new LinkedList();
		lList.insertAtLast(new Node(5));
		lList.insertAtLast(new Node(2));
		lList.insertAtLast(new Node(18));
		lList.insertAtLast(new Node(83));
		lList.printList();
		System.out.println("");
		System.out.println("inserting at first.");
		lList.insertAtFirst(new Node(1));
		lList.insertAtFirst(new Node(0));
		lList.insertAtFirst(new Node(201));
		lList.printList();
		System.out.println();
		System.out.println("inserting after node");
		lList.insertAfterNode(lList.head.next.next, new Node(57));
		lList.printList();
		System.out.println();
		System.out.println("reverse the list");
		lList.reverseTheList(lList.head);
		lList.printList();
		System.out.println();
		System.out.println("pair wise swap");
		lList.pairWiseSwap(lList.head);
		lList.printList();
		System.out.println();
		lList.head.next.next.next.next.next.next.next.next = lList.head;
		System.out.println("loop found : " + lList.checkCircularList(lList.head));
		
		
	}

	
	
}

package com.dsa.LinkedList;

import java.util.HashSet;

// rverse linkedlist, loop detection




public class LinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	 private Node push(int newData)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(newData);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
        
        return head;
    }

	/* Function to reverse the linked list */
	Node reverse(Node node) {
		Node curr = node;
		Node prev = null;
		
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
			
		}
		
		return prev;
	}
	
	/* Function to pairwise swap elements of a
	linked list */
	private Node pairWiseSwap(Node head)
	{
	     
	    // If linked list is empty or there is only
	    // one node in list
	    if (head == null || head.next == null)
	        return head;
	 
	    // Fix the head and its next explicitly to
	    // avoid many if else in while loop
	    Node curr = head.next.next;
	    Node prev = head;
	    head = head.next;
	    head.next = prev;
	 
	    // Fix remaining nodes
	    while (curr != null && curr.next != null)
	    {
	        prev.next = curr.next;
	        prev = curr;
	        Node next = curr.next.next;
	        curr.next.next = curr;
	        curr = next;
	    }
	     
	    prev.next = curr;
	 
	    return head;
	}
	
	 // Returns true if there is a loop in linked
    // list else returns false.
    static boolean detectLoop(Node node)
    {
        HashSet<Node> set = new HashSet<Node>();
        while (node != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (set.contains(node))
                return true;
 
            // If we are seeing the node for
            // the first time, insert it in hash
            set.add(node);
 
            node = node.next;
        }
 
        return false;
    }

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(85);
		list.push(15);
		list.push(4);
		list.push(20);
		

		System.out.println("Given Linked list");
		list.printList(head);
		System.out.println();
		System.out.println("Swap adjecent nodes ");
		head = list.pairWiseSwap(head);
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
		System.out.println("\n\n");
		
		/*Create loop for testing */
		list.head.next.next.next.next = list.head;
		if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

	}

	

}

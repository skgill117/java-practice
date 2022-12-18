package com.practice.caches;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	private int capacity;
	private Map<Integer, Node> map = new HashMap<Integer, Node>();
	private Node head = new Node(0, 0);
	private Node tail = new Node(0, 0);

	public LRUCache(int capacity) {
		this.capacity = capacity;
		head.next = tail;
		tail.prev = head;
	}

	static class Node {

		Node next;
		Node prev;
		int key;
		int data;

		Node(int key, int data) {

			this.key = key;
			this.data = data;
		}
	}

	public void put(int key, int value) {

		if (map.containsKey(key)) {
			remove(map.get(key));
		}

		Node node = new Node(key, value);

		if (map.size() == capacity) {
			remove(tail.prev);
		}

		insert(node);
	}

	public int get(int key) {

		if (map.containsKey(key)) {

			Node node = map.get(key);
			remove(node);
			insert(node);
			return node.data;

		} else {

			return -1;
		}
	}

	private void insert(Node node) {
		map.put(node.key, node);
		Node temp = head.next;
		head.next = node;
		node.prev = head;
		node.next = temp;
		temp.prev = node;

	}

	private void remove(Node node) {
		map.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;

	}

}

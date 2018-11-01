package org.practice.linkedList;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class InsertNode {

	public static Node insert(Node head, int data) {
		Node start = head;
		if (start == null) {
			start = new Node(data);
			head = start;
		} else {
			while (start != null) {
				System.out.print(start.data + " ");
				start = start.next;
			}
			start = new Node(data);
		}

		return start;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {

		Node head = null;
		int N = 4;
		int[] items = { 2, 3, 4, 1 };

		while (N-- > 0) {
			int ele = items[N];
			head = insert(head, ele);
		}
		display(head);
	}
}

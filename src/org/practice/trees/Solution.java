package org.practice.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}

	@Override
	public String toString() {
		return "Node [left=" + left + ", right=" + right + ", data=" + data + "]";
	}



	public void printInOrder() {
		if (left != null) {
			left.printInOrder();
		}

		System.out.println(data);

		if (right != null) {
			right.printInOrder();
		}
	}

	public int getHeight() {

		int leftLeaf = 0;
		int rightLeaf = 0;

		if (left != null) {
			leftLeaf++;
			// System.out.println("Left Node value "+data+" : leaf :"+leftLeaf);
			leftLeaf += left.getHeight();
		}

		if (right != null) {
			rightLeaf++;
			// System.out.println("Right Node value "+data+" : leaf
			// :"+rightLeaf);
			rightLeaf += right.getHeight();
		}

		return leftLeaf > rightLeaf ? leftLeaf : rightLeaf;
	}

}

class Solution {

	public static int getHeight(Node root) {
		if (root == null) {
			return 0;
		}

		int leftLen = Solution.getHeight(root.left);
		int rightLen = Solution.getHeight(root.right);

		return leftLen > rightLen ? leftLen : rightLen;
	}

	static void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		
		while (!q.isEmpty()) {
			root  = q.remove();
			System.out.println(root.data+" ");
			
			if(root.left != null){
				q.add(root.left);
			}
			
			if(root.right != null){
				q.add(root.right);
			}
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		Node root = null;
		for (int i : arr) {

			int data = i;
			root = insert(root, data);
		}
		levelOrder(root);
		// System.out.println("Height = " + root.getHeight());

	}
}
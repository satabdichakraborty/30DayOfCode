package org.practice.trees;

public class Tree {

	int data;
	Tree leftTree, rightTree;

	Tree(int data) {
		this.data = data;
	}
	
	public int getTreeHeight(Tree tree) {
		if(tree == null){
			return 0;
		}
		
		int leftLen = tree.getTreeHeight(leftTree);
		int rightLen = tree.getTreeHeight(rightTree);
		
		return leftLen > rightLen ? leftLen : rightLen;
	}

	public void insert(int value) {
		if (value <= data) {
			if (leftTree == null) {
				leftTree = new Tree(value);
			} else {
				leftTree.insert(value);
			}
		} else {
			if (rightTree == null) {
				rightTree = new Tree(value);
			} else {
				rightTree.insert(value);
			}
		}
	}

	public boolean find(int value) {
		boolean isThere = false;

		if (value == data) {
			isThere = true;
		} else if (value < data) {
			if (leftTree == null) {
				isThere = false;
			} else {
				isThere = leftTree.find(value);
			}
		} else {
			if (rightTree == null) {
				isThere = false;
			} else {
				isThere = rightTree.find(value);
			}
		}

		return isThere;
	}

	public void printInOrder() {

		if (leftTree != null) {
			leftTree.printInOrder();
		}

		System.out.println(data);

		if (rightTree != null) {
			rightTree.printInOrder();
		}

	}

	// head, left , right
	public void printPreOrder() {

		System.out.println(data);

		if (leftTree != null) {
			leftTree.printInOrder();
		}

		if (rightTree != null) {
			rightTree.printInOrder();
		}

	}

	//left, right, head
	public void printPostOrder() {

		if (leftTree != null) {
			leftTree.printInOrder();
		}

		if (rightTree != null) {
			rightTree.printInOrder();
		}
		
		System.out.println(data);
	}
}

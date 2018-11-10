package org.practice.trees;

public class BinarySearchTree extends Tree {

	BinarySearchTree(int data) {
		super(data);
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(10);

		bst.insert(15);
		bst.insert(5);
		bst.insert(4);
		bst.insert(8);
		bst.insert(10);
		
		System.out.println("Is 5 there? "+bst.find(5));
		
		System.out.println("Print Tree in order :");
		bst.printInOrder();
		
		System.out.println("Print Tree Preorder :");
		bst.printPreOrder();
		
		System.out.println("Print Tree Postorder :");
		bst.printPostOrder();
		
		System.out.println("Tree Height= "+bst.getTreeHeight(bst));
	}

}

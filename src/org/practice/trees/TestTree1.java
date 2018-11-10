package org.practice.trees;

public class TestTree1 {

	int data;
	TestTree1 leftTree, rightTree;

	TestTree1(int data) {
		this.data = data;
	}

	public static void main(String[] args) {
		TestTree1 tree = new TestTree1(1);

		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);

		tree.printInOrder();
		// tree.printPreOrder();
		// tree.printPostOrder();
		// System.out.println(tree.find(3));
		// System.out.println(tree.find(5));

		System.out.println("Height = "+tree.getHeight());
	}

	private int getHeight() {

		int leftLeaf = 0;
		int rightLeaf = 0;

		if (leftTree != null) {
			leftLeaf++;
			System.out.println("Left Node value "+data+" : leaf :"+leftLeaf);
			leftLeaf += leftTree.getHeight();
		}

		if (rightTree != null) {
			rightLeaf++;
			System.out.println("Right Node value "+data+" : leaf :"+rightLeaf);
			rightLeaf += rightTree.getHeight();
		}

		return leftLeaf > rightLeaf ? leftLeaf : rightLeaf;
	}

	private boolean find(int value) {
		boolean isThere = false;
		if (data == value) {
			isThere = true;
		} else if (leftTree != null) {
			if (value == leftTree.data) {
				isThere = true;
			} else {
				isThere = leftTree.find(value);
			}
		} else {
			if (rightTree != null) {
				if (value == rightTree.data) {
					isThere = true;
				} else {
					isThere = rightTree.find(value);
				}
			}
		}
		return isThere;
	}

	private void insert(int value) {
		if (value <= data) {
			if (leftTree == null) {
				leftTree = new TestTree1(value);
			} else {
				leftTree.insert(value);
			}
		} else {
			if (rightTree == null) {
				rightTree = new TestTree1(value);
			} else {
				rightTree.insert(value);
			}
		}
	}

	private void printInOrder() {

		if (leftTree != null) {
			leftTree.printInOrder();
		}

		System.out.println(data);

		if (rightTree != null) {
			rightTree.printInOrder();
		}

	}

	private void printPreOrder() {

		System.out.println(data);

		if (leftTree != null) {
			leftTree.printInOrder();
		}

		if (rightTree != null) {
			rightTree.printInOrder();
		}

	}

	private void printPostOrder() {

		if (leftTree != null) {
			leftTree.printInOrder();
		}

		if (rightTree != null) {
			rightTree.printInOrder();
		}

		System.out.println(data);

	}

	@Override
	public String toString() {
		return "TestTree1 [data=" + data + ", leftTree=" + leftTree + ", rightTree=" + rightTree + "]";
	}

}

package org.practice.day20;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = {3, 2, 1 };
		// int[] a = { 1, 2, 3, 4, 5 };

		boolean sorted = false;
		int sortingLen = a.length - 1;
		int numOfSwaps = 0;

		while (!sorted) {
			sorted = true;
			for (int i = 0; i < sortingLen; i++) {
				if (a[i] > a[i + 1]) {
					numOfSwaps++;
					swapElements(a, i, i + 1);
					sorted = false;
				}
			}
		}
		System.out.println("Array is sorted in " + numOfSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);
		//Arrays.stream(a).forEach(u -> System.out.print(u + " "));
	}

	private static void swapElements(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}

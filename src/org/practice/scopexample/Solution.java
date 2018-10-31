package org.practice.scopexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Difference {
	private int[] elements;
	public int maximumDifference;

	List<Integer> diffs = new ArrayList<>();

	Difference() {
	}

	Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {

		Arrays.sort(elements);


		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {

				int diff = Math.abs(elements[i] - elements[j]);
				diffs.add(diff);

			}
		}
		
		//List<Integer> l = diffs.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//l = l.stream().distinct().collect(Collectors.toList());
		
		maximumDifference =  diffs.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
		
		
	}

} // End of Difference class

public class Solution {

	public static void main(String[] args) {

		int[] a = { 1, 2, 5 };

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
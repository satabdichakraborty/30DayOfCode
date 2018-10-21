package org.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Comparison {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List comparison = new ArrayList<>();

		Map<String, Integer> comparisonMap = new HashMap();
		comparisonMap.put("alice", 0);
		comparisonMap.put("bob", 0);

		if (!a.isEmpty() && !b.isEmpty()) {
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i) >= 1 && a.get(i) <= 100 && b.get(i) >= 1 && b.get(i) <= 100) {
					if (a.get(i) > b.get(i)) {

						int score = comparisonMap.get("alice");
						score++;
						comparisonMap.put("alice", score);

					} else if (a.get(i) < b.get(i)) {
						
						int score = comparisonMap.get("bob");
						score++;
						comparisonMap.put("bob", score);

					}
				}
			}
		}

		System.out.println(comparisonMap);
		comparison.add(comparisonMap.get("alice"));
		comparison.add(comparisonMap.get("bob"));
		return comparison;
	}

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<>();
		a.add(5);
		a.add(6);
		a.add(7);

		List<Integer> b = new ArrayList<>();
		b.add(1);
		b.add(6);
		b.add(7);

		List<Integer> result = compareTriplets(a, b);

	}
}

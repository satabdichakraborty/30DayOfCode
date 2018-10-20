package org.practice;

import java.util.HashMap;
import java.util.Map;

public class operator {

	public static void main(String[] args) {
		String[] strings = { "aba", "baba", "aba", "xzxb" };
		String[] queries = { "aba", "xzxb", "ab" };

		int[] res = matchingStrings(strings, queries);
		for (int i : res) {
			System.out.print(i + " ");
		}
		
	}

	static int[] matchingStrings(String[] strings, String[] queries) {
		int[] res = new int[queries.length];
		Map<String, Integer> count = new HashMap<>();

		for (String s : queries) {
			int index = 0;
			count.put(s, index);

			for (int i = 0; i < strings.length; i++) {
				String compare = strings[i];
				if (s.equals(compare)) {
					index = count.get(s);
					index++;
					count.put(s, index);
				}
			}
		}

		int in = 0;
		for (String i : queries) {
			res[in] = count.get(i);
			in++;
		}

		return res;
	}

}

package org.practice.strings;

public class Solution {

	public static void main(String[] args) {

		Object[] obj = { 1, 2, "ab" };
		
		for (Object o : obj) {
			try {
				int i = Integer.parseInt(o.toString());
				System.out.println(i);
			} catch (Exception e) {				
				System.out.println("");
			}
			

		}

	}
}

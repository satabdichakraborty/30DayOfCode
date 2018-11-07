package org.practice.day17;

class Calculator {

	public int power(int n, int p) throws Exception {
		double result = 0;

		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}
		double a = n;
		double b = p;

		result = Math.pow(a, b);

		return (int) result;
	}
}

public class Solution {

	public static void main(String[] args) {

		int n = -1;
		int p = -2;
		Calculator myCalculator = new Calculator();
		try {
			int ans = myCalculator.power(n, p);
			System.out.println(ans);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

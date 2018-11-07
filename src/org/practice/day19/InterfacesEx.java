package org.practice.day19;

import java.util.ArrayList;
import java.util.List;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
	
	
	public int divisorSum(int n) {

		List<Integer> divisors = new ArrayList<>();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				//System.out.println("Adding to divisor = "+i);
				divisors.add(i);
			}
		}
	//	System.out.println(divisors);
		
		for (Integer integer : divisors) {
			sum+=integer;
		}
		return sum;
	}
}

public class InterfacesEx {
	public static void main(String[] args) {

		int n = 6;

		AdvancedArithmetic myCalculator = new Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}

}

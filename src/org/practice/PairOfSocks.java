package org.practice;

import java.util.HashMap;
import java.util.Map;

public class PairOfSocks {
	
	public static void main(String[] args) {
		 int n = 9;
	     int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
	     
	     System.out.println("Matching pair : "+sockMerchant(n, ar));
	}
	
	static int sockMerchant(int n, int[] ar) {
      int pairs = 0;
      Map<Integer, Integer> count = new HashMap<>();
      
      int index = 0;
      for (int i : ar) {
    	  index = 1;
		if(!count.containsKey(i)){
			count.put(i, index);
		}
		else {
			index = count.get(i);
			index++;
			count.put(i, index);
		}
		
		if(index %2 == 0){
			pairs++;
		}
	}
      
      System.out.println(count);
      
      return pairs;
      
    }

}

package org.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MorganAndString {

	public static void main(String[] args) {
		String a = "JACK";
		String b = "DANIEL";
		
		String result = morganAndString(a, b);

	}
	
	static String morganAndString(String a, String b) {
		String result = "";
		
		char[] charA = a.toCharArray();
		List<Character> listA = new ArrayList<>();
		for (char c : charA) {
			//System.out.print(c+" ");
			listA.add(c);
		}
		
		char[] charB = b.toCharArray();
		List<Character> listB = new ArrayList<>();
		for (char c : charB) {
			//System.out.print(c+" ");
			listB.add(c);
		}		
		
		List res = new ArrayList<>();
		
		System.out.println(listA);
		System.out.println(listB);
		
		System.out.println(listA.get(0)>listB.get(0));
		System.out.println(listA.get(0)<listB.get(0));
		
		
		
		
		while (listA.size() > 0 && listB.size()>0) {
			if(listA.get(0) < listB.get(0)){
				res.add(listA.get(0));
				listA.remove(0);
			}
			else {
				res.add(listB.get(0));
				listB.remove(0);
			}
		}
		
		if(!listA.isEmpty()){
			for (char c : listA) {
				res.add(c);
			}	
		} else{
			for (char c : listB) {
				res.add(c);
			}	
		}
		
		System.out.println(res);
		
		return res.toString();
    }

}

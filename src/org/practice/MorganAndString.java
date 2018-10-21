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
		
		List<String> listA = new ArrayList<String>(Arrays.asList(a));
		List<String> listB = new ArrayList<String>(Arrays.asList(b));
		List res = new ArrayList<>();
		
		System.out.println("ListA :" +listA);
		System.out.println("ListB :" +listB);
		
		System.out.println(listA.get(0).compareTo(listB.get(0)));
		System.out.println(listB.get(0).compareTo(listA.get(0)));
		
		
		while (listA.size() > 0 && listB.size()>0) {
			if(listA.get(0).compareTo(listB.get(0)) > 0){
				res.add(listA.get(0));
				listA.remove(0);
			}
			else {
				res.add(listB.get(0));
				listB.remove(0);
			}
		}
		
		System.out.println(res);
		
		return result;
    }

}

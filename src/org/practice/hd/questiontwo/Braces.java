package org.practice.hd.questiontwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Braces {

	static String[] braces(String[] values) {

		List<String> answers = new ArrayList<>();
		int openF = 0;
		int openS = 0;
		int openT = 0;
		int closeF = 0;
		int closeS = 0;
		int closeT = 0;
		

		for (String str : values) {
			System.out.println(str + " ");
			 openF = 0;
			 openS = 0;
			 openT = 0;
			 closeF = 0;
			 closeS = 0;
			 closeT = 0;
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)== '(')
				{
					openF++;
				}
				else if (str.charAt(i)== ')'){
					closeF++;
				}
				else if (str.charAt(i)== '{'){
					openS++;
				}
				else if (str.charAt(i)== '}'){
					closeS++;
				}
				else if (str.charAt(i)== '['){
					openT++;
				}
				else if (str.charAt(i)== ']'){
					closeT++;
				}
			}
			if (openF == closeF && openS == closeS && openT == closeT)
				{
				  answers.add("YES");
				}
			else {
				answers.add("NO");
			}
		}

		
		return answers.toArray(new String[answers.size()]);
	}

	public static void main(String[] args) {

		// String[] values1 = { "{", "}", "[" ,"]", "(", ")"};
		// String[] values2 = { "{", "[", "}", "]", "}"};
		//YES, NO
		//String[] values = { "{}[]()", "{[}]}" };
		
		//YES, NO
		String[] values = { "{}[]()" , "{[}]" };

		String[] res = braces(values);
		Arrays.stream(res).forEach(s -> System.out.print(s + " "));

	}

}

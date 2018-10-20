package org.practice;

public class RepeatedString {

	public static void main(String[] args) {
		String s = "aba";
		long n = 13;

		String s1 = "abcac";
		long n1 = 10;

		repeatedString(s, n);

	}

	static long repeatingA(String s, long length) {
		long o = 0;
		for (int i = 0; i <length; i++) {
			if (s.charAt(i) == 'a') {
				o++;
			}
		}
		return o;
	}

	static long repeatedString(String s, long n) {

		long repeats = 0;
		long o = 0;
		if (!s.isEmpty()) {
			o = repeatingA(s, s.length());
		}

		repeats = (n / s.length()) * o;
		
		System.out.println("repeats1 = "+repeats);
		
		if (n % s.length() != 0) {
		   long extra = n % s.length();
		   repeats = repeats + repeatingA(s, extra);
		}
		
		System.out.println("repeats2 = "+repeats);

		System.out.println("(" + n + "/" + s.length() + ") * " + o + " = " + repeats);
		return repeats;
	}

}

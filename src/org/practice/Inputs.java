package org.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {

		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		int j = scan.nextInt() + i;
		System.out.println(j);

		double d2 = scan.nextDouble() + d;
		System.out.println(d2);

		System.out.println(s);
		String s2 = "";
		while (scan.hasNext()) {
			s2 = s2 +" "+ scan.next();
		}
		System.out.println(s);
        s = s+s2;
		System.out.println(s);

		scan.close();

		/*
		 * try { InputStreamReader in = new InputStreamReader(System.in);
		 * BufferedReader keyboard = new BufferedReader(in); Integer i2 =
		 * Integer.parseInt(keyboard.readLine()); System.out.println(i + i2);
		 * 
		 * InputStreamReader in2 = new InputStreamReader(System.in);
		 * BufferedReader keyboard2 = new BufferedReader(in2); Double d2 =
		 * Double.parseDouble(keyboard2.readLine()); System.out.println(d + d2);
		 * 
		 * InputStreamReader in3 = new InputStreamReader(System.in);
		 * BufferedReader keyboard3 = new BufferedReader(in3); String inputs =
		 * keyboard3.readLine(); System.out.println(s + inputs);
		 * 
		 * in.close(); in2.close(); in3.close();
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

	}

}

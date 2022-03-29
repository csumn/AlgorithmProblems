package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String s1: ");
		String s1 = scanner.nextLine();
		System.out.println("Enter the String s2: ");
		String s2 = scanner.nextLine();
		isAnagramString(s1,s2);
		scanner.close();
	}

	public static void isAnagramString(String s1,String s2) {
		boolean status=true;
		if(s1.length() != s2.length()) {
			status = false;
		}
		else {
			char[] Array1 = s1.toLowerCase().toCharArray();
			char[] Array2 = s2.toLowerCase().toCharArray();
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			status = Arrays.equals(Array1, Array2);
		}
		if(status) {
			System.out.println("Both the Strings are Anagram");
		}
		else {
			System.out.println("The above Strings are not Anagram ");
		}
	}
}

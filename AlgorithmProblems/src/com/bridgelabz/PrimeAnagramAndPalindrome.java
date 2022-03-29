package com.bridgelabz;

import java.util.Scanner;

public class PrimeAnagramAndPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int first_Number = scanner.nextInt();
		System.out.println("Enter second number : ");
		int second_Number = scanner.nextInt();
		primeNumberForPalindromeCheck(first_Number,second_Number);
		primeNumberRangeForAnagramCheck(first_Number,second_Number);
		scanner.close();
	}

	private static void primeNumberForPalindromeCheck(int a, int b) {
		for(int i = a;i <= b;i++) {
			if(i == 1 || i == 0 ) continue;    
			int flag = 0;
			for(int j = 2;j <= i/2;j++) {
				if(i%j == 0) {     
					flag = 1;     
					break;         
				}
			}		
			if(flag == 0) {
				if(i == reverse(i)) {
					System.out.println(i+ " is a Prime Palindrome" +" ");
				}
			}
		}
	}

	private static int reverse(int i) {
		int reverse = 0;
		while(i>0) {
			int remainder = i%10;
			reverse = reverse *10 + remainder;
			i/=10;
		}
		return reverse;
	}

	public static void primeNumberRangeForAnagramCheck(int a,int b) {
		for(int i = a;i <= b;i++) {
			if(i == 1||i == 0) continue;
			int flag = 0;           
			for(int j = 2;j <= i/2;j++) {   
				if(i%j == 0) {     
					flag = 1;         
					break;         
				}
			}
			if(flag == 0) {          
				if(anagram(i) == 1)
					System.out.print(i+" is a Prime Anagram \n");    
			}
		}
	}
	public static int anagram(int number) {
		int reverse = 0;    
		while(number>0) {
			int remainder = number%10;   
			reverse = reverse * 10 + remainder;    
			number/=10;   
		}
		return primeNumber(reverse);
	}
	public static int primeNumber(int num) {
		if(num <= 1)  return 0;
		for(int k = 2;k <=num /2;k++) {    
			if(num%k == 0) {             
				return 0;                
			}
		}
		return 1;	      
	}
}

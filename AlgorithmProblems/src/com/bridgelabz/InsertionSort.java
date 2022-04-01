package com.bridgelabz;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you would like to insert ? ");
		int noOfElements = scanner.nextInt();
		System.out.println("Total Size = " +noOfElements);
		String str[] = new String[noOfElements]; 
		System.out.println("Add the elements for sorting ");
		int arr[] = new int[noOfElements];

		for(int i = 0; i < noOfElements; i++)
		{
			str[i] = scanner.next();
			arr[i] = Integer.parseInt(str[i]);

		}

		InsertionSort insertionSort = new InsertionSort(); 
		insertionSort.sort(arr); 

		insertionSort.displayArray(arr); 
		scanner.close();
	} 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 1; i < n; ++i) { 
			int key = arr[i]; 
			int j = i - 1;
			while (j >= 0 && arr[j] > key) { 
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = key; 
		} 
	} 

	void displayArray(int arr[]) 
	{ 
		int n = arr.length; 
		System.out.println("\nElements after sorted are below \n");
		for (int i = 0; i < n; ++i) 
			System.out.print(String.valueOf(arr[i])+" ");
		System.out.println(); 
	} 
}

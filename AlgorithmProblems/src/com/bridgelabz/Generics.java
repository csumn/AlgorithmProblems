package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Generics {
	private static <T extends Comparable<T>> void insertionSort(T[] array, int length) 
	{
		for (int i = 1; i < array.length; i++) 
		{
			T key = array[i];
			int j = i - 1;
			while(j >= 0 && (array[j].compareTo(key) > 0))
			{
				array[j+1] = array[j];
				j = j -1;
			}
			array[j+1] = key;			
		}
	}
	public static <T extends Comparable<T>> int binarySearch(T[] array, int low, int high, T key)
	{
		if(high >= low)
		{
			int mid = low + (high - low)/2;
			if(array[mid].equals(key))
				return mid;
			if(array[mid].compareTo(key) > 0)
			{
				return binarySearch(array, low, mid-1, key);
			}
			else
			{
				return binarySearch(array, mid+1, high, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers you would like to insert ? ");
		int length = scanner.nextInt();
		String [] array = new String[length];
		System.out.println("Add the elements for sorting :  ");

		for(int i = 0; i < array.length; i++)
		{
			array[i] = scanner.next();
		}

		System.out.println("1. Binary Search\n2. Insertion Sort \nEnter Your Choice : \n");

		switch(scanner.nextInt()){
		case 1:

			System.out.println("Sorted Array is: ");
			Arrays.sort(array);

			for(String str : array)
				System.out.print(str+ " ");

			System.out.println("\nEnter a element to be searched ");
			String key = scanner.next();
			int value = binarySearch(array, 0, array.length - 1, key);
			if (value == -1) 
			{
				System.out.println("Element Not Present");
			}
			else
				System.out.println("Element Found at index "+value);
			break;

		case 2:
			insertionSort(array, array.length);
			System.out.println("\nSorted Array is : ");
			for (int i = 0; i < array.length; i++) 
			{
				System.out.print( array[i]+ " ");
			}
			System.out.println("\nNow lets do binary search. "
					+ "\nEnter a element to be searched ");
			String key2 = scanner.next();
			int value2 = binarySearch(array, 0, array.length - 1, key2);
			if (value2 == -1) 
			{
				System.out.println("Element Not Present");
			}
			else
				System.out.println("Element Found at index "+value2);
			break;
			default:
				System.out.println("Enter a valid option");

		}
		scanner.close();
	}
}

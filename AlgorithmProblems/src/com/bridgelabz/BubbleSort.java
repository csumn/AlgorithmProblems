package com.bridgelabz;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you would like to insert ?");
		int noOfElements = scanner.nextInt();
		int arr[] = new int[noOfElements];
		System.out.println("Enter " + noOfElements + " Array Elements: ");
		for (int i = 0; i < noOfElements; i++)
			arr[i] = scanner.nextInt();
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(arr, noOfElements);
		scanner.close();
	}

	void sort(int[] arr, int noOfElements) {
		System.out.println("\nBefore Sorting\n");
		for (int i = 0; i < noOfElements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.println("\nAfter Sorting\n");
		for (int i = 0; i < noOfElements - 1; i++) {
			for (int j = 0; j < noOfElements - i - 1; j++) {
				int temp;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		for (int i = 0; i < noOfElements; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

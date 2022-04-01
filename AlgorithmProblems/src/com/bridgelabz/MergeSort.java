package com.bridgelabz;

public class MergeSort {
	public static void main(String[] args) {
		String[] stringArray = { "Apple", "Cat", "Sweet", "Mango", "Tiger", "Elephant", "Zebra", "Lion" };
		mergeSort(stringArray);
		System.out.println("Here is the sorted List ...\n");
		for (String string : stringArray) {
			System.out.println(string);
		}
	}

	public static void mergeSort(String[] string) {
		if (string.length > 1) {
			String[] leftString = new String[string.length / 2];
			String[] rightString = new String[string.length - string.length / 2];
			for (int i = 0; i < leftString.length; i++) {
				leftString[i] = string[i];
			}
			for (int j = 0; j < rightString.length; j++) {
				rightString[j] = string[j + string.length / 2];
			}
			mergeSort(leftString);
			mergeSort(rightString);
			merge(string, leftString, rightString);
		}
	}

	public static void merge(String[] stringArray, String[] leftString, String[] rightString) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < stringArray.length; i++) {
			if (b >= rightString.length
					|| (a < leftString.length && leftString[a].compareToIgnoreCase(rightString[b]) < 0)) {
				stringArray[i] = leftString[a];
				a++;
			} else {
				stringArray[i] = rightString[b];
				b++;
			}
		}
	}

}

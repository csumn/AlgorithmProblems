package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) throws Exception {

		List<String> file = new  ArrayList<String>();;
		// Need to read file line by line
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\csumn\\OneDrive\\Desktop\\Input.csv.txt"));
		String saveLine;
		while((saveLine = bufferedReader.readLine())!=null)
		{
			file.add(saveLine);
		}
		bufferedReader.close();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Key: ");
		String input = scanner.nextLine();
		BinarySearch binarySearch = new BinarySearch();
		Arrays.sort(file.toArray());
		System.out.println(file);
		int index = binarySearch.binarySearchString(file, input);
		if(index == -1)
		{
			System.out.println("Word Not found in file : " +input);
		}
		else{
			System.out.println("Word found in file : " +input);
		}
		scanner.close();
	}
	public  int binarySearchString(List<String> array, String key) { 	
		int start = 0;
		int end = array.size();
		while (start < end) {
			int mid = (start + end) / 2;
			if (key.compareTo((String)array.toArray()[mid]) < 0) {
				end = mid;
			} else if (key.compareTo((String)array.toArray()[mid]) > 0) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}

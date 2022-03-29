package com.bridgelabz;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFunctionAndRegex {
	String name = "<<name>>";
	String fullName = "<<full name>>";
	String mobileNumber = "xxxxxxxxxx";
	String date ="date";

	String customized_message;
	public void firstName(String input) {
		Pattern pattern = Pattern.compile(name);
		Matcher matcher = pattern.matcher(input);
		customized_message = matcher.replaceAll("Kohli");
	}
	public void fullName(String input) {
		Pattern pattern = Pattern.compile(fullName);
		Matcher matcher = pattern.matcher(customized_message);
		customized_message = matcher.replaceAll("Virat Kohli");
	}
	public void mobileNumber(String input) {
		Pattern pattern = Pattern.compile(mobileNumber);
		Matcher matcher = pattern.matcher(customized_message);
		customized_message = matcher.replaceAll("7337337337");
	}
	public void date(String input) {
		DateTimeFormatter presentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime localDate = LocalDateTime.now();

		Pattern pattern = Pattern.compile(date);
		Matcher matcher = pattern.matcher(customized_message);
		customized_message = matcher.replaceAll(presentDate.format(localDate));
	}

	public void displayMessage() {
		System.out.println(customized_message);
	}

	public static void main(String[] args) {
		StringFunctionAndRegex stringFunctionAndRegex = new StringFunctionAndRegex();
		String input = "Hello <<name>>,\n"
				+ "We have your full name as <<full name>> in our system, your contact number is 91-xxxxxxxxxx.\n"
				+ "Please, let us know in case of any clarification \n"
				+ "Thank you BridgeLabz\n"
				+ "date";
		stringFunctionAndRegex.firstName(input);
		stringFunctionAndRegex.fullName(input);
		stringFunctionAndRegex.mobileNumber(input);
		stringFunctionAndRegex.date(input);
		stringFunctionAndRegex.displayMessage();
	}
}

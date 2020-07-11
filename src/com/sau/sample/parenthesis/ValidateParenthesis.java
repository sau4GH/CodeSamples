package com.sau.sample.parenthesis;

public class ValidateParenthesis {

	public static void main(String[] args) {
		String str1 = "()()()()";
		String str2 = "(()";
		String str3 = "if(a=b)";
		String str4 = "This () is a ( statement";
		String str5 = "This  () is a ) statement (";
		
		System.out.format("\nIs this string < %s > valid ? %s", str1, validate(str1).toString().toUpperCase());
		System.out.format("\nIs this string < %s > valid ? %s", str2, validate(str2).toString().toUpperCase());
		System.out.format("\nIs this string < %s > valid ? %s", str3, validate(str3).toString().toUpperCase());
		System.out.format("\nIs this string < %s > valid ? %s", str4, validate(str4).toString().toUpperCase());
		System.out.format("\nIs this string < %s > valid ? %s", str5, validate(str5).toString().toUpperCase());
		
		
	}
	
	
	public static Boolean validate(String text){
		
		char[] cArr = text.toCharArray();
		
		int counter = 0;
		
		for (char c : cArr) {
			if (c == '(') {
				// Increment counter for every opening parenthesis
				counter++;
			} else if (c == ')') {
				// Decrement counter for every closing parenthesis
				counter--;
			} else if (counter < 0) {
				// To check condition where closing parenthesis comes before opening parenthesis
				return false;
			}
			

		}
		
		if (counter == 0) {
			// If counter is 0 that mean every opening parenthesis has corresponding closing parenthesis
			// and in right order
			return true;
		}
		
		// Validation fails
		return false;
	}

}

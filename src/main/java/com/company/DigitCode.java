package com.company;

import java.util.regex.Pattern;

public class DigitCode extends Code<String, Integer[]> {

	public DigitCode(String input) {
		super(input);
	}

	public static void main(String[] args) {
		System.out.println(Character.getNumericValue('8'));
	}

	@Override
	protected Integer[] encode(String code) {
		String regex = "^[0-9]*$";
		if (!Pattern.matches(regex, code)) {
			throw new IllegalArgumentException("");
		}
		char[] chars = code.toCharArray();
		Integer[] results = new Integer[chars.length];
		for (int i = 0; i < results.length; i++) {
			results[i] = Character.getNumericValue(chars[i]);
		}
		return results;
	}
}

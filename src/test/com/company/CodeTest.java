package com.company;

import org.junit.Assert;
import org.junit.Test;

public class CodeTest {
	public void digit_code_should_be_translate_into_post_code() {
	}

	@Test
	public void code_should_can_print() {
		Code<String, String> code = new Code<>("123456");
		Assert.assertEquals("123456", code.print());
	}

	@Test(expected = IllegalArgumentException.class)
	public void digit_code_should_be_only_print_digit1() {
		DigitCode code = new DigitCode("hello");
		code.print();
	}

	@Test()
	public void digit_code_should_be_only_print_digit() {
		DigitCode code = new DigitCode("123456");
		Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, code.print());
	}

}

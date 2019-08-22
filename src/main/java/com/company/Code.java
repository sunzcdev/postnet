package com.company;

public class Code<I, O> {
	private final I code;

	public Code(I input) {
		this.code = input;
	}

	public I getCode() {
		return this.code;
	}

	protected O encode(I code) {
		return (O) code;
	}

	public O print() {
		return encode(this.code);
	}
}

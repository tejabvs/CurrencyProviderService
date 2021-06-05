package com.tejas.Exceptions;

public class InvalidCurrencyCodeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCurrencyCodeException() {
		super();
	}

	public InvalidCurrencyCodeException(final String text) {
		super(text);

	}

}

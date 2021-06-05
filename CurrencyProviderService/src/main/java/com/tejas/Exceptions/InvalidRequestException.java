package com.tejas.Exceptions;

public class InvalidRequestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidRequestException(final String text) {
		super(text);
	}

	public InvalidRequestException() {
		super();
	}

}

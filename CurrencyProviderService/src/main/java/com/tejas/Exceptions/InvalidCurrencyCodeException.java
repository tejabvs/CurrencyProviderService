package com.tejas.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


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

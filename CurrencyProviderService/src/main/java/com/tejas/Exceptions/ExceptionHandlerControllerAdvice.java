package com.tejas.Exceptions;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

	@ExceptionHandler(InvalidCurrencyCodeException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody ResponseMode1 handleResourceNotFound(InvalidCurrencyCodeException exception,
			final HttpServletRequest request) {

		ResponseMode1 error = new ResponseMode1(new Date(), exception.getMessage(), 404);

		return error;
	}

	
	@ExceptionHandler(InvalidRequestException.class)
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	public @ResponseBody ResponseMode1 handleBadRequest(InvalidRequestException exception,
			final HttpServletRequest request) {

		ResponseMode1 error = new ResponseMode1(new Date(), exception.getMessage(), 400);

		return error;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ResponseMode1 handleException(final Exception exception, final HttpServletRequest request) {

		ResponseMode1 error = new ResponseMode1(new Date(), exception.getMessage(), 500);

		return error;
	}

}

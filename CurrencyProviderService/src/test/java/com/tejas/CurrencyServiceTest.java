package com.tejas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tejas.Exceptions.InvalidCurrencyCodeException;
import com.tejas.Exceptions.InvalidRequestException;
import com.tejas.Model.CurrencyEntity;
import com.tejas.Service.CurrencyServiceImpl;

@SpringBootTest
public class CurrencyServiceTest {

	@Autowired
	CurrencyServiceImpl service;

	@Test
	void testCurrency() {
		CurrencyEntity currency = service.getCurrency("INR");
		assertEquals(100l, currency.getCurrId());
	}
	
	@Test
	void testNullCurrency() {
		assertThrows(InvalidRequestException.class, () -> service.getCurrency(""));
	}
	
	@Test
	void testInvalidCurrency() {
		assertThrows(InvalidCurrencyCodeException.class, () -> service.getCurrency("IND"));
	}

	@Test
	void testCurrencyNotNull() {
		CurrencyEntity currency = service.getCurrency("USD");
		assertNotNull(currency);
	}

	@Test
	void testCurrencylenth() {
		assertThrows(InvalidRequestException.class, () -> service.getCurrency(""));
	}
	
	@Test
	void testCurrencylenth2() {
		assertThrows(InvalidRequestException.class, () -> service.getCurrency("IN"));
	}
	
	@Test
	void testCurrencieslist() {
		assertEquals(3,	service.getCurrencies().size());
	}
	
}

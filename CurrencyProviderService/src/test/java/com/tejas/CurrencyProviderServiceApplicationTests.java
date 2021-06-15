package com.tejas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tejas.Endpoints.CurrencyController;
import com.tejas.Model.CurrencyEntity;
import com.tejas.Service.ICurrencyService;

@ExtendWith(MockitoExtension.class)
public class CurrencyProviderServiceApplicationTests {

	@InjectMocks
	private CurrencyController controller;

	@Mock
	private ICurrencyService service;

	CurrencyEntity currency = new CurrencyEntity(100, "INR", "IND", "INDIAN RUPEE", "INT");
	
	List<CurrencyEntity> currencies = new ArrayList<>(); 
	

	@Test
	public void retrieveDetailsForCurrency() throws Exception {

		Mockito.when(service.getCurrency(Mockito.anyString())).thenReturn(currency);

		CurrencyEntity curr = controller.fetchCurrDetails("INR");

		assertEquals(currency, curr);

	}
	
	@Test
	public void retrieveAllCurrency() throws Exception {
		currencies.add(currency);
		
		Mockito.when(service.getCurrencies()).thenReturn(currencies);

		List curr = controller.fetchAllCurrDetails();

		assertEquals(3, curr.size());

	}
}

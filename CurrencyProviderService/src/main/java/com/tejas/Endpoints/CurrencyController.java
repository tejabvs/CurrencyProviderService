package com.tejas.Endpoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tejas.Exceptions.InvalidCurrencyCodeException;
import com.tejas.Model.CurrencyEntity;
import com.tejas.Service.ICurrencyService;

@RestController
public class CurrencyController {
	
	@Autowired
	ICurrencyService service;
	
	@GetMapping("/currency/{code}")
	public CurrencyEntity fetchCurrDetails(@PathVariable("code") String CurrencyCode ) throws InvalidCurrencyCodeException {
		return service.getCurrency(CurrencyCode);
		
	}
	
	@GetMapping("/currency")
	public List fetchAllCurrDetails() {
		return service.getCurrencies();
		
	}
}

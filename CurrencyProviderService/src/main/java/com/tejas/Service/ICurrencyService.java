package com.tejas.Service;

import java.util.List;

import com.tejas.Exceptions.InvalidCurrencyCodeException;
import com.tejas.Model.CurrencyEntity;

public interface ICurrencyService {
	
	CurrencyEntity getCurrency(String CurrencyCode)throws InvalidCurrencyCodeException;

	List<CurrencyEntity> getCurrencies();

}

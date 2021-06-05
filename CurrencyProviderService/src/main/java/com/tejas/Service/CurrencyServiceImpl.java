package com.tejas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejas.DAO.CurrencyDAO;
import com.tejas.Exceptions.InvalidCurrencyCodeException;
import com.tejas.Exceptions.InvalidRequestException;
import com.tejas.Model.CurrencyEntity;

@Service
public class CurrencyServiceImpl implements ICurrencyService {

	@Autowired
	private CurrencyDAO currencyRepo;
	private CurrencyEntity currency;

	@Override
	public CurrencyEntity getCurrency(String CurrencyCode) throws InvalidCurrencyCodeException {
		if ("".equals(CurrencyCode) || CurrencyCode == null)
			throw new InvalidRequestException("Currency Code must not be blank");

		if (CurrencyCode.length() < 3)
			throw new InvalidRequestException("Currency Code must be 3 characters length");

		currency = currencyRepo.getCurrency(CurrencyCode);

		if (currency == null)
			throw new InvalidCurrencyCodeException("Currency Code is invalid");
		else
			return currency;

	}

	@Override
	public List<CurrencyEntity> getCurrencies() {
		return currencyRepo.getAllCurrencies();
	}

}

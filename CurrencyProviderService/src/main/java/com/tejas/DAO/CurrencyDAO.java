package com.tejas.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tejas.Model.CurrencyEntity;

@Repository
public class CurrencyDAO {

	private static Map<String, CurrencyEntity> currencyUtil = new HashMap<>();

	static {
		CurrencyEntity currency1 = new CurrencyEntity(100l, "INR", "IND", "INDIAN RUPEE", "INT");
		CurrencyEntity currency2 = new CurrencyEntity(200l, "USD", "USA", "UNITED STATES DOLLAR", "USD");
		CurrencyEntity currency3 = new CurrencyEntity(300l, "EUR", "EUR", "EURPOEAN CURRENCY", "EUR");

		currencyUtil.put("INR", currency1);
		currencyUtil.put("USD", currency2);
		currencyUtil.put("EUR", currency3);

	}

	public CurrencyEntity getCurrency(String CurrencyCode) {
		return currencyUtil.get(CurrencyCode);
	}
	
	public List<CurrencyEntity> getAllCurrencies() {
		 Collection<CurrencyEntity> values = currencyUtil.values();
		 return new ArrayList<>(values);
	}
}

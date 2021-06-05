package com.tejas.Model;

public class CurrencyEntity {

	private long currId;
	private String CurrencyCd;
	private String CountryCd;
	private String CurrencyDesc;
	private String EntityCd;

	public long getCurrId() {
		return currId;
	}
//
//	public void setCurrId(long currId) {
//		this.currId = currId;
//	}

	public String getCountryCd() {
		return CountryCd;
	}

//	public void setCountryCd(String countryCd) {
//		CountryCd = countryCd;
//	}

	public String getCurrencyDesc() {
		return CurrencyDesc;
	}

//	public void setCurrencyDesc(String currencyDesc) {
//		CurrencyDesc = currencyDesc;
//	}

	public String getEntityCd() {
		return EntityCd;
	}

//	public void setEntityCd(String entityCd) {
//		EntityCd = entityCd;
//	}

	public String getCurrencyCd() {
		return CurrencyCd;
	}

//	public void setCurrencyCd(String currencyCd) {
//		CurrencyCd = currencyCd;
//	}

	public CurrencyEntity(long currId, String currencyCd, String countryCd, String currencyDesc, String entityCd) {
		super();
		this.currId = currId;
		CurrencyCd = currencyCd;
		CountryCd = countryCd;
		CurrencyDesc = currencyDesc;
		EntityCd = entityCd;
	}

	
}

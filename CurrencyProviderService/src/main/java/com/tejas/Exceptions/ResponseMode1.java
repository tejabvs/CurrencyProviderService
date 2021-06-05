package com.tejas.Exceptions;

import java.util.Date;

public class ResponseMode1 {
	
	private Date date;
	private String desc;
	private int statusCode;
	
	public ResponseMode1(Date date, String desc, int statusCode) {
		super();
		this.date = date;
		this.desc = desc;
		this.statusCode = statusCode;
	}
	
	
}

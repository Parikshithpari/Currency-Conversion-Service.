package com.example.demo.dto;

public class CurrencyConversion 
{
	private String base;
	private String symbols;
	
	public CurrencyConversion(String base, String symbols)
	{
		super();
		this.base = base;
		this.symbols = symbols;
	}
	
	public CurrencyConversion()
	{
		super();
	}
	
	public String getBase()
	{
		return base;
	}
	
	public void setBase(String base) 
	{
		this.base = base;
	}
	
	public String getSymbols() 
	{
		return symbols;
	}
	
	public void setSymbols(String symbols) 
	{
		this.symbols = symbols;
	}
}

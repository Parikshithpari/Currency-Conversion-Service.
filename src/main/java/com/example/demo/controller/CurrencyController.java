package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.CurrencyConversion;
import com.example.demo.service.CurrencyService;

@RestController
public class CurrencyController 
{
	@Autowired
	private CurrencyService currencyservice;

	public CurrencyController(CurrencyService currencyservice) 
	{
		this.currencyservice = currencyservice;
	}
	
	@GetMapping("{symbols}/{base}")
	public CurrencyConversion getCurrency(@RequestParam("symbols") String symbols, @RequestParam("base") String base)
	{
		return currencyservice.fetchCurrencyRates(symbols, base);
	}
}

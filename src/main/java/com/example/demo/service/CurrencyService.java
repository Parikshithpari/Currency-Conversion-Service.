package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.example.demo.dto.CurrencyConversion;

@Service
public class CurrencyService 
{
	@Autowired
	private WebClient webClient;

	public CurrencyService(WebClient webClient)
	{
		this.webClient = webClient;
	}
	
	@Cacheable(value = "CURRENCY", key = "#symbol+_+#base")
	public CurrencyConversion fetchCurrencyRates(String symbols, String base) 
	{
	    return webClient.get()
	            .uri("/latest?apikey={api.key}&symbol={symbol}&base={base}",symbols, base)
	            .retrieve()
	            .bodyToMono(CurrencyConversion.class)
	            .block();
	}
	
}

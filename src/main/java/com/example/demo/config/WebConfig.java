package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebConfig
{
	@Value("${api.key}")
	private String apiKey;
	
    @Bean
    public WebClient webClient()
    {
        return WebClient.builder()
                .baseUrl("https://api.currencyfreaks.com/v2.0/rates")
                .defaultHeader("Authorization", "Bearer " + apiKey)
                .build();
    }
}


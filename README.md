# Currency-Conversion-Service.
This microservice provides real-time currency exchange rate data by consuming the CurrencyFreaks API. Built with Spring Boot and WebClient, it is optimized for speed, scalability, and modularity. To reduce latency and third-party API hits, it leverages Redis caching via Spring Cache abstraction.
<br>
## ✨ Features
- 🔄 Fetches live foreign exchange rates for any currency pair
- ⚡ Caches results using Redis to improve performance and reduce API calls
- 🌐 Uses Spring WebClient for reactive, non-blocking HTTP communication
- 🧠 Clean and configurable architecture ready for integration into larger systems.

## 🧪 How It Works
- The CurrencyService handles all outbound requests to the CurrencyFreaks API.
- If the requested currency conversion result exists in the Redis cache, it is retrieved instantly.
- If not cached, the service fetches the rate via WebClient, stores it in Redis, and returns it.
- The caching mechanism uses @Cacheable with a dynamic key format (symbol_base).

## 🛠 Technologies Used
- Java 21
- Spring Boot
- Spring WebFlux (WebClient)
- Redis (with spring-cache)
- CurrencyFreaks API

## 📂 Project Structure

├── controller/
│   └── CurrencyController.java (optional REST layer)
├── service/
│   └── CurrencyService.java
├── model/
│   └── CurrencyConversion.java
└── resources/
    └── application.properties

## 🔮 Future Enhancement
- TTL (Time-To-Live) for Cached Entries
- Rate Limiting & Retry Mechanism
- API Key Vaulting
- Currency Conversion Calculation
- Swagger / OpenAPI Documentation
- Dockerization and Kubernetes Deployment






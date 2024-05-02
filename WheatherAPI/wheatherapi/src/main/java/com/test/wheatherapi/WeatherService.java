package com.test.wheatherapi;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

@Service
public class WeatherService {

    @Value("${rapidapi.key}")
    private String apiKey;

    @Value("${rapidapi.host}")
    private String apiHost;
    
    @Value("${rapidapi.application-id}")
    private String applicationId;

    @Value("${rapidapi.forecast-summary-url}")
    private String forecastSummaryUrl;

    @Value("${rapidapi.hourly-forecast-url}")
    private String hourlyForecastUrl;
    
    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-rapidapi-key", apiKey);
        headers.set("x-rapidapi-host", apiHost);
        headers.set("X-Application-ID", "applicationId");
        return headers;
        
    }
    
    public ResponseEntity<String> getForecastSummary(String city) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = createHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        return restTemplate.exchange(forecastSummaryUrl.replace("{city}", city), HttpMethod.GET, entity, String.class);
        
    }

    public ResponseEntity<String> getHourlyForecast(String city) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = createHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        return restTemplate.exchange(hourlyForecastUrl.replace("{city}", city), HttpMethod.GET, entity, String.class);
    }
}


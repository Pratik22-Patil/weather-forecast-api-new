package com.test.wheatherapi;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/summary/{city}")
    public ResponseEntity<String> getForecastSummary(@PathVariable String city) {
    	return weatherService.getForecastSummary(city);
    	//return ResponseEntity.ok().body("Weather summary for " + city);
    }

    @GetMapping("/hourly/{city}")
    public ResponseEntity<String> getHourlyForecast(@PathVariable String city) {
        return weatherService.getHourlyForecast(city);
    }
}


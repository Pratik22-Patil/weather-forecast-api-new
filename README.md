# weather-forecast-api-new
This Application contains API as below:
API 1: Get the Weather forecast summary of Any city using API (RapidApiGetForecastSummaryByLocationName)
API 2: Get hourly Weather forecast details of Any city using API (RapidApiGetHourlyForecastByLocationName)
API Document: https://rapidapi.com/wettercom-wettercom-default/api/forecast9 (RapidApiGetForecastSummaryByLocationName & RapidApiGetHourlyForecastByLocationName)

Techstack:
This Application is using below versions.
Java 17
SpringBoot 3.2.5
Maven 4

Below maven dependencies used in the project:
'Spring Web','Spring Security','Spring Boot DevTools'

API Details:
1. getForecastSummary
URL: http://localhost:8080/api/weather/summary/Berlin
O/P with default username and password:  ![defaultpwd1](https://github.com/Pratik22-Patil/weather-forecast-api-new/assets/114714806/5e103fcc-bd8b-4ac9-a199-d503597b1b00)
O/P with provided username and password: ![BasicAuthOutput1](https://github.com/Pratik22-Patil/weather-forecast-api-new/assets/114714806/c0dba128-4e54-4cd0-9c88-f8764b317bda)

Note: Added below properties in application.properties for providing custom password
spring.security.user.name=pratik
spring.security.user.password=Weatherapi@123

2.getHourlyForecast
URL: http://localhost:8080/api/weather/hourly/Berlin
O/P: ![image](https://github.com/Pratik22-Patil/weather-forecast-api/assets/114714806/17a4afe3-20c4-45b2-838e-96de37db273e)

Json O/P  for 1st API attached in repo as well for reference.

Note: API require subscription for rapidapi.com. As I used free subscription, It only have access for 1st API. I'm getting error for 2nd API as "401 Unauthorized: \"{\"message\":\"This endpoint is disabled for your subscription"
If subscription is available, it will work.

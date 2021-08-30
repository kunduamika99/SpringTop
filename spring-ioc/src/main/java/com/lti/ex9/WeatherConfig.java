package com.lti.ex9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherConfig {
    @Bean("weather")
    public WeatherService getForecast(){
        return new WeatherService();
    }

}

package com.lti.ex9;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWeather {

    @Test
    public void testForecast(){
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(WeatherConfig.class);
        WeatherService ws = (WeatherService) appCtx.getBean("weather");
        ws.forecast();
    }
}

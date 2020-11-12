package com.dp.behavioral.weatherclient;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

class WeatherDataTest {

  @Test
 void initClient(){
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    weatherData.registerObservers(currentConditionsDisplay);
    weatherData.setMeasurements(32,10,10.0);
    MatcherAssert.assertThat(32, CoreMatchers.is(CoreMatchers.equalTo(currentConditionsDisplay.getTemp())));
  }
}
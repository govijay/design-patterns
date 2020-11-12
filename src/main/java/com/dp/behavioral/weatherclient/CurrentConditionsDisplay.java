package com.dp.behavioral.weatherclient;

import java.util.logging.Logger;

public class CurrentConditionsDisplay implements Observer,Display{

  private final Logger logger = Logger.getLogger(CurrentConditionsDisplay.class.getName());
  private int temp;
  private int humidity;
  private double pressure;
  private final WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
  }

  @Override
  public void display() {
   logger.info(()-> String.format("Temperature is %d , Humidity is %d and Sea level pressure is %.2f%n",this.temp,this.humidity,this.pressure));
  }

  @Override
  public void update() {
      this.temp = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      this.pressure = weatherData.getPressure();
      display();
  }

  public int getTemp() {
    return temp;
  }

  public int getHumidity() {
    return humidity;
  }

  public double getPressure() {
    return pressure;
  }
}

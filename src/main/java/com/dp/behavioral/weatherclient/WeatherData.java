package com.dp.behavioral.weatherclient;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

  private List<Observer> observerList;
  private int temperature;
  private int humidity;
  private double pressure;

  public WeatherData() {
    this.observerList = new ArrayList<>();
  }

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  public int getHumidity() {
    return humidity;
  }

  public void setHumidity(int humidity) {
    this.humidity = humidity;
  }

  public double getPressure() {
    return pressure;
  }

  public void setPressure(double pressure) {
    this.pressure = pressure;
  }

  public void setMeasurements(int temperature,int humidity,double pressure){
    setTemperature(temperature);
    setHumidity(humidity);
    setPressure(pressure);
    notifyObservers();
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observerList ) {
        o.update();
    }
  }

  @Override
  public void registerObservers(Observer o) {
      observerList.add(o);
  }

  @Override
  public void removeObservers(Observer o) {
      int idx = observerList.indexOf(o);
      if(idx >=0){
          observerList.remove(idx);
      }
  }
}

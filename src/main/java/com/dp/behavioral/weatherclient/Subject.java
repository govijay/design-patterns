package com.dp.behavioral.weatherclient;

public interface Subject {

  void notifyObservers();
  void registerObservers(Observer o);
  void removeObservers(Observer o);


}

package com.dp.creational.factorymethod.button;
/*
* Product interface common to all objects that can be produced by creator and its sub classes.
* */
public interface Button {

  void render();
  void onClick();

}

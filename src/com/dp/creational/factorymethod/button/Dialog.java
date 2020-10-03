package com.dp.creational.factorymethod.button;

/*
* Abstract class declares the factory method.
* */
public interface Dialog {

  /*
  * Factory Method.
  * */
  Button createButton();

  default void render(){
    Button okButton = createButton();
    okButton.render();
  }

}

package com.dp.creational.factorymethod.button;

/*
 * Creator Sub class
 * */
public class WebDialog implements Dialog{

  /*
   *  Factory Method is override and right product is constructed.
   * */
  @Override
  public Button createButton() {
    return new HTMLButton();
  }
}

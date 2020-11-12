package com.dp.creational.factorymethod.button;

/*
 * Concrete Product.
 * */
public class HTMLButton implements Button {

  @Override
  public void render() {
    System.out.println("Render from HTML Button");
  }

  @Override
  public void onClick() {
    System.out.println("onCLick event from HTML Button");
  }
}

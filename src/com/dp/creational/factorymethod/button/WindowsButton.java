package com.dp.creational.factorymethod.button;

/*
* Concrete Product.
* */
public class WindowsButton implements Button{

  @Override
  public void render() {
    System.out.println("Render from Windows Button");
  }

  @Override
  public void onClick() {
    System.out.println("Click Event from Windows Button");
  }
}

package com.dp.creational.abstractfactory.kingdom;

/**
 * Orc Army Implementation. Product B family.
 */
public class OrcArmy implements Army{
  private static final String DESC="This is Orc Army";
  @Override
  public String getDescription() {
    return DESC;
  }
}

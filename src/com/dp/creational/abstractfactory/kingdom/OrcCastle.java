package com.dp.creational.abstractfactory.kingdom;

/**
 * Orc Castle Implementation. Concrete Product B family.
 */
public class OrcCastle implements Castle{
  private static final String DESC="This is Orc Castle";
  @Override
  public String getDescription() {
    return DESC;
  }
}

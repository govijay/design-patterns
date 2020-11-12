package com.dp.creational.abstractfactory.kingdom;

/**
 * Orc King Implementation. Concrete Product B family.
 */
public class OrcKing implements King{
  private static final String DESC="This is Orc King";
  @Override
  public String getDescription() {
    return DESC;
  }
}

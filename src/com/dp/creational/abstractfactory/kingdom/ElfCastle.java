package com.dp.creational.abstractfactory.kingdom;

/**
 * Elf Castle Implementation. Concrete Product A family.
 */
public class ElfCastle implements Castle{

  private static final String DESC = "This is Elf Castle";
  @Override
  public String getDescription(){
    return DESC;
  }
}

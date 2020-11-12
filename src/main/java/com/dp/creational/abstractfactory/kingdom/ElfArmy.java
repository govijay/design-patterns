package com.dp.creational.abstractfactory.kingdom;

/**
 * Elf Army Implementation. Concrete Product A.
 */
public class ElfArmy implements Army{
  private static final String DESC ="This is Elf Army";
  @Override
  public String getDescription() {
    return DESC;
  }
}

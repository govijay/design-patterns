package com.dp.creational.abstractfactory.kingdom;

/**
 * Elf Kind Implementation. Concrete Product A family.
 */
public class ElfKing implements King{
  private static final String DESC ="This is Elf King";
  @Override
  public String getDescription() {
    return DESC;
  }
}

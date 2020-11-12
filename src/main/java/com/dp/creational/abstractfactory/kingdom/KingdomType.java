package com.dp.creational.abstractfactory.kingdom;

public enum KingdomType {
  ELF("Elf"),
  ORC("Orc");
  private String name;

  KingdomType(String name){
    this.name = name;
  }

  @Override
  public String toString() {
    return "KingdomType{" +
        "name='" + name + '\'' +
        '}';
  }
}

package com.dp.creational.factorymethod.blacksmith;

/**
 *
 * WeaponType enum
 *
 */
public enum WeaponType {
  AXE("Axe"),
  SHORT_SWORD("Short Sword"),
  SPEAR("Spear"),
  UNDEFINED("");

  private String title;

  WeaponType(String title) {
    this.title = title;
  }


  @Override
  public String toString() {
    return "WeaponType{" +
        "title='" + title + '\'' +
        '}';
  }
}

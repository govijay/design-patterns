package com.dp.creational.factorymethod.blacksmith;

/**
 * ElfWeapon
 *
 * */
public class ElfWeapon implements Weapon {

  private WeaponType weaponType;

  public ElfWeapon(WeaponType weaponType){
    this.weaponType = weaponType;
  }

  @Override
  public WeaponType getWeaponType() {
    return weaponType;
  }

  @Override
  public String toString() {
    return String.format("ElfWeapon is %s and Object is %s", weaponType, this.hashCode());
  }
}

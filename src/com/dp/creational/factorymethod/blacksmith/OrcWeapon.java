package com.dp.creational.factorymethod.blacksmith;

/**
* OrcWeapon
*
* */
public class OrcWeapon implements Weapon{

  private WeaponType weaponType;

  public OrcWeapon(WeaponType weaponType){
    this.weaponType = weaponType;
  }

  @Override
  public WeaponType getWeaponType() {
    return weaponType;
  }

  @Override
  public String toString() {
    return String.format("OrcWeapon is %s and Object is %s", weaponType, this.hashCode());
  }
}

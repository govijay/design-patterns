package com.dp.creational.factorymethod.blacksmith;

import java.util.EnumMap;
import java.util.Map;

/**
 * Concrete subclass for creating new objects.
 * if Object exists , return from Map else manufacture new weapon.
 * */
public class OrcBlackSmith implements BlackSmith{

  private static final EnumMap<WeaponType,OrcWeapon> orcArsenal = new EnumMap<>(WeaponType.class);

  @Override
  public Weapon manufactureWeapon(WeaponType weaponType) {

    if(orcArsenal.containsKey(weaponType)){
      return orcArsenal.get(weaponType);
    }else{
      OrcWeapon orcWeapon = new OrcWeapon(weaponType);
      orcArsenal.put(weaponType,orcWeapon);
      return orcWeapon;
    }
  }
}

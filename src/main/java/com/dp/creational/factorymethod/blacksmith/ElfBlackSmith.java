package com.dp.creational.factorymethod.blacksmith;

import java.util.EnumMap;
import java.util.Map;

/**
* Concrete subclass for creating new objects.
* if Object exists , return from Map else manufacture new weapon.
* */
public class ElfBlackSmith implements BlackSmith {

  private static final EnumMap<WeaponType,ElfWeapon> elfArsenal = new EnumMap<>(WeaponType.class);

  @Override
  public Weapon manufactureWeapon(WeaponType weaponType) {
    if(elfArsenal.containsKey(weaponType)){
      return elfArsenal.get(weaponType);
    }else{
      ElfWeapon elfWeapon = new ElfWeapon(weaponType);
      elfArsenal.put(weaponType,elfWeapon);
      return elfWeapon;
    }
  }
}

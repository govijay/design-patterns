package com.dp.creational.factorymethod.blacksmith;

/**
* The interface containing method for producing objects.
*
* */
public interface BlackSmith {

  Weapon manufactureWeapon(WeaponType weaponType);

}

package com.dp.creational.factorymethod.blacksmith;

import java.util.logging.Logger;

/**
 * In this Factory Method example we have an interface ({@link BlackSmith}) with a method for
 * creating objects ({@link BlackSmith#manufactureWeapon}). The concrete subclasses (
 * {@link OrcBlackSmith}, {@link ElfBlackSmith}) then override the method to produce objects of
 * their liking.
 */
public class BlackSmithApp {

  private Logger logger = Logger.getLogger(getClass().getName());
  private final BlackSmith blackSmith;

  /**
   * Creates an instance of <code>App</code> which will use <code>blacksmith</code> to manufacture
   * the weapons for war.
   * <code>App</code> is unaware which concrete implementation of {@link BlackSmith} it is using.
   * The decision of which blacksmith implementation to use may depend on configuration, or
   * the type of rival in war.
   * @param blackSmith a non-null implementation of blacksmith
   */
  public BlackSmithApp(BlackSmith blackSmith){
    this.blackSmith = blackSmith;
  }

  private void manufactureWeapons(){
    Weapon weapon;
    weapon = blackSmith.manufactureWeapon(WeaponType.AXE);
    logger.info(weapon.toString());
    weapon = blackSmith.manufactureWeapon(WeaponType.SHORT_SWORD);
    logger.info(weapon.toString());
  }

  /**
   * Program entry point
   *
   * @param args command line args
   */
  public static void main(String[] args) {

    BlackSmithApp app = new BlackSmithApp(new OrcBlackSmith());
    app.manufactureWeapons();

    app = new BlackSmithApp(new ElfBlackSmith());
    app.manufactureWeapons();

  }
}

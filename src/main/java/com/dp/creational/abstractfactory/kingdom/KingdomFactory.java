package com.dp.creational.abstractfactory.kingdom;

/**
 * Abstract Factory Interface.
 */
public interface KingdomFactory {

  Castle createCastle();
  King createKing();
  Army createArmy();

}

package com.dp.creational.abstractfactory.kingdom;

import java.util.logging.Logger;

/**
 *
 * The Abstract Factory pattern provides a way to encapsulate a group of individual factories that have a common theme
 * without specifying their concrete classes. In normal usage, the client software creates a concrete implementation of
 * the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part
 * of the theme. The client does not know (or care) which concrete objects it gets from each of these internal
 * factories, since it uses only the generic interfaces of their products. This pattern separates the details of
 * implementation of a set of objects from their general usage and relies on object composition, as object creation is
 * implemented in methods exposed in the factory interface.
 * <p>
 * The essence of the Abstract Factory pattern is a factory interface ({@link KingdomFactory}) and its implementations (
 * {@link ElfKingdomFactory}, {@link OrcKingdomFactory}). The example uses both concrete implementations to create a
 * king, a castle and an army.
 *
 */
public class KingdomApp {

  private static Logger logger = Logger.getLogger(KingdomApp.class.getName());
  private Army army;
  private Castle castle;
  private King king;

  public Army getArmy() {
    return army;
  }

  public void setArmy(final Army army) {
    this.army = army;
  }

  public Castle getCastle() {
    return castle;
  }

  public void setCastle(final Castle castle) {
    this.castle = castle;
  }

  public King getKing() {
    return king;
  }

  public void setKing(final King king) {
    this.king = king;
  }

  /**
   * creates the kingdom.
   * @param factory kingdom factory
   */
  private void createKingdom(final KingdomFactory factory){
    setKing(factory.createKing());
    setArmy(factory.createArmy());
    setCastle(factory.createCastle());
  }



  /** Factory Maker */
  public static final class FactoryMaker {

    private FactoryMaker(){
      //not called. hide the implicit public one.
    }

    public static KingdomFactory makeFactory(KingdomType type) {
      switch (type) {
        case ELF:
          return new ElfKingdomFactory();
        case ORC:
          return new OrcKingdomFactory();
        default:
          throw new IllegalArgumentException("Kingdom Type not supported");
      }
    }
  }

  /**
   * App entry main.
   * @param args command line args
   */
  public static void main(String[] args) {
      KingdomApp app = new KingdomApp();
      logger.info("Elf Kingdom");
      app.createKingdom(FactoryMaker.makeFactory(KingdomType.ELF));
      logger.info(app.getKing().getDescription());
      logger.info(app.getArmy().getDescription());
      logger.info(app.getCastle().getDescription());

      logger.info(" Orc Kingdom");
      app.createKingdom(FactoryMaker.makeFactory(KingdomType.ORC));
      logger.info(app.getKing().getDescription());
      logger.info(app.getArmy().getDescription());
      logger.info(app.getCastle().getDescription());
  }
}

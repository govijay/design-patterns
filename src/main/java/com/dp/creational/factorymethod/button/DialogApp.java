package com.dp.creational.factorymethod.button;

public class DialogApp {

  private static Dialog dialog;

  private static void initialize(String configType){

    switch (configType){
      case "WIN":
        dialog = new WindowsDialog();
        break;
      case "WEB":
        dialog = new WebDialog();
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + configType);
    }
  }

  public static void main(String[] args) {
    DialogApp.initialize("WIN");
    dialog.render();
  }
}

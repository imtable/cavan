/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass2splitted;

import java.util.List;

/**
 *
 * @author CI20250986
 */
public class View {

  public static void exiting() {
    // Print a message when the program is closing
    System.out.println("exiting..");
  }

  public static void wrongAnswer() {
    // Message shown when the user enters an invalid option
    System.out.println("Wrong decision, BOOM!");
  }

  public static void renderMainMenu(List<String> strings) {
    // Print the main menu header
    System.out.println("====== MENU ======");
    System.out.println("0) Exit");

    // Print each menu option from the list
    for (String str : strings) {
      System.out.println(str);
    }

    System.out.println("====== ======");

    // Ask the user to choose an option
    System.out.print("Please enter an option: ");
  }

  public static void renderMenu(List<String> strings) {
    // Print a simple menu (used for other screens if needed)
    System.out.println("0) Exit");

    // Print each option
    for (String str : strings) {
      System.out.println(str);
    }

    // Ask the user to choose an option
    System.out.print("Please enter an option: ");
  }

  public static void print(String string) {
    // Print a normal message
    System.out.println(string);
  }

  public static void printResult(String string) {
    // Print a formatted result block
    System.out.println(">>> Result: ");
    System.out.println(string);
    System.out.println("<<<");
  }
}

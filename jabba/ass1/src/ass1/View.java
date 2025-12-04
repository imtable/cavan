/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass1;

import java.util.List;

/**
 *
 * @author CI20250986
 */

// View class handles all output to the user
public class View {
  
  // Print message if exit
  static void printExit() {
    System.out.println("Exiting..");
  }

  // Print message for invalid input
  static void wrongAnswer() {
    System.out.println("Wrong decision, BOOM!");
  }

  // Print menu options and prompt user for choice
  static void print(List<String> strings) {
    for (String str : strings) {
      System.out.println(str);
    }
    System.out.print("Please enter an option: ");
  }

  // Print conversion results with units
  static void printResult(String units, List<Double> result) {
    System.out.println("In " + units + " it would be: " + result.toString());
  }
}

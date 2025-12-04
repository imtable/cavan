/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CI20250986
 */
// Controller class to handle user input and conversion operations
public class Controller {

  static void run() {
    // Store conversion results
    List<Double> result = new ArrayList<>();

    // Creating options for menu
    List<String> printerStrings = new ArrayList<>();
    printerStrings.add("0) Exit");
    printerStrings.add("1) C->F");
    printerStrings.add("2) F->C");
    View.print(printerStrings);

    // Read user input
    Scanner s = new Scanner(System.in);
    int input = s.nextInt();

    // Handle user choice
    while (true) {
      if (input == 0) {
        // Handle exit option
        View.printExit();
        break;
      }

      if (input == 1) {
        // Convert Celsius to Fahrenheit
        result = Operations.cToF(s);
        View.printResult("Fahrenheit", result);
        break;
      } else if (input == 2) {
        // Convert Fahrenheit to Celsius
        result = Operations.fToC(s);
        View.printResult("Celsius", result);
        break;
      } else {
        // Handle invalid input
        View.wrongAnswer();
        break;
      }
    }
  }
}

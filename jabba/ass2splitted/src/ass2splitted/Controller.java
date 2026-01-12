/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass2splitted;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CI20250986
 */
public class Controller {

  public static void handling(Scanner s, String firstInput, String secondInput) {

    // Create a list of menu options to show the user
    List<String> printerStrings = new ArrayList<>();
    printerStrings.add("1) Search a string for a particular substring");
    printerStrings.add("2) Reversing the string");
    printerStrings.add("3) Changing the case of the string");
    printerStrings.add("4) Check if the string is a palindrome");
    printerStrings.add("5) Reversing and changing the case of the string");
    printerStrings.add("6) Change inputed strings");

    // Show the menu on screen
    View.renderMainMenu(printerStrings);

    // Read the user's choice
    int answer = s.nextInt();

    // Decide what to do based on the user's choice
    switch (answer) {
      case 0 ->
        Controller.exiting(); // Exit the program
      case 1 ->
        Controller.substringing(secondInput, s); // Search for substring
      case 2 ->
        Controller.reversing(firstInput, secondInput); // Reverse string
      case 3 ->
        Controller.casing(firstInput, secondInput); // Change case
      case 4 ->
        Controller.palindroming(secondInput); // Check palindrome
      case 5 ->
        Controller.reversingAndCasing(firstInput, secondInput); // Reverse + change case
      case 6 ->
        Controller.running(); // Restart input process
      default ->
        View.wrongAnswer(); // Handle invalid input
    }
  }

  public static void running() {
    Scanner s = new Scanner(System.in);

    // Ask user for first string
    System.out.println("input a first string: ");
    String firstInput = s.nextLine();

    // Ask user for second string
    System.out.println("input a second string: ");
    String secondInput = s.nextLine();

    // Keep showing the menu forever
    while (true) {
      Controller.handling(s, firstInput, secondInput);
    }
  }

  public static void exiting() {
    // Print exit message and close program
    View.exiting();
    System.exit(0);
  }

  public static void palindroming(String string) {

    // Convert string to lowercase
    String lowered = Operations.stringToLowercase(string);

    // Reverse the lowercase string
    String backwarded = Operations.backwardString(lowered);

    // Check if original lowercase equals reversed version
    if (lowered.equals(backwarded)) {
      View.printResult("yes, it's a palindrome");
    } else {
      View.printResult("no, it's not a palindrome");
    }
  }

  public static void reversingAndCasing(String firstInput, String secondInput) {

    // Reverse the second string
    String reversedString = Operations.backwardString(secondInput);

    // Switch the case of the reversed string
    String caseSwitchedReversedString = Operations.switchStringCase(reversedString);

    // Join firstInput + modified secondInput
    String result = Operations.concatination(firstInput, caseSwitchedReversedString);

    // Show result
    View.printResult(result);
  }

  public static void substringing(String string, Scanner s) {

    // Ask user for substring and check if it exists
    String substring = Operations.searchSubstring(string, s);

    if (substring != null) {
      // Found substring
      View.printResult(
              "yes, there is a " + "\"" + substring + "\""
              + " substring of " + "\"" + string + "\"" + " string");
    } else {
      // Not found
      View.printResult("there is no substring");
    }
  }

  public static void casing(String firstInput, String secondInput) {

    // Change the case of the second string
    String cased = Operations.switchStringCase(secondInput);

    // Combine firstInput + modified secondInput
    String result = Operations.concatination(firstInput, cased);

    // Show result
    View.printResult(result);
  }

  public static void reversing(String firstInput, String secondInput) {

    // Reverse the second string
    String backwarded = Operations.backwardString(secondInput);

    // Combine firstInput + reversed secondInput
    String result = Operations.concatination(firstInput, backwarded);

    // Show result
    View.printResult(result);
  }
}

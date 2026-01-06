/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ass2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CI20250986
 */
public class Ass2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Hello, World. This is my second assigment.");
    Scanner s = new Scanner(System.in);
    String secondInputModified = "";

    System.out.println("input a first string: ");
    String firstInput = s.nextLine();

    System.out.println("input a second string: ");
    String secondInput = s.nextLine();

    List<String> printerStrings = new ArrayList<>();
    printerStrings.add("1) Search a string for a particular substring");
    printerStrings.add("2) Reversing the string");
    printerStrings.add("3) Changing the case of the string");
    printerStrings.add("4) Check if the string is a palindrome");
    printerStrings.add("5) Reversing and changing the case of the string");
    View.printer(printerStrings);

    int answer = s.nextInt();

    switch (answer) {
      case 0 ->
        View.exiting();
      case 1 ->
        Controller.substringing(secondInput, s);
      case 2 ->
        Controller.reversing(secondInput);
      case 3 ->
        Controller.casing(secondInput, s);
      case 4 ->
        Controller.palindroming(secondInput);
      case 5 ->
        Controller.reversingAndCasing(secondInput, s);
      default ->
        View.wrongAnswer();
    }
  }

  class Controller {

    public static void palindroming(String string) {
      String backwarded = Operations.backwardString(string);
      
      if (string.equals(backwarded)) {
        View.print("yes, it's a palindrome");
      }
      else { 
        View.print("no, it's not a palindrome"); 
      }
    }

    public static void reversingAndCasing(String string, Scanner s) {
      String reversedString = Operations.backwardString(string);
      String caseSwitchedString = Operations.switchStringCase(reversedString, s);
      View.print(caseSwitchedString);
    }

    public static void casing(String string, Scanner s) {
      String result = Operations.switchStringCase(string, s);
      View.print(result);
    }

    public static void substringing(String string, Scanner s) {
      String substring = Operations.searchSubstring(string, s);
      if (substring != null) {
        View.print(
                "yes, there is a " + "\"" + substring + "\""
                + " substring of " + "\"" + string + "\"" + " string");
      } else {
        View.print("there is no substring");
      }
    }

    public static void reversing(String string) {
      String backwarded = Operations.backwardString(string);
      View.print(backwarded);
    }
  }

  class Operations {

    public static String switchStringCase(String string, Scanner s) {
      String result = "";
      List<String> printerStrings = new ArrayList<>();
      printerStrings.add("1) to uppercase");
      printerStrings.add("2) to lowercase");
      View.printer(printerStrings);

      int answer = s.nextInt();

      switch (answer) {
        case 0 ->
          View.exiting();
        case 1 -> {
          result = Operations.stringToUppercase(string);
        }
        case 2 -> {
          result = Operations.stringToLowercase(string);
        }
        default ->
          View.wrongAnswer();
      }
      return result;
    }

    public static String stringToUppercase(String string) {
      return string.toUpperCase();
    }

    public static String stringToLowercase(String string) {
      return string.toLowerCase();
    }

    public static String backwardString(String string) {
      int len = string.length();
      List<Character> backwarded = new ArrayList<>();

      for (int i = len - 1; i >= 0; i--) {
        char letter;
        letter = string.charAt(i);
        backwarded.add(letter);
      }

      StringBuilder sb = new StringBuilder();
      for (char c : backwarded) {
        sb.append(c);
      }
      String result = sb.toString();
      return result;
    }

    public static String searchSubstring(String string, Scanner s) {
      s.nextLine();
      System.out.println("input a substring: ");
      String substring = s.nextLine();

      if (string.contains(substring)) {
        return substring;
      } else {
        return null;
      }

//    String result = "";
//    int len = string.length();
//    int lenSubstring = substring.length();
//    for (int i = 0; i < len; i++) {
//      for (int n = 0; n < lenSubstring; n++) {
//        char letter = substring.charAt(n);
//        if (string.charAt(i) == letter) {
//          result = result + letter;
//        } else {
//          result = "";
//        }
//      }
//    }
//    return result;
    }

    public static String concatination(String string1, String string2) {
      return string1 + string2;
    }
  }

  class View {

    public static void exiting() {
      System.out.println("exiting..");
      System.exit(0);
    }

    public static void wrongAnswer() {
      System.out.println("Wrong decision, BOOM!");
    }

    public static void printer(List<String> strings) {
      System.out.println("0) Exit");
      for (String str : strings) {
        System.out.println(str);
      }
      System.out.print("Please enter an option: ");
    }

    public static void print(String string) {
      System.out.println(string);
    }
  }
}

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
public class Operations {

  public static String switchStringCase(String string) {

    // Used to build the final modified string
    StringBuilder result = new StringBuilder();

    // Loop through every character in the string
    for (int i = 0; i < string.length(); i++) {
      char c = string.charAt(i);

      // If the character is lowercase, convert to uppercase
      if (c >= 'a' && c <= 'z') {
        result.append((char) (c - 32));

        // If the character is uppercase, convert to lowercase
      } else if (c >= 'A' && c <= 'Z') {
        result.append((char) (c + 32));

        // If it's not a letter, keep it unchanged
      } else {
        result.append(c);
      }
    }

    // Return the final string
    return result.toString();
  }

  public static String stringToLowercase(String string) {

    // Used to build the lowercase version
    StringBuilder result = new StringBuilder();

    // Loop through each character
    for (int i = 0; i < string.length(); i++) {
      char c = string.charAt(i);

      // Convert uppercase letters to lowercase
      if (c >= 'A' && c <= 'Z') {
        result.append((char) (c + 32));
      } else {
        // Keep everything else the same
        result.append(c);
      }
    }

    return result.toString();
  }

  public static String backwardString(String string) {

    // Get the length of the string
    int len = string.length();

    // List to store characters in reverse order
    List<Character> backwarded = new ArrayList<>();

    // Loop backwards from the end of the string
    for (int i = len - 1; i >= 0; i--) {
      char letter = string.charAt(i);
      backwarded.add(letter);
    }

    // Build the reversed string
    StringBuilder sb = new StringBuilder();
    for (char c : backwarded) {
      sb.append(c);
    }

    // Convert to normal string and return
    String result = sb.toString();
    return result;
  }

  public static String searchSubstring(String string, Scanner s) {

    // Clear leftover newline from previous input
    s.nextLine();

    // Ask user for the substring to search for
    System.out.println("input a substring: ");
    String substring = s.nextLine();

    // Check if the main string contains the substring
    if (string.contains(substring)) {
      return substring; // Found
    } else {
      return null; // Not found
    }
  }

  public static String concatination(String string1, String string2) {

    // Simply join the two strings together
    return string1 + string2;
  }
}

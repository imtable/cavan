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
// Operations class for temperature conversion methods
public class Operations {
  
  // clean function for converting Fahrenheit values to Celsius
  static List<Double> fToC(Scanner s) {
    List<Double> result = new ArrayList<>();
    double input;

    // Loop to collect 10 values, convert it, and store it into output array
    for (int x = 0; x < 10; x++) {
      System.out.print("Please enter " + (x + 1) + " Fahrenheit value: ");
      input = s.nextDouble();
      double convertedInput = (input - 32) * 5 / 9;
      double roundedInput = Math.round(convertedInput * 100.0) / 100.0;
      result.add(roundedInput);
    }
    return result;
  }

  // clean function for converting Celsius values to Fahrenheit
  static List<Double> cToF(Scanner s) {
    List<Double> result = new ArrayList<>();
    double input;

    // Loop to collect 10 values, convert it, and store it into output array
    for (int x = 0; x < 10; x++) {
      System.out.print("Please enter " + (x + 1) + " Celsius value: ");
      input = s.nextDouble();
      double convertedInput = input / 5 * 9 + 32;
      double roundedInput = Math.round(convertedInput * 100.0) / 100.0;
      result.add(roundedInput);
    }
    return result;
  }
}

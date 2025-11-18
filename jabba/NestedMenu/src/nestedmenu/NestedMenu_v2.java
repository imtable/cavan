/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedmenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CI20250986
 */
public class NestedMenu {

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
  }

  public static void cToF(Scanner s) {
    double input;
    double result;

    System.out.print("Please enter Celsius value: ");
    input = s.nextDouble();
    result = 1.8 * input + 32;
    System.out.println("in F it would be: " + result);
  }

  public static void fToC(Scanner s) {
    double input;
    double result;

    System.out.print("Please enter F value: ");
    input = s.nextDouble();
    result = (input - 32) / 9 * 5;
    System.out.println("in C it would be: " + result);
  }

  public static void mToKms(Scanner s) {
    double input;
    double result;

    System.out.print("Please enter Miles value: ");
    input = s.nextDouble();
    result = input * 1.609344;
    System.out.println("in Kilometers it would be: " + result);
  }

  public static void kmsToM(Scanner s) {
    double input;
    double result;

    System.out.print("Please enter Kilometers value: ");
    input = s.nextDouble();
    result = input * 0.62137119;
    System.out.println("in Miles it would be: " + result);
  }

  public static void temperatureCalc(Scanner s) {
    List<String> printerStrings = new ArrayList<>();
    printerStrings.add("1) C->F");
    printerStrings.add("2) F->C");
    View.printer(printerStrings);

    int answer = s.nextInt();

    if (answer == 0) {
      View.exiting();
    }
    if (answer == 1) {
      cToF(s);
    }
    if (answer == 2) {
      fToC(s);
    }
    if (answer > 2 || answer < 0) {
      View.wrongAnswer();
    }
  }

  public static void distanceCalc(Scanner s) {
    List<String> printerStrings = new ArrayList<>();
    printerStrings.add("1) M->KMS");
    printerStrings.add("2) KMS->M");
    View.printer(printerStrings);

    int answer = s.nextInt();

    if (answer == 0) {
      View.exiting();
    }
    if (answer == 1) {
      mToKms(s);
    }
    if (answer == 2) {
      kmsToM(s);
    }
    if (answer > 2 || answer < 0) {
      View.wrongAnswer();
    }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Hello, World. It's temperature and distance converter.");

    List<String> printerStrings = new ArrayList<>();
    printerStrings.add("1) convert temerature");
    printerStrings.add("2) convert distance");
    View.printer(printerStrings);

    Scanner s = new Scanner(System.in);
    int answer = s.nextInt();

    switch (answer) {
      case 0 ->
        View.exiting();
      case 1 ->
        temperatureCalc(s);
      case 2 ->
        distanceCalc(s);
      default ->
        View.wrongAnswer();
    }
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedmenu;

import java.util.Scanner;

/**
 *
 * @author CI20250986
 */
public class NestedMenu {
public static void temperatureCalc() {
    int answer;
    double input;
    double result;

    System.out.println("Please choose an option:");
    System.out.println("1) C->F");
    System.out.println("2) F->C");
    System.out.println("3) Exit");
    System.out.print("Please enter option: ");

    Scanner s = new Scanner(System.in);
    answer = s.nextInt();
      
    if (answer == 1) {
      System.out.print("Please enter Celsius value: ");
      input = s.nextDouble();
      result = 1.8 * input + 32;
      System.out.println("in F it would be: " + result);
    }
    if (answer == 2) {
      System.out.print("Please enter F value: ");
      input = s.nextDouble();
      result = (input - 32) / 9 * 5;
      System.out.println("in C it would be: " + result);
    }
    if (answer == 3) {
      System.out.println("exiting..");
      return;
    }
    if (answer > 3 || answer < 1) {
      System.out.println("Wrong decision, BOOM!");
    }
  }

  public static void distanceCalc() {
    int answer;
    double input;
    double result;

    System.out.println("Please choose an option:");
    System.out.println("1) M->KMS");
    System.out.println("2) KMS->M");
    System.out.println("3) Exit");
    System.out.print("Please enter option: ");

    Scanner s = new Scanner(System.in);
    answer = s.nextInt();

    if (answer == 1) {
      System.out.print("Please enter Miles value: ");
      input = s.nextDouble();
      result = input * 1.609344;
      System.out.println("in Kilometers it would be: " + result);
    }
    if (answer == 2) {
      System.out.print("Please enter Kilometers value: ");
      input = s.nextDouble();
      result = input * 0.62137119;
      System.out.println("in Miles it would be: " + result);
    }
    if (answer == 3) {
      System.out.println("exiting..");
      return;
    }
    if (answer > 3 || answer < 1) {
      System.out.println("Wrong decision, BOOM!");
    }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int answer;

    System.out.println("Please choose an option:");
    System.out.println("1) convert temerature");
    System.out.println("2) convert distance");
    System.out.println("3) Exit");
    System.out.print("Please enter option: ");

    Scanner s = new Scanner(System.in);
    answer = s.nextInt();
    
    switch (answer) {
      case 1 -> temperatureCalc();
      case 2 -> distanceCalc();
      case 3 -> System.out.println("exiting..");
      default -> System.out.println("Wrong decision, BOOM!");
    }
  }
}

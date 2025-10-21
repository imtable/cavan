/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biggestofthree;

import java.util.Scanner;

/**
 *
 * @author CI20250986
 */
public class BiggestOfThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num1, num2, num3;
        
        System.out.print("enter a first number: ");
        num1 = s.nextInt();
        
        System.out.print("enter a second number: ");
        num2 = s.nextInt();
        
        System.out.print("enter a third number: ");
        num3 = s.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Biggest is num1: " + num1);
            } else {
                System.out.println("Biggest is num3: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("Biggest is num2: " + num2);
            } else {
                System.out.println("Biggest is num3: " + num3);
            }
        }
    }
}

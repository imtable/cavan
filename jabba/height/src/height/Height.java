/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package height;

/**
 *
 * @author CI20250986
 */

import java.util.Scanner;

public class Height {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double feet, inch, totalInch, cm;
        
        System.out.println("enter your name: ");
        name = input.nextLine();

        System.out.println("enter your height in feet: ");
        feet = input.nextDouble();
        
        System.out.println("enter inches above "+feet+" feet:");
        inch = input.nextDouble();
        
        totalInch = feet * 12 + inch;
        cm = totalInch * 2.54 / 100;
        System.out.println("Hi, "+name+ ". Your height in metric is "+cm+" m");
    }
    
}

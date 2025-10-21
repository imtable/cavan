/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author ci20250986
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int answer;
        double result;
        
        System.out.println("Please choose an option:");
        System.out.println("1)	C->F");
 	System.out.println("2)	F->C");
        System.out.println("3)	Exit");
 	System.out.print("Please enter option: ");
        
        Scanner s = new Scanner(System.in);
        answer = s.nextInt();
        
        switch (answer) {
        case 1:
            double input;
            System.out.print("Please enter Celsius value: ");
            input = s.nextDouble();
            result = input * 33.8;
            System.out.println("in F it would be: " + result);
            break;
        case 2:
            double input2;
            System.out.print("Please enter F value: ");
            input2 = s.nextDouble();
            result = input2 / 33.8;
            System.out.println("in C it would be: " + result);
            break;
        case 3:
            System.out.println("exiting..");
            break;
        default:
            System.out.println("Wrong decision, BOOM!");
        }
    }
}

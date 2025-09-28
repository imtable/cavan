/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average;

/**
 *
 * @author imtable
 */
import java.util.Scanner;

public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("enter first number: ");
        int firstNum = s.nextInt();
        
        System.out.print("enter second number: ");
        int secondNum = s.nextInt();
        
        double avg = (firstNum + secondNum) / 2.0;
        System.out.println("the average is: " + avg);
    }
    
}

// task:
// The average (arithmetic mean) of two numbers is calculated by adding them up and
// dividing by 2. Write a program to ask a user to enter two numbers, compute their
// average and print out the result.
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distance;

/**
 *
 * @author imtable
 */

import java.util.Scanner;

public class Distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dist, result;
        double tmp;

        System.out.println("enter distance to college: ");
        dist = input.nextInt();
        
        tmp = dist * 1.609344;
        result = (int) Math.round(tmp);
        
        String text1 = "distance to the college in km is ";
        System.out.println("distance to the college in km is " + result);
    }
    
}

// Write a program to ask the user to input the distance from their house to the college in miles. 
// The program will calculate the equivalent distance in kilometres and display the answer to the user.
// 1 mile = 1.6kms
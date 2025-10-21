/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biggestof3;

import java.util.Scanner;

/**
 *
 * @author CI20250986
 */
public class BiggestOf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
               
        int num;
        int biggest = Integer.MIN_VALUE;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("enter a number " + (i + 1) + ": ");
            num = s.nextInt();
            
                
            if (num > biggest)
                biggest = i + 1;
        }
        System.out.println(biggest + " number is biggest");
    }
}

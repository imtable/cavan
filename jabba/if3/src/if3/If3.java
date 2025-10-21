/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if3;

import java.util.Scanner;

/**
 *
 * @author CI20250986
 */
public class If3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int failed, passed, merit, distinct, validMin, validMax;
        failed = 49;
        passed = 64;
        merit = 79;
        distinct = 100;
        validMin = 0;
        validMax = 100;
        
        System.out.print("enter your score: ");
        int score = s.nextInt();
        
        if (score < validMin || score > validMax) {
            System.out.println("not a valid value");
            return;
        }

        if (score < failed)
            System.out.println("failed");
        
        if (score > failed && score <= passed)
            System.out.println("passed");
        
        if (score > passed && score <= merit)
            System.out.println("merit");
        
        if (score > merit && score <= distinct)
            System.out.println("distinct");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2;

import java.util.Scanner;

/**
 *
 * @author CI20250986
 */
public class If2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;
        
        System.out.print("enter the age: ");
        age = s.nextInt();

        if (age < 12)
            System.out.println("child");
        
        if (age >= 13 && age <= 19)
            System.out.println("teen");
        
        if (age > 19)
            System.out.println("adult");
    }
    
}

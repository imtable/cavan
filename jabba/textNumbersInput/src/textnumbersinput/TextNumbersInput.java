/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textnumbersinput;

import java.util.Scanner;

/**
 *
 * @author CI20250986
 */
public class TextNumbersInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        String userName;
        String sep = ", ";
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("enter some integer: ");
        x = input.nextInt();
        System.out.println("enter some integer: ");
        y = input.nextInt();
        System.out.println("enter some integer: ");
        z = input.nextInt();
        input.nextLine();
        System.out.println("enter your name: ");
        userName = input.nextLine();
        System.out.println(x + sep + y + sep + z);
        System.out.println("hi, " + userName);
    }
    
}

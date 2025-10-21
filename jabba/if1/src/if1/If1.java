/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if1;

/**
 *
 * @author CI20250986
 */
import java.util.Scanner;

public class If1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int firstNum, secondNum;
        
        System.out.print("enter first number: ");
        firstNum = s.nextInt();

        System.out.print("enter second number: ");
        secondNum = s.nextInt();

        if (firstNum > secondNum)
            System.out.println("condition 1 is true");
        
        if (firstNum >= secondNum)
            System.out.println("condition 2 is true");
        
        if (firstNum < secondNum)
            System.out.println("condition 3 is true");
        
        if (firstNum <= secondNum)
            System.out.println("condition 4 is true");
        
        if (firstNum != secondNum)
            System.out.println("condition 5 is true");
    }
    
}

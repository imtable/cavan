/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area;

/**
 *
 * @author CI20250986
 */
import java.util.Scanner;

public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String room, units;
        double length, width, result;
        
        System.out.println("enter what a room: ");
        room = input.nextLine();

        System.out.println("enter length of the room: ");
        length = input.nextDouble();
        System.out.println("enter width of the room: ");
        width = input.nextDouble();
        input.nextLine();
        
        System.out.println("enter untis of measurments: ");
        units = input.nextLine();
        
        result = length * width;
        
        String divider = " ";
        String text1 = "The area of the ";
        String text2 = " floor with measurments of ";
        String text3 = " is ";
        String text4 = " square";
        
        System.out.println(text1 + room + text2 + length + " x " + + width + divider + units + text3 + result + divider + units + text4);
        // System.out.println("The area of the " + room + " floor with measurments of " + length + " x " + width + divider + units + " is " + result + divider + units + " square");
    }
    
}

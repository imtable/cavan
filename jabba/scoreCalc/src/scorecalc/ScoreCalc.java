/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scorecalc;

/**
 *
 * @author CI20250986
 */

import java.util.Scanner;

public class ScoreCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int goals, points, pointedGoals, score;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("enter goals: ");
        goals = input.nextInt();
        System.out.println("enter points: ");
        points = input.nextInt();
        
        pointedGoals = goals * 3;
        score = pointedGoals + points;
        System.out.println("score is: " + score);
    }
    
}

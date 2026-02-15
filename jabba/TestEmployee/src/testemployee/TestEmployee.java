/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testemployee;

/**
 *
 * @author CI20250986
 */
public class TestEmployee {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
//      Employee e = new Employee();
      Employee e2 = new Employee("cool guy #" + i, 1999, 01, 01, 88, 188);
      
//      System.out.println(e);
      System.out.println(e2);
    }
  }
}

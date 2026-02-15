/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemployee;

/**
 *
 * @author CI20250986
 */
public class Employee {

  private String fullname;
  private MyDate dob;
  private double weight;
  private double height;

  Employee() {
    this.fullname = "john doe";
    this.dob = new MyDate(1111, 11, 11);
    this.weight = 66;
    this.height = 166;
  }

  Employee(String fullname, int y, int m, int d, double weight, double height) {
    this.fullname = fullname;
    this.dob = new MyDate(y, m, d);
    this.weight = weight;
    this.height = height;
  }

  public void setName(String n) {
    this.fullname = n;
  }

  public String getName() {
    return this.fullname;
  }

  public void setDob(MyDate m) {
    this.dob = m;
  }

  public MyDate getDob() {
    return this.dob;
  }

  public void setHeight(double h) {
    this.height = h;
  }

  public double getHeight() {
    return this.height;
  }

  public void setWeight(double w) {
    this.weight = w;
  }

  public double getWeight() {
    return this.weight;
  }

  public String calculateBmi() {
    double bmi = this.weight / this.height;
    String cat = "";
    if (bmi < 18.5) {
      cat = "underweight";
    }
    if (bmi < 25 && bmi >= 18.5) {
      cat = "normal";
    }

    if (bmi < 30 && bmi >= 25) {
      cat = "overweight";
    }

    if (bmi > 30) {
      cat = "obese";
    }

    return cat;
  }

  public String toString() {
    return "Name: " + fullname + ", dob: " + String.format("%s",dob);
  }
}
